package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7726a;

import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.speech.C90532c;
import com.google.android.apps.gsa.shared.speech.C90602j;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.speech.audio.C92203n;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.libraries.assistant.hotword.C18381r;
import com.google.android.libraries.assistant.hotword.C18382s;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.search.p2904c.p2951n.C37899a;
import com.google.android.libraries.search.p2904c.p2951n.C37900b;
import com.google.android.libraries.search.p2904c.p2951n.C37901c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.micro.C67363a;
import com.google.speech.micro.GoogleEndpointer;
import com.google.speech.micro.GoogleEndpointerData;
import com.google.speech.recognizer.p5233a.C67461i;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;
import dagger.C68214a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.a.b */
/* compiled from: PG */
public final /* synthetic */ class C98789b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86124t f275950a;

    /* renamed from: b */
    public final /* synthetic */ C92473f f275951b;

    /* renamed from: c */
    public final /* synthetic */ C98788a f275952c;

    /* renamed from: d */
    public final /* synthetic */ GoogleEndpointerData f275953d;

    /* renamed from: e */
    public final /* synthetic */ GoogleEndpointer f275954e;

    /* renamed from: f */
    public final /* synthetic */ C68214a f275955f;

    /* renamed from: g */
    public final /* synthetic */ C98792e f275956g;

    public /* synthetic */ C98789b(C86124t tVar, C92473f fVar, C98788a aVar, GoogleEndpointerData googleEndpointerData, GoogleEndpointer googleEndpointer, C98792e eVar, C68214a aVar2) {
        this.f275950a = tVar;
        this.f275951b = fVar;
        this.f275952c = aVar;
        this.f275953d = googleEndpointerData;
        this.f275954e = googleEndpointer;
        this.f275956g = eVar;
        this.f275955f = aVar2;
    }

    public final void run() {
        int i;
        int i2;
        C86124t tVar = this.f275950a;
        C92473f fVar = this.f275951b;
        C98788a aVar = this.f275952c;
        GoogleEndpointerData googleEndpointerData = this.f275953d;
        GoogleEndpointer googleEndpointer = this.f275954e;
        C98792e eVar = this.f275956g;
        C68214a aVar2 = this.f275955f;
        try {
            if (tVar.mo79746e(C90086ek.f250520r)) {
                C59104x b = C98793f.f275964a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "MicroEndpointerModule");
                ((C59052c) ((C59052c) b).mo56372aa(31146)).mo56386p("MicroEndpointer disabled by AAE flag.");
                googleEndpointer.close();
            } else if (!fVar.f258009E.mo84365by() || !fVar.f258009E.mo84411cr()) {
                if (tVar.mo79746e(C90082eg.f250023cg)) {
                    if (!fVar.f258035w) {
                        C59104x b2 = C98793f.f275964a.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "MicroEndpointerModule");
                        ((C59052c) ((C59052c) b2).mo56372aa(31144)).mo56386p("MicroEndpointer disabled by session params.");
                        googleEndpointer.close();
                        return;
                    }
                }
                C90748e.m148224b();
                if (aVar.f275947c.mo56113h()) {
                    InputStream c = aVar.f275948d.c((C74458k) aVar.f275947c.mo56107c());
                    if (aVar.f275946b > 1) {
                        c = new C92203n(c, aVar.f275946b);
                    }
                    int idealBufferBytes = googleEndpointerData.idealBufferBytes();
                    int i3 = aVar.f275945a;
                    int i4 = (idealBufferBytes * 1000) / (((i3 + i3) / 1000) * 1000);
                    int i5 = (i4 + SimpleSnackbar.LENGTH_SHORT) * i3;
                    C18382s sVar = new C18382s(idealBufferBytes, (i5 + i5) / 1000, 2, 1);
                    if (i4 >= 200) {
                        i = 1;
                    } else {
                        i = 200 / i4;
                    }
                    int i6 = 0;
                    char c2 = 10;
                    long j = 0;
                    while (true) {
                        if (!aVar.f275949e) {
                            break;
                        }
                        C18381r a = sVar.mo23887a(c);
                        GoogleEndpointer.GoogleEndpointerResult process = googleEndpointer.process(sVar.mo23890d(), a.f52173a, a.f52174b);
                        i6++;
                        C18382s sVar2 = sVar;
                        long j2 = j + ((long) i4);
                        InputStream inputStream = c;
                        if (a.f52174b != idealBufferBytes) {
                            C67461i iVar = (C67461i) C67464l.f183356e.createBuilder();
                            C67463k kVar = C67463k.END_OF_AUDIO;
                            iVar.copyOnWrite();
                            C67464l lVar = (C67464l) iVar.instance;
                            lVar.f183359b = kVar.f183355e;
                            lVar.f183358a |= 1;
                            eVar.f275963a.mo70941c(new C90532c((C67464l) iVar.build(), new C90607o(7, (byte[]) null, 0)));
                            break;
                        }
                        if (i6 % i == 0) {
                            i2 = idealBufferBytes;
                            eVar.f275963a.mo70941c(new C90602j(7, j2));
                        } else {
                            i2 = idealBufferBytes;
                        }
                        if (c2 == 10 && process.getEvent() == C67363a.SPEECH) {
                            eVar.mo91301a(process);
                            c2 = 20;
                        } else if (c2 == 20 && process.getEvent() == C67363a.NO_SPEECH) {
                            eVar.mo91301a(process);
                            c2 = 30;
                        }
                        c = inputStream;
                        idealBufferBytes = i2;
                        j = j2;
                        sVar = sVar2;
                    }
                    googleEndpointer.close();
                    return;
                }
                throw new C90457d("AudioListeningSessionAdapter is empty.", (int) C89885b.AUDIO_DATA_FAILED_INITIALIZATION_VALUE);
            } else {
                C59104x b3 = C98793f.f275964a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "MicroEndpointerModule");
                ((C59052c) ((C59052c) b3).mo56372aa(31145)).mo56386p("MicroEndpointer disabled because provided pre-encoded audio from GACS.");
                googleEndpointer.close();
            }
        } catch (C90457d e) {
            C90457d dVar = e;
            C59104x c3 = C98793f.f275964a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "MicroEndpointerModule");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(dVar)).mo56372aa(31139)).mo56386p("MicroEndpointer failed for GsaIOException");
            ((C89911f) aVar2.mo27525b()).mo83756b(dVar).mo83721a();
            googleEndpointer.close();
        } catch (C37899a e2) {
            C37899a aVar3 = e2;
            C59104x c4 = C98793f.f275964a.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "MicroEndpointerModule");
            ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(aVar3)).mo56372aa(31140)).mo56386p("MicroEndpointer failed for AudioAccessorInitializationFailedException");
            ((C89911f) aVar2.mo27525b()).mo83756b(new C90457d((Throwable) aVar3, (int) C89885b.f246268x31d54ae2)).mo83721a();
            googleEndpointer.close();
        } catch (C37901c e3) {
            C37901c cVar = e3;
            C59104x c5 = C98793f.f275964a.mo56225c();
            c5.mo56378ag(C58975e.f156826a, "MicroEndpointerModule");
            ((C59052c) ((C59052c) ((C59052c) c5).mo56382g(cVar)).mo56372aa(31141)).mo56386p("MicroEndpointer failed for AudioBufferOverflowException");
            ((C89911f) aVar2.mo27525b()).mo83756b(new C90457d((Throwable) cVar, (int) C89885b.AUDIO_DATA_FAILED_READ_MICROENDPOINTER_BUFFER_OVERFLOW_VALUE)).mo83721a();
            googleEndpointer.close();
        } catch (C37900b e4) {
            C37900b bVar = e4;
            C59104x c6 = C98793f.f275964a.mo56225c();
            c6.mo56378ag(C58975e.f156826a, "MicroEndpointerModule");
            ((C59052c) ((C59052c) ((C59052c) c6).mo56382g(bVar)).mo56372aa(31142)).mo56386p("MicroEndpointer failed for AudioAccessorReadInterruptedException");
            ((C89911f) aVar2.mo27525b()).mo83756b(new C90457d((Throwable) bVar, (int) C89885b.f246269xd30f67f8)).mo83721a();
            googleEndpointer.close();
        } catch (IOException e5) {
            IOException iOException = e5;
            C59104x c7 = C98793f.f275964a.mo56225c();
            c7.mo56378ag(C58975e.f156826a, "MicroEndpointerModule");
            ((C59052c) ((C59052c) ((C59052c) c7).mo56382g(iOException)).mo56372aa(31143)).mo56386p("MicroEndpointer failed for IOException");
            ((C89911f) aVar2.mo27525b()).mo83756b(new C90457d((Throwable) iOException, (int) C89885b.AUDIO_INPUT_STREAM_READ_VALUE)).mo83721a();
            googleEndpointer.close();
        } catch (Throwable th) {
            Throwable th2 = th;
            googleEndpointer.close();
            throw th2;
        }
    }
}
