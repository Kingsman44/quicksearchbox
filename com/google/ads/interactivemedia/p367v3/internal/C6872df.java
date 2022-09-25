package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.df */
/* compiled from: PG */
public final class C6872df {

    /* renamed from: a */
    public final Uri f21849a;

    /* renamed from: b */
    public final String f21850b;

    /* renamed from: c */
    public final C6870dd f21851c = null;

    /* renamed from: d */
    public final List f21852d;

    /* renamed from: e */
    public final String f21853e;

    /* renamed from: f */
    public final List f21854f;

    /* renamed from: g */
    public final Uri f21855g;

    /* renamed from: h */
    public final Object f21856h;

    public /* synthetic */ C6872df(Uri uri, String str, C6870dd ddVar, List list, List list2) {
        this.f21849a = uri;
        this.f21850b = str;
        this.f21852d = list;
        this.f21853e = null;
        this.f21854f = list2;
        this.f21855g = null;
        this.f21856h = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6872df)) {
            return false;
        }
        C6872df dfVar = (C6872df) obj;
        if (this.f21849a.equals(dfVar.f21849a) && aeu.m18533c(this.f21850b, dfVar.f21850b)) {
            C6870dd ddVar = dfVar.f21851c;
            if (aeu.m18533c((Object) null, (Object) null) && this.f21852d.equals(dfVar.f21852d)) {
                String str = dfVar.f21853e;
                if (aeu.m18533c((Object) null, (Object) null) && this.f21854f.equals(dfVar.f21854f)) {
                    Uri uri = dfVar.f21855g;
                    if (aeu.m18533c((Object) null, (Object) null)) {
                        Object obj2 = dfVar.f21856h;
                        if (aeu.m18533c((Object) null, (Object) null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f21849a.hashCode() * 31;
        String str = this.f21850b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return (((((hashCode + i) * 961) + this.f21852d.hashCode()) * 961) + this.f21854f.hashCode()) * 961;
    }
}
