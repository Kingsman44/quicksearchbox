package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import com.google.android.apps.gsa.shared.speech.C90532c;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.speech.audio.C92203n;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.common.p4541l.C59337t;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.micro.C67363a;
import com.google.speech.micro.GoogleEndpointer;
import com.google.speech.micro.GoogleEndpointerData;
import com.google.speech.recognizer.p5233a.C67461i;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.d */
/* compiled from: PG */
public final class C103542d implements C57981b {

    /* renamed from: a */
    public final InputStream f288482a;

    /* renamed from: b */
    public final GoogleEndpointerData f288483b;

    /* renamed from: c */
    public final GoogleEndpointer f288484c;

    /* renamed from: d */
    public final long f288485d;

    /* renamed from: e */
    public final int f288486e;

    /* renamed from: f */
    public volatile boolean f288487f = true;

    /* renamed from: g */
    private final C60887da f288488g;

    /* renamed from: h */
    private C103541c f288489h;

    /* renamed from: i */
    private C60870cx f288490i;

    public C103542d(C92460b bVar, InputStream inputStream, GoogleEndpointerData googleEndpointerData, GoogleEndpointer googleEndpointer, C60887da daVar, long j) {
        int bitCount = Integer.bitCount(bVar.mo87190a());
        if (bitCount > 1) {
            this.f288482a = new C92203n(inputStream, bitCount);
        } else {
            this.f288482a = inputStream;
        }
        this.f288486e = bVar.mo87195f();
        this.f288483b = googleEndpointerData;
        this.f288484c = googleEndpointer;
        this.f288488g = daVar;
        this.f288485d = j;
    }

    /* renamed from: c */
    public final void mo93813c(boolean z, Throwable th) {
        this.f288487f = false;
        C59337t.m92221a(this.f288482a);
        this.f288484c.close();
        C103541c cVar = this.f288489h;
        if (cVar == null) {
            return;
        }
        if (th != null) {
            cVar.mo54585e(th);
        } else {
            cVar.mo54584d(z);
        }
    }

    /* renamed from: d */
    public final boolean mo93814d(GoogleEndpointer.GoogleEndpointerResult googleEndpointerResult) {
        C67463k kVar;
        C103541c cVar = this.f288489h;
        if (cVar == null || !cVar.f155044c.get()) {
            mo93813c(true, (Throwable) null);
            return false;
        }
        C67363a event = googleEndpointerResult.getEvent();
        C90607o oVar = new C90607o(7, (byte[]) null, googleEndpointerResult.getEventTimestampMs());
        C67461i iVar = (C67461i) C67464l.f183356e.createBuilder();
        if (event == C67363a.SPEECH) {
            kVar = C67463k.START_OF_SPEECH;
        } else {
            kVar = C67463k.END_OF_UTTERANCE;
        }
        iVar.copyOnWrite();
        C67464l lVar = (C67464l) iVar.instance;
        lVar.f183359b = kVar.f183355e;
        lVar.f183358a |= 1;
        this.f288489h.mo54583c(new C90532c((C67464l) iVar.build(), oVar));
        return true;
    }

    /* renamed from: e */
    public final boolean mo93815e(long j) {
        C103541c cVar = this.f288489h;
        if (cVar == null || !cVar.f155044c.get()) {
            mo93813c(true, (Throwable) null);
            return false;
        }
        C90607o oVar = new C90607o(7, (byte[]) null, j);
        this.f288489h.mo54583c(new C90532c(C67464l.f183356e, oVar));
        return true;
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C103541c cVar = new C103541c(this, aVar);
        aVar.mo20338d(cVar);
        if (!this.f288487f) {
            cVar.mo21018g();
            return cVar.f155043b;
        } else if (this.f288489h != null) {
            cVar.mo54585e(new UnsupportedOperationException("MicroEndpointer is an one shot source."));
            return cVar.f155043b;
        } else {
            this.f288489h = cVar;
            C60870cx b = this.f288488g.mo19399b(new C103523a(this));
            this.f288490i = b;
            C60856cj.m92911t(b, new C103540b(this), this.f288488g);
            return cVar.f155043b;
        }
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        C60870cx cxVar = this.f288490i;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        C103541c cVar = this.f288489h;
        if (cVar != null && cVar.f155044c.get()) {
            this.f288489h.mo21018g();
        }
        this.f288487f = false;
    }
}
