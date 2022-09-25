package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.view.View;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.c */
/* compiled from: PG */
final class C27161c extends C27142ar {

    /* renamed from: a */
    public final String f74240a;

    /* renamed from: b */
    public final String f74241b;

    /* renamed from: c */
    public final String f74242c;

    /* renamed from: d */
    public final String f74243d;

    /* renamed from: e */
    public final View.OnClickListener f74244e;

    /* renamed from: f */
    public final View.OnClickListener f74245f;

    public C27161c(String str, String str2, String str3, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        if (str != null) {
            this.f74240a = str;
            if (str2 != null) {
                this.f74241b = str2;
                if (str3 != null) {
                    this.f74242c = str3;
                    this.f74243d = BuildConfig.FLAVOR;
                    if (onClickListener != null) {
                        this.f74244e = onClickListener;
                        this.f74245f = onClickListener2;
                        return;
                    }
                    throw new NullPointerException("Null filledButtonOnClickListener");
                }
                throw new NullPointerException("Null filledButtonText");
            }
            throw new NullPointerException("Null bodyText");
        }
        throw new NullPointerException("Null headerText");
    }

    /* renamed from: a */
    public final View.OnClickListener mo32569a() {
        return this.f74244e;
    }

    /* renamed from: b */
    public final View.OnClickListener mo32570b() {
        return this.f74245f;
    }

    /* renamed from: c */
    public final String mo32571c() {
        return this.f74241b;
    }

    /* renamed from: d */
    public final String mo32572d() {
        return this.f74242c;
    }

    /* renamed from: e */
    public final String mo32573e() {
        return this.f74240a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27142ar) {
            C27142ar arVar = (C27142ar) obj;
            return this.f74240a.equals(arVar.mo32573e()) && this.f74241b.equals(arVar.mo32571c()) && this.f74242c.equals(arVar.mo32572d()) && this.f74243d.equals(arVar.mo32574f()) && this.f74244e.equals(arVar.mo32569a()) && this.f74245f.equals(arVar.mo32570b());
        }
    }

    /* renamed from: f */
    public final String mo32574f() {
        return this.f74243d;
    }

    public final int hashCode() {
        return ((((((((((this.f74240a.hashCode() ^ 1000003) * 1000003) ^ this.f74241b.hashCode()) * 1000003) ^ this.f74242c.hashCode()) * 1000003) ^ this.f74243d.hashCode()) * 1000003) ^ this.f74244e.hashCode()) * 1000003) ^ this.f74245f.hashCode();
    }

    public final String toString() {
        String str = this.f74240a;
        String str2 = this.f74241b;
        String str3 = this.f74242c;
        String str4 = this.f74243d;
        String obj = this.f74244e.toString();
        String obj2 = this.f74245f.toString();
        return "OfflineItemModel{headerText=" + str + ", bodyText=" + str2 + ", filledButtonText=" + str3 + ", outlinedButtonText=" + str4 + ", filledButtonOnClickListener=" + obj + ", outlinedButtonOnClickListener=" + obj2 + "}";
    }
}
