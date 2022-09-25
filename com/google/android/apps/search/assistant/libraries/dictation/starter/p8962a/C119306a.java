package com.google.android.apps.search.assistant.libraries.dictation.starter.p8962a;

import com.google.android.apps.gsa.staticplugins.accl.performers.p7350k.C93206e;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119275ak;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119288j;
import com.google.android.apps.search.assistant.libraries.dictation.starter.C119336d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126322bc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.starter.a.a */
/* compiled from: PG */
final class C119306a implements C70862aj {

    /* renamed from: a */
    public static final C59071e f332685a = C59071e.m91332i("com.google.android.apps.search.assistant.libraries.dictation.starter.a.a");

    /* renamed from: b */
    public final AtomicBoolean f332686b = new AtomicBoolean(false);

    /* renamed from: c */
    C126322bc f332687c = null;

    /* renamed from: d */
    private final C93206e f332688d;

    public C119306a(C93206e eVar) {
        this.f332688d = eVar;
    }

    /* renamed from: e */
    private final void m197998e() {
        C126322bc bcVar = this.f332687c;
        if (bcVar != null) {
            bcVar.mo107531a();
        }
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f332686b.set(true);
    }

    /* renamed from: b */
    public final synchronized void mo20122b(Throwable th) {
        this.f332686b.set(true);
        ((C59052c) ((C59052c) ((C59052c) f332685a.mo56225c()).mo56382g(th)).mo56372aa(34354)).mo56386p("Dictation control connection error. [SD]");
        this.f332688d.mo87568c(C119336d.FAILURE);
    }

    /* renamed from: d */
    public final synchronized void mo20123c(C119288j jVar) {
        if (jVar.f332644a == 3) {
            this.f332688d.mo87568c(C119336d.ABOUT_TO_START);
        }
        if (jVar.f332644a == 1) {
            C63122a a = C63122a.m96183a(((C119275ak) jVar.f332645b).f332623a);
            if (a == null) {
                a = C63122a.UNRECOGNIZED;
            }
            if (a.equals(C63122a.SUCCESS_STARTED)) {
                this.f332688d.mo87568c(C119336d.STARTED);
            } else {
                this.f332688d.mo87568c(C119336d.FAILURE);
                m197998e();
            }
        }
        if (jVar.f332644a == 4) {
            this.f332688d.mo87568c(C119336d.FIRST_TEXT);
        }
        if (jVar.f332644a == 5) {
            this.f332688d.mo87568c(C119336d.SUCCESS_ACTION);
        }
        if (jVar.f332644a == 2) {
            this.f332688d.mo87568c(C119336d.STOPPED);
            m197998e();
        }
    }
}
