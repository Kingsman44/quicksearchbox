package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d;

import com.google.assistant.p3781ad.p3787c.p3788a.C48512bd;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import java.util.Collections;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.d.w */
/* compiled from: PG */
public final class C121457w extends C121435a {

    /* renamed from: c */
    private volatile transient C58495hd f337115c;

    /* renamed from: d */
    private volatile transient long f337116d;

    /* renamed from: e */
    private volatile transient boolean f337117e;

    /* renamed from: f */
    private volatile transient float f337118f;

    /* renamed from: g */
    private volatile transient boolean f337119g;

    /* renamed from: h */
    private volatile transient long f337120h;

    /* renamed from: i */
    private volatile transient boolean f337121i;

    public C121457w(C48512bd bdVar) {
        super(bdVar);
    }

    /* renamed from: b */
    public final float mo105154b() {
        if (!this.f337119g) {
            synchronized (this) {
                if (!this.f337119g) {
                    this.f337118f = ((Float) Collection.EL.stream(Collections.unmodifiableMap(this.f337091a.f125326b).values()).filter(C121446l.f337101a).map(C121447m.f337102a).min(Comparator.CC.naturalOrder()).orElse(Float.valueOf(0.0f))).floatValue();
                    this.f337119g = true;
                }
            }
        }
        return this.f337118f;
    }

    /* renamed from: c */
    public final long mo105155c() {
        if (!this.f337117e) {
            synchronized (this) {
                if (!this.f337117e) {
                    this.f337116d = ((Long) Collection.EL.stream(Collections.unmodifiableMap(this.f337091a.f125326b).values()).filter(C121439e.f337094a).map(C121440f.f337095a).min(Comparator.CC.naturalOrder()).orElse(0L)).longValue();
                    this.f337117e = true;
                }
            }
        }
        return this.f337116d;
    }

    /* renamed from: d */
    public final long mo105156d() {
        if (!this.f337121i) {
            synchronized (this) {
                if (!this.f337121i) {
                    this.f337120h = ((Long) Collection.EL.stream(Collections.unmodifiableMap(this.f337091a.f125326b).values()).filter(C121441g.f337096a).map(C121442h.f337097a).min(Comparator.CC.naturalOrder()).orElse(0L)).longValue();
                    this.f337121i = true;
                }
            }
        }
        return this.f337120h;
    }

    /* renamed from: e */
    public final C58495hd mo105157e() {
        if (this.f337115c == null) {
            synchronized (this) {
                if (this.f337115c == null) {
                    this.f337115c = (C58495hd) Collection.EL.stream(Collections.unmodifiableMap(this.f337091a.f125326b).entrySet()).collect(C58370cn.m89403c(C121443i.f337098a, C121444j.f337099a, C121445k.f337100a));
                    if (this.f337115c == null) {
                        throw new NullPointerException("getAppStatByPackage() cannot return null");
                    }
                }
            }
        }
        return this.f337115c;
    }
}
