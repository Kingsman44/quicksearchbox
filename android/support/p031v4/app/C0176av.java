package android.support.p031v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p027b.C0124a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p116i.p117a.p118a.C2284e;

/* renamed from: android.support.v4.app.av */
/* compiled from: PG */
final class C0176av implements LayoutInflater.Factory2 {

    /* renamed from: a */
    final FragmentManager f747a;

    public C0176av(FragmentManager fragmentManager) {
        this.f747a = fragmentManager;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0209ca caVar;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f747a);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0124a.f322a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0173as.m391c(context.getClassLoader(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1) {
            if (resourceId != -1) {
                i = -1;
            } else if (string != null) {
                i = -1;
                resourceId = -1;
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
        }
        if (resourceId != -1) {
            fragment = this.f747a.f634a.mo670b(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f747a.f634a.mo671c(string);
        }
        if (fragment == null && i != -1) {
            fragment = this.f747a.f634a.mo670b(i);
        }
        if (fragment == null) {
            fragment = this.f747a.mo475h().mo586a(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : i;
            fragment.mContainerId = i;
            fragment.mTag = string;
            fragment.mInLayout = true;
            fragment.mFragmentManager = this.f747a;
            FragmentManager fragmentManager = this.f747a;
            fragment.mHost = fragmentManager.f647n;
            fragment.onInflate(fragmentManager.f647n.f742c, attributeSet, fragment.mSavedFragmentState);
            caVar = this.f747a.mo477j(fragment);
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            fragment.mFragmentManager = this.f747a;
            FragmentManager fragmentManager2 = this.f747a;
            fragment.mHost = fragmentManager2.f647n;
            fragment.onInflate(fragmentManager2.f647n.f742c, attributeSet, fragment.mSavedFragmentState);
            caVar = this.f747a.mo478k(fragment);
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C2284e.m6221b(fragment, viewGroup);
        fragment.mContainer = viewGroup;
        caVar.mo664e();
        caVar.mo663d();
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            fragment.mView.addOnAttachStateChangeListener(new C0175au(this, caVar));
            return fragment.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
