package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.C3825ax;
import androidx.navigation.C3868ci;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.fragment.b */
/* compiled from: PG */
public final class C3878b extends C3825ax {

    /* renamed from: a */
    private String f12451a;

    public C3878b(C3868ci ciVar) {
        super(ciVar);
    }

    /* renamed from: a */
    public final void mo8035a(Context context, AttributeSet attributeSet) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(attributeSet, "attrs");
        super.mo8035a(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3885i.f12466a);
        C69664n.m101060f(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.f12451a = string;
        }
        obtainAttributes.recycle();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3878b) || !super.equals(obj) || !C69664n.m101066l(this.f12451a, ((C3878b) obj).f12451a)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final String mo8128h() {
        String str = this.f12451a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.f12451a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
