package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.C3825ax;
import androidx.navigation.C3868ci;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.fragment.d */
/* compiled from: PG */
public final class C3880d extends C3825ax {

    /* renamed from: a */
    public String f12456a;

    public C3880d(C3868ci ciVar) {
        super(ciVar);
    }

    /* renamed from: a */
    public final void mo8035a(Context context, AttributeSet attributeSet) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(attributeSet, "attrs");
        super.mo8035a(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3885i.f12467b);
        C69664n.m101060f(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.f12456a = string;
        }
        obtainAttributes.recycle();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3880d) || !super.equals(obj) || !C69664n.m101066l(this.f12456a, ((C3880d) obj).f12456a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.f12456a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.f12456a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
