package com.google.android.libraries.elements.internal;

import android.support.rastermill.FrameSequenceDrawable;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.p370af.C7492e;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.android.libraries.elements.internal.b */
/* compiled from: PG */
public final class C21341b {

    /* renamed from: a */
    public final CommandOuterClass$Command f59706a;

    /* renamed from: b */
    public final CommandOuterClass$Command f59707b;

    /* renamed from: c */
    public FrameSequenceDrawable f59708c;

    /* renamed from: d */
    public final C21313t f59709d;

    /* renamed from: e */
    private final Object f59710e;

    public C21341b(CommandOuterClass$Command commandOuterClass$Command, CommandOuterClass$Command commandOuterClass$Command2, C21313t tVar, Object obj) {
        this.f59706a = commandOuterClass$Command;
        this.f59707b = commandOuterClass$Command2;
        this.f59709d = tVar;
        this.f59710e = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21341b)) {
            return false;
        }
        C21341b bVar = (C21341b) obj;
        Object obj2 = this.f59710e;
        if (obj2 instanceof C7492e) {
            Object obj3 = bVar.f59710e;
            if (obj3 instanceof C7492e) {
                return C21359t.m40387m((C7492e) obj2, (C7492e) obj3);
            }
        }
        return obj2.equals(bVar.f59710e);
    }

    public final int hashCode() {
        return this.f59710e.hashCode();
    }
}
