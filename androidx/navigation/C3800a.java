package androidx.navigation;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: androidx.navigation.a */
/* compiled from: PG */
public final class C3800a extends C3825ax {

    /* renamed from: a */
    public Intent f12268a;

    /* renamed from: b */
    public String f12269b;

    public C3800a(C3868ci ciVar) {
        super(ciVar);
    }

    /* renamed from: a */
    public final void mo8035a(Context context, AttributeSet attributeSet) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(attributeSet, "attrs");
        super.mo8035a(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3873cn.f12439a);
        C69664n.m101060f(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
        String string = obtainAttributes.getString(4);
        if (string != null) {
            String packageName = context.getPackageName();
            C69664n.m101060f(packageName, "context.packageName");
            string = C69764m.m101231j(string, "${applicationId}", packageName);
        }
        if (this.f12268a == null) {
            this.f12268a = new Intent();
        }
        Intent intent = this.f12268a;
        C69664n.m101058d(intent);
        intent.setPackage(string);
        String string2 = obtainAttributes.getString(0);
        if (string2 != null) {
            if (string2.charAt(0) == '.') {
                string2 = C69664n.m101057c(context.getPackageName(), string2);
            }
            ComponentName componentName = new ComponentName(context, string2);
            if (this.f12268a == null) {
                this.f12268a = new Intent();
            }
            Intent intent2 = this.f12268a;
            C69664n.m101058d(intent2);
            intent2.setComponent(componentName);
        }
        String string3 = obtainAttributes.getString(1);
        if (this.f12268a == null) {
            this.f12268a = new Intent();
        }
        Intent intent3 = this.f12268a;
        C69664n.m101058d(intent3);
        intent3.setAction(string3);
        String string4 = obtainAttributes.getString(2);
        if (string4 != null) {
            Uri parse = Uri.parse(string4);
            if (this.f12268a == null) {
                this.f12268a = new Intent();
            }
            Intent intent4 = this.f12268a;
            C69664n.m101058d(intent4);
            intent4.setData(parse);
        }
        this.f12269b = obtainAttributes.getString(3);
        obtainAttributes.recycle();
    }

    /* renamed from: b */
    public final boolean mo8036b() {
        return false;
    }

    public final boolean equals(Object obj) {
        Boolean bool;
        if (obj != null && (obj instanceof C3800a) && super.equals(obj)) {
            Intent intent = this.f12268a;
            if (intent == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(intent.filterEquals(((C3800a) obj).f12268a));
            }
            if (bool != null ? bool.booleanValue() : ((C3800a) obj).f12268a == null) {
                if (C69664n.m101066l(this.f12269b, ((C3800a) obj).f12269b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        Intent intent = this.f12268a;
        int i2 = 0;
        if (intent == null) {
            i = 0;
        } else {
            i = intent.filterHashCode();
        }
        int i3 = (hashCode + i) * 31;
        String str = this.f12269b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        ComponentName componentName;
        Intent intent = this.f12268a;
        String str = null;
        if (intent == null) {
            componentName = null;
        } else {
            componentName = intent.getComponent();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (componentName != null) {
            sb.append(" class=");
            sb.append(componentName.getClassName());
        } else {
            Intent intent2 = this.f12268a;
            if (intent2 != null) {
                str = intent2.getAction();
            }
            if (str != null) {
                sb.append(" action=");
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
