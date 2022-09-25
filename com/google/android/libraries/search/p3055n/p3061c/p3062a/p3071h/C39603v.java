package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.binaries.satin.app.aqw;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37776k;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p3055n.p3087j.p3089b.C39801a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67175t;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.n.c.a.h.v */
/* compiled from: PG */
final class C39603v implements C37362b {

    /* renamed from: a */
    final /* synthetic */ C39605x f104247a;

    /* renamed from: b */
    private final Executor f104248b;

    /* renamed from: c */
    private final C2164c f104249c;

    /* renamed from: d */
    private final C58833ax f104250d;

    public C39603v(C39605x xVar, Executor executor, C2164c cVar) {
        C58833ax axVar;
        this.f104247a = xVar;
        this.f104248b = executor;
        this.f104249c = cVar;
        if (xVar.f104255b) {
            aqw aqw = xVar.f104272s;
            C67172q e = C19245ah.m36697e();
            int i = xVar.f104263j;
            e.copyOnWrite();
            C67175t tVar = (C67175t) e.instance;
            C67175t tVar2 = C67175t.f182588e;
            tVar.f182590a |= 2;
            tVar.f182592c = i;
            int i2 = xVar.f104262i;
            e.copyOnWrite();
            C67175t tVar3 = (C67175t) e.instance;
            tVar3.f182590a |= 4;
            tVar3.f182593d = i2;
            axVar = C58833ax.m90834k(aqw.a((C67175t) e.build(), new C39604w(xVar, cVar)));
        } else {
            axVar = C58836b.f156633a;
        }
        this.f104250d = axVar;
    }

    /* renamed from: k */
    public final Executor mo39011k() {
        return this.f104248b;
    }

    /* renamed from: b */
    public final void mo39010b(C37819l lVar) {
        C37680i iVar;
        C37680i iVar2;
        int i;
        C37680i iVar3;
        C37680i iVar4;
        int i2;
        C37680i iVar5;
        int a = C37776k.m66678a(lVar.f100343b);
        int i3 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i3 == 0) {
            C59081b.m91349a(TimeUnit.SECONDS, "time unit");
            if (lVar.f100343b == 1) {
                iVar = (C37680i) lVar.f100344c;
            } else {
                iVar = C37680i.f100071c;
            }
            iVar.f100074b.mo59031d();
            if (!this.f104247a.f104264k.get()) {
                C58833ax axVar = this.f104250d;
                if (axVar.mo56113h()) {
                    C39801a aVar = (C39801a) axVar.mo56107c();
                    if (lVar.f100343b == 1) {
                        iVar5 = (C37680i) lVar.f100344c;
                    } else {
                        iVar5 = C37680i.f100071c;
                    }
                    aVar.mo42017a(iVar5.f100074b);
                    return;
                }
                C59052c cVar = (C59052c) C39605x.f104254a.mo56224b();
                cVar.mo56374ac(30, TimeUnit.SECONDS);
                C59052c cVar2 = (C59052c) cVar.mo56372aa(53698);
                if (lVar.f100343b == 1) {
                    iVar2 = (C37680i) lVar.f100344c;
                } else {
                    iVar2 = C37680i.f100071c;
                }
                int d = iVar2.f100074b.mo59031d();
                C39605x xVar = this.f104247a;
                int i4 = xVar.f104262i;
                if (i4 == 0 || (i2 = xVar.f104263j) < 8000 || i2 > 384000) {
                    ((C59052c) ((C59052c) C39605x.f104254a.mo56225c()).mo56372aa(53708)).mo56386p("Incorrect Format set");
                    i = 0;
                } else {
                    i = (i4 + i4) * (i2 / 1000) * 10;
                }
                cVar2.mo56393w("#onAudioData: %s bytes, getAudioReadSize %s", d, i);
                if (lVar.f100343b == 1) {
                    iVar3 = (C37680i) lVar.f100344c;
                } else {
                    iVar3 = C37680i.f100071c;
                }
                int d2 = iVar3.f100074b.mo59031d();
                try {
                    ByteBuffer a2 = this.f104247a.f104270q.mo24395a(d2);
                    if (lVar.f100343b == 1) {
                        iVar4 = (C37680i) lVar.f100344c;
                    } else {
                        iVar4 = C37680i.f100071c;
                    }
                    a2.put(iVar4.f100074b.mo59174N(), 0, d2);
                    this.f104247a.f104256c.mo24332h(a2, d2);
                } catch (RuntimeException e) {
                    ((C59052c) ((C59052c) ((C59052c) C39605x.f104254a.mo56225c()).mo56382g(e)).mo56372aa(53699)).mo56386p("Pushing audio to Soda failed!");
                    this.f104249c.mo5439d(e);
                }
            } else {
                ((C59052c) ((C59052c) C39605x.f104254a.mo56224b()).mo56372aa(53701)).mo56386p("stopPushAudio is true. Not sending audio to Soda!");
                this.f104249c.mo5437b((Object) null);
            }
        } else if (i3 != 1) {
            if (i3 == 2) {
                ((C59052c) ((C59052c) C39605x.f104254a.mo56225c()).mo56372aa(53704)).mo56386p("Got unhandled AudioData.DATA_NOT_SET");
                this.f104249c.mo5437b((Object) null);
            }
        } else if (!this.f104247a.f104264k.get()) {
            ((C59052c) ((C59052c) C39605x.f104254a.mo56224b()).mo56372aa(53702)).mo56386p("Got END_OF_DATA even when stop not called! stopPushingAudio will be called due to the completer exception and the end of audio will be sent to Soda to stop  it in case the hotword never detected or the stop/shutdown never called.");
            if (this.f104250d.mo56113h()) {
                ((C59052c) ((C59052c) C39605x.f104254a.mo56226d()).mo56372aa(53703)).mo56386p("Using AudioBufferAndReplay failsafe to flush buffered audio!");
                ((C39801a) this.f104250d.mo56107c()).mo42018b();
            }
            this.f104249c.mo5439d(new Exception("END_OF_DATA Received before stop called!"));
            this.f104247a.mo41950b(9);
        } else {
            this.f104249c.mo5437b((Object) null);
        }
    }
}
