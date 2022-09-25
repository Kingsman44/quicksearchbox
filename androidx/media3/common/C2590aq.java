package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.common.aq */
/* compiled from: PG */
public final class C2590aq implements C2668l {

    /* renamed from: a */
    public static final C2590aq f7152a = new C2576ac().mo6082a();

    /* renamed from: b */
    public final String f7153b;

    /* renamed from: c */
    public final C2584ak f7154c;
    @Deprecated

    /* renamed from: d */
    public final C2585al f7155d;

    /* renamed from: e */
    public final C2583aj f7156e;

    /* renamed from: f */
    public final C2593at f7157f;

    /* renamed from: g */
    public final C2578ae f7158g;

    /* renamed from: h */
    public final C2586am f7159h;

    public C2590aq(String str, C2579af afVar, C2585al alVar, C2583aj ajVar, C2593at atVar, C2586am amVar) {
        this.f7153b = str;
        this.f7154c = alVar;
        this.f7155d = alVar;
        this.f7156e = ajVar;
        this.f7157f = atVar;
        this.f7158g = afVar;
        this.f7159h = amVar;
    }

    /* renamed from: a */
    public static C2590aq m6794a(Uri uri) {
        C2576ac acVar = new C2576ac();
        acVar.f7104b = uri;
        return acVar.mo6082a();
    }

    /* renamed from: b */
    public static C2590aq m6795b(String str) {
        C2576ac acVar = new C2576ac();
        acVar.mo6083b(str);
        return acVar.mo6082a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2590aq)) {
            return false;
        }
        C2590aq aqVar = (C2590aq) obj;
        return C2612ak.m6951aa(this.f7153b, aqVar.f7153b) && this.f7158g.equals(aqVar.f7158g) && C2612ak.m6951aa(this.f7154c, aqVar.f7154c) && C2612ak.m6951aa(this.f7156e, aqVar.f7156e) && C2612ak.m6951aa(this.f7157f, aqVar.f7157f) && C2612ak.m6951aa(this.f7159h, aqVar.f7159h);
    }

    public final int hashCode() {
        int hashCode = this.f7153b.hashCode() * 31;
        C2584ak akVar = this.f7154c;
        return (((((((hashCode + (akVar != null ? akVar.hashCode() : 0)) * 31) + this.f7156e.hashCode()) * 31) + this.f7158g.hashCode()) * 31) + this.f7157f.hashCode()) * 31;
    }
}
