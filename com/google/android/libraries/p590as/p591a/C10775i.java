package com.google.android.libraries.p590as.p591a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.speech.recognizer.p5233a.C67451at;

/* renamed from: com.google.android.libraries.as.a.i */
/* compiled from: PG */
public abstract class C10775i {
    /* renamed from: k */
    private final void m25786k() {
        if (mo19253c().mo56113h()) {
            mo19253c().mo56107c();
            mo19258h(C58836b.f156633a);
        }
    }

    /* renamed from: a */
    public abstract C10776j mo19251a();

    /* renamed from: b */
    public abstract C58833ax mo19252b();

    /* renamed from: c */
    public abstract C58833ax mo19253c();

    /* renamed from: d */
    public abstract C58833ax mo19254d();

    /* renamed from: e */
    public abstract C67451at mo19255e();

    /* renamed from: f */
    public abstract void mo19256f(C58833ax axVar);

    /* renamed from: g */
    public abstract void mo19257g(C67451at atVar);

    /* renamed from: h */
    public abstract void mo19258h(C58833ax axVar);

    /* renamed from: i */
    public abstract void mo19259i(C58833ax axVar);

    /* renamed from: j */
    public final C10776j mo19268j() {
        C67451at atVar = C67451at.LINEAR16;
        int ordinal = mo19255e().ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                m25786k();
                mo19255e();
                mo19254d().mo56107c();
                mo19252b().mo56107c();
            } else if (!(ordinal == 3 || ordinal == 9)) {
                if (ordinal == 10) {
                    mo19255e();
                    mo19253c().mo56107c();
                    mo19254d().mo56107c();
                    mo19252b().mo56107c();
                    long b = C10771e.m25765b((long) ((Integer) mo19253c().mo56107c()).intValue(), ((Integer) mo19252b().mo56107c()).intValue());
                    if (((long) ((Integer) mo19253c().mo56107c()).intValue()) != b) {
                        ((C59052c) ((C59052c) C10776j.f35776a.mo56226d()).mo56372aa(53938)).mo56353F("Opus encoder requested with bitrate %d instead of recommended bitrate %d. Is this an oversight when constructing the CodecConfig?", mo19253c().mo56107c(), b);
                    }
                } else {
                    String name = mo19255e().name();
                    throw new IllegalArgumentException("Unrecognized encoding: " + name + ". Please add this encoding to CodecConfig if needed.");
                }
            }
            return mo19251a();
        }
        m25786k();
        if (mo19254d().mo56113h()) {
            mo19254d().mo56107c();
            mo19259i(C58836b.f156633a);
        }
        if (mo19252b().mo56113h()) {
            mo19252b().mo56107c();
            mo19256f(C58836b.f156633a);
        }
        mo19255e();
        return mo19251a();
    }
}
