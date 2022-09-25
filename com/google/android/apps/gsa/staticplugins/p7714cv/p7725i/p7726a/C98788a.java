package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7726a;

import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.a.a */
/* compiled from: PG */
public final class C98788a {

    /* renamed from: f */
    private static final C59071e f275944f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.a.a");

    /* renamed from: a */
    public final int f275945a;

    /* renamed from: b */
    public final int f275946b;

    /* renamed from: c */
    public final C58833ax f275947c;

    /* renamed from: d */
    public final u f275948d;

    /* renamed from: e */
    public volatile boolean f275949e = true;

    public C98788a(C92460b bVar, C58833ax axVar, u uVar) {
        if (axVar.mo56113h()) {
            C92460b a = ((C74458k) axVar.mo56107c()).mo70774a();
            this.f275945a = a.mo87195f();
            this.f275946b = Integer.bitCount(a.mo87190a());
        } else {
            ((C59052c) ((C59052c) f275944f.mo56226d()).mo56372aa(31129)).mo56386p("AudioListeningSessionAdapterOptional is not present");
            int i = C90755l.f253831a;
            this.f275945a = bVar.mo87195f();
            this.f275946b = Integer.bitCount(bVar.mo87190a());
        }
        this.f275947c = axVar;
        this.f275948d = uVar;
    }
}
