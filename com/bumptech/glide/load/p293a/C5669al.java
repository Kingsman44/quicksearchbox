package com.bumptech.glide.load.p293a;

import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.p291h.C5630q;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.a.al */
/* compiled from: PG */
public final class C5669al implements C5955n {

    /* renamed from: b */
    private final Object f17096b;

    /* renamed from: c */
    private final int f17097c;

    /* renamed from: d */
    private final int f17098d;

    /* renamed from: e */
    private final Class f17099e;

    /* renamed from: f */
    private final Class f17100f;

    /* renamed from: g */
    private final C5955n f17101g;

    /* renamed from: h */
    private final Map f17102h;

    /* renamed from: i */
    private final C5960s f17103i;

    /* renamed from: j */
    private int f17104j;

    public C5669al(Object obj, C5955n nVar, int i, int i2, Map map, Class cls, Class cls2, C5960s sVar) {
        C5630q.m14607d(obj, "Argument must not be null");
        this.f17096b = obj;
        C5630q.m14607d(nVar, "Signature must not be null");
        this.f17101g = nVar;
        this.f17097c = i;
        this.f17098d = i2;
        C5630q.m14607d(map, "Argument must not be null");
        this.f17102h = map;
        C5630q.m14607d(cls, "Resource class must not be null");
        this.f17099e = cls;
        this.f17100f = cls2;
        C5630q.m14607d(sVar, "Argument must not be null");
        this.f17103i = sVar;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5669al) {
            C5669al alVar = (C5669al) obj;
            if (!this.f17096b.equals(alVar.f17096b) || !this.f17101g.equals(alVar.f17101g) || this.f17098d != alVar.f17098d || this.f17097c != alVar.f17097c || !this.f17102h.equals(alVar.f17102h) || !this.f17099e.equals(alVar.f17099e) || !this.f17100f.equals(alVar.f17100f) || !this.f17103i.equals(alVar.f17103i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f17104j;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f17096b.hashCode();
        this.f17104j = hashCode;
        int hashCode2 = (((((hashCode * 31) + this.f17101g.hashCode()) * 31) + this.f17097c) * 31) + this.f17098d;
        this.f17104j = hashCode2;
        int hashCode3 = (hashCode2 * 31) + this.f17102h.hashCode();
        this.f17104j = hashCode3;
        int hashCode4 = (hashCode3 * 31) + this.f17099e.hashCode();
        this.f17104j = hashCode4;
        int hashCode5 = (hashCode4 * 31) + this.f17100f.hashCode();
        this.f17104j = hashCode5;
        int hashCode6 = (hashCode5 * 31) + this.f17103i.f17620b.hashCode();
        this.f17104j = hashCode6;
        return hashCode6;
    }

    public final String toString() {
        String obj = this.f17096b.toString();
        int i = this.f17097c;
        int i2 = this.f17098d;
        String obj2 = this.f17099e.toString();
        String obj3 = this.f17100f.toString();
        String obj4 = this.f17101g.toString();
        int i3 = this.f17104j;
        String obj5 = this.f17102h.toString();
        String obj6 = this.f17103i.toString();
        return "EngineKey{model=" + obj + ", width=" + i + ", height=" + i2 + ", resourceClass=" + obj2 + ", transcodeClass=" + obj3 + ", signature=" + obj4 + ", hashCode=" + i3 + ", transformations=" + obj5 + ", options=" + obj6 + "}";
    }
}
