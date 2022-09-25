package androidx.core.p098j;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;
import androidx.core.p098j.p099a.C1995o;
import androidx.core.p098j.p099a.C1999s;
import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.j.c */
/* compiled from: PG */
public class C2061c {
    public static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate mBridge;
    public final View.AccessibilityDelegate mOriginalDelegate;

    public C2061c() {
        throw null;
    }

    static List getActionList(View view) {
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C1995o getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider a = C2033b.m5467a(this.mOriginalDelegate, view);
        if (a != null) {
            return new C1995o(a);
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f5921a);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List actionList = getActionList(view);
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            C1988h hVar = (C1988h) actionList.get(i2);
            if (hVar.mo5148a() != i) {
                i2++;
            } else if (hVar.f5918p != null) {
                Class cls = hVar.f5917o;
                if (cls != null) {
                    try {
                        C1999s sVar = (C1999s) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e) {
                        Class cls2 = hVar.f5917o;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(String.valueOf(cls2 == null ? "null" : cls2.getName())), e);
                    }
                }
                z = hVar.f5918p.mo5140a(view);
            }
        }
        z = false;
        if (!z) {
            z = C2033b.m5468b(this.mOriginalDelegate, view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null || (clickableSpan = (ClickableSpan) weakReference.get()) == null) {
            return false;
        }
        CharSequence text = view.createAccessibilityNodeInfo().getText();
        ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
        int i4 = 0;
        while (clickableSpanArr != null && i4 < clickableSpanArr.length) {
            if (clickableSpan.equals(clickableSpanArr[i4])) {
                clickableSpan.onClick(view);
                return true;
            }
            i4++;
        }
        return false;
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C2061c(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C1979a(this);
    }
}
