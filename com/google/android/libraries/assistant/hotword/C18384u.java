package com.google.android.libraries.assistant.hotword;

import android.content.Context;
import android.media.AudioFormat;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.nga.api.a.h;
import com.google.android.apps.gsa.nga.shared.p6339f.C81023a;
import com.google.android.apps.gsa.nga.shared.p6339f.C81066e;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81060a;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118715c;
import com.google.android.libraries.assistant.hotword.data.HotwordData;
import com.google.android.libraries.assistant.hotword.p1515a.C18326a;
import com.google.android.libraries.assistant.hotword.p1515a.C18327b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Future;

/* renamed from: com.google.android.libraries.assistant.hotword.u */
/* compiled from: PG */
public final class C18384u extends C18375l {

    /* renamed from: f */
    private static final C59071e f52185f = C59071e.m91332i("com.google.android.libraries.assistant.hotword.u");

    /* renamed from: a */
    C18380q f52186a;

    /* renamed from: b */
    final C18370g f52187b;

    /* renamed from: c */
    HotwordData f52188c = null;

    /* renamed from: d */
    ParcelFileDescriptor f52189d;

    /* renamed from: e */
    public final C118715c f52190e;

    /* renamed from: g */
    private final Object f52191g = new Object();

    /* renamed from: h */
    private final C22871g f52192h;

    /* renamed from: i */
    private boolean f52193i = false;

    /* renamed from: j */
    private final Context f52194j;

    /* renamed from: k */
    private final C18383t f52195k = new C18383t(this);

    public C18384u(C60888db dbVar, C22871g gVar, C118715c cVar, C18370g gVar2, Context context) {
        this.f52150q = dbVar;
        this.f52192h = gVar;
        this.f52190e = cVar;
        this.f52187b = gVar2;
        this.f52194j = context;
    }

    /* renamed from: a */
    public final int mo23789a(C18327b bVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo23796h();
        C18326a aVar = (C18326a) bVar;
        AudioFormat audioFormat = aVar.f51968b;
        int bitCount = Integer.bitCount(audioFormat.getChannelMask());
        int i = bitCount == 0 ? 1 : bitCount;
        if (this.f52149p == null) {
            this.f52149p = mo23881o(i);
        }
        synchronized (this.f52191g) {
            ParcelFileDescriptor j = this.f52149p.mo23855j(bVar, this.f52187b);
            this.f52189d = j;
            if (j == null) {
                C59104x d = f52185f.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MicroHwDetectionManager");
                ((C59052c) ((C59052c) d).mo56372aa(47181)).mo56386p("Unable to create parcel file descriptor");
                int i2 = C90755l.f253831a;
                return 3;
            }
            return mo23893j(audioFormat.getSampleRate(), true, aVar.f51967a, this.f52188c, i);
        }
    }

    /* renamed from: b */
    public final ParcelFileDescriptor mo23790b() {
        return this.f52189d;
    }

    /* renamed from: c */
    public final C60870cx mo23791c(int i, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        boolean z2 = false;
        if (i <= 0) {
            C59104x c = f52185f.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MicroHwDetectionManager");
            ((C59052c) ((C59052c) c).mo56372aa(47196)).mo56386p("startMicHotword - Please provide correct channel count");
        } else {
            mo23796h();
            if (this.f52149p == null) {
                if (z) {
                    this.f52149p = mo23880n(i);
                } else {
                    this.f52149p = mo23881o(i);
                }
            }
            synchronized (this.f52191g) {
                ParcelFileDescriptor a = this.f52149p.mo23807a(this.f52187b);
                this.f52189d = a;
                if (a == null) {
                    C59104x c2 = f52185f.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "MicroHwDetectionManager");
                    ((C59052c) ((C59052c) c2).mo56372aa(47195)).mo56386p("Unable to create parcel file descriptor");
                } else {
                    if (mo23893j(16000, false, 0, this.f52188c, i) == 6) {
                        z2 = true;
                    }
                }
            }
        }
        return C60856cj.m92900i(Boolean.valueOf(z2));
    }

    /* renamed from: d */
    public final void mo23792d() {
    }

    /* renamed from: e */
    public final void mo23793e(boolean z) {
        if (z != this.f52193i) {
            C18380q qVar = this.f52186a;
            if (qVar != null) {
                qVar.f52162b = z;
            }
            this.f52193i = z;
        }
    }

    /* renamed from: f */
    public final void mo23794f(HotwordData hotwordData) {
        C58976aa aaVar = C58975e.f156826a;
        this.f52188c = hotwordData;
    }

    /* renamed from: g */
    public final void mo23795g(C81066e eVar) {
        C81060a.m129009b(((C81023a) eVar).f222083b, h.h);
    }

    /* renamed from: h */
    public final void mo23796h() {
        C58976aa aaVar = C58975e.f156826a;
        mo23894p();
        C18380q qVar = this.f52186a;
        if (qVar != null) {
            C59104x b = C18380q.f52160a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HotwordRecognitionRnr");
            ((C59052c) ((C59052c) b).mo56372aa(47179)).mo56386p("Stopping hotword detection.");
            Future future = qVar.f52167g;
            if (future != null) {
                future.cancel(true);
                qVar.f52167g = null;
            }
            this.f52186a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012f, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0131, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0132, code lost:
        r2 = f52185f.mo56225c();
        r2.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MicroHwDetectionManager");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(47186)).mo56386p("Error at creating and/or starting hotword recognition.");
        mo23894p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0148, code lost:
        return 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x000b, B:6:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0131 A[ExcHandler: Exception (r0v13 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:2:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo23893j(int r17, boolean r18, long r19, com.google.android.libraries.assistant.hotword.data.HotwordData r21, int r22) {
        /*
            r16 = this;
            r1 = r16
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0 = 1
            r2 = 0
            r3 = 0
            java.lang.String r4 = "MicroHwDetectionManager"
            if (r21 != 0) goto L_0x002a
            com.google.common.f.e r5 = f52185f     // Catch:{ IllegalArgumentException -> 0x0149, Exception -> 0x0131 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ IllegalArgumentException -> 0x0149, Exception -> 0x0131 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IllegalArgumentException -> 0x0149, Exception -> 0x0131 }
            r5.mo56378ag(r6, r4)     // Catch:{ IllegalArgumentException -> 0x0149, Exception -> 0x0131 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IllegalArgumentException -> 0x0149, Exception -> 0x0131 }
            r6 = 47190(0xb856, float:6.6127E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ IllegalArgumentException -> 0x0149, Exception -> 0x0131 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IllegalArgumentException -> 0x0149, Exception -> 0x0131 }
            java.lang.String r6 = "HotwordData is not set"
            r5.mo56386p(r6)     // Catch:{ IllegalArgumentException -> 0x0149, Exception -> 0x0131 }
            r16.mo23894p()     // Catch:{ IllegalArgumentException -> 0x0149, Exception -> 0x0131 }
            return r0
        L_0x002a:
            r5 = r21
            com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData r5 = (com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData) r5     // Catch:{ IllegalArgumentException -> 0x0149, Exception -> 0x0131 }
            byte[] r5 = r5.f52057c     // Catch:{ IllegalArgumentException -> 0x0149, Exception -> 0x0131 }
            android.os.ParcelFileDescriptor r6 = r1.f52189d     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            if (r6 != 0) goto L_0x0054
            com.google.common.f.e r0 = f52185f     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r0.mo56378ag(r2, r4)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r2 = 47188(0xb854, float:6.6124E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            java.lang.String r2 = "Missing parcel file descriptor"
            r0.mo56386p(r2)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r16.mo23894p()     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r0 = 4
            return r0
        L_0x0054:
            com.google.android.apps.gsa.speech.microdetection.a.a.a r6 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7304a.C92488a.m152144a()     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r10 = 0
            r7 = r5
            r8 = r17
            r9 = r22
            r11 = r18
            com.google.speech.micro.GoogleHotwordData r6 = r6.mo87258b(r7, r8, r9, r10, r11)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r7 = r21
            com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData r7 = (com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData) r7     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r7 = r7.f52056b     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            if (r7 == 0) goto L_0x0081
            com.google.common.base.ax r8 = r7.f253284b     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            boolean r8 = r8.mo56113h()     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            if (r8 == 0) goto L_0x0081
            byte[][] r8 = new byte[r0][]     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.common.base.ax r9 = r7.f253284b     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            java.lang.Object r9 = r9.mo56107c()     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            byte[] r9 = (byte[]) r9     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r8[r3] = r9     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            goto L_0x0082
        L_0x0081:
            r8 = r2
        L_0x0082:
            if (r8 != 0) goto L_0x008a
            com.google.speech.micro.GoogleHotwordRecognizer r8 = new com.google.speech.micro.GoogleHotwordRecognizer     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r8.<init>(r6)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            goto L_0x0090
        L_0x008a:
            com.google.speech.micro.GoogleHotwordRecognizer r9 = new com.google.speech.micro.GoogleHotwordRecognizer     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r9.<init>(r6, r8)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r8 = r9
        L_0x0090:
            com.google.android.libraries.assistant.hotword.q r9 = r1.f52186a     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            if (r9 != 0) goto L_0x00a6
            com.google.android.libraries.assistant.hotword.q r9 = new com.google.android.libraries.assistant.hotword.q     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.android.libraries.assistant.hotword.t r13 = r1.f52195k     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.android.libraries.gsa.k.g r14 = r1.f52192h     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            android.content.Context r15 = r1.f52194j     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r10 = r9
            r11 = r17
            r12 = r22
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r1.f52186a = r9     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
        L_0x00a6:
            com.google.android.libraries.assistant.hotword.q r9 = r1.f52186a     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            boolean r10 = r1.f52193i     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r9.f52162b = r10     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            if (r9 != 0) goto L_0x00cd
            com.google.common.f.e r0 = f52185f     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r0.mo56378ag(r2, r4)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r2 = 47187(0xb853, float:6.6123E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            java.lang.String r2 = "Hotword runner is null"
            r0.mo56386p(r2)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r16.mo23894p()     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            return r3
        L_0x00cd:
            android.os.ParcelFileDescriptor$AutoCloseInputStream r10 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            android.os.ParcelFileDescriptor r11 = r1.f52189d     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r10.<init>(r11)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r11 = r21
            com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData r11 = (com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData) r11     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            boolean r11 = r11.f52058d     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r9.f52165e = r6     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r9.f52164d = r10     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            android.content.Context r6 = r9.f52169i     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            if (r7 == 0) goto L_0x00ec
            com.google.common.base.ax r10 = r7.f253284b     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            boolean r10 = r10.mo56113h()     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            if (r10 == 0) goto L_0x00ec
            r10 = 2
            goto L_0x00ed
        L_0x00ec:
            r10 = 0
        L_0x00ed:
            int r12 = r9.f52163c     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.speech.micro.GoogleHotwordData r13 = r9.f52165e     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.android.libraries.assistant.hotword.v r8 = com.google.android.libraries.assistant.hotword.C18387x.m35837d(r12, r10, r13, r8)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r10 = r8
            com.google.android.libraries.assistant.hotword.i r10 = (com.google.android.libraries.assistant.hotword.C18372i) r10     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r10.f52129f = r7     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            if (r7 != 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            java.lang.String r2 = r7.f253283a     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
        L_0x00ff:
            r7 = r8
            com.google.android.libraries.assistant.hotword.i r7 = (com.google.android.libraries.assistant.hotword.C18372i) r7     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r7.f52130g = r2     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r2 = r18
            r8.mo23861d(r2)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r12 = r19
            r8.mo23860c(r12)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r8.mo23859b(r6)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r8.mo23862e(r0)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r8.mo23863f(r11)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.android.libraries.assistant.hotword.x r0 = r8.mo23895g()     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r9.f52168h = r0     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.android.libraries.gsa.k.g r0 = r9.f52166f     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            com.google.android.libraries.assistant.hotword.n r2 = new com.google.android.libraries.assistant.hotword.n     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r2.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            java.lang.String r6 = "HotwordRecognitionRnr: Detection loop"
            com.google.common.util.concurrent.cx r0 = r0.mo28207g(r6, r2)     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r9.f52167g = r0     // Catch:{ IllegalArgumentException -> 0x012e, Exception -> 0x0131 }
            r0 = 6
            return r0
        L_0x012e:
            r0 = move-exception
            r2 = r5
            goto L_0x014a
        L_0x0131:
            r0 = move-exception
            com.google.common.f.e r2 = f52185f
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r5, r4)
            java.lang.String r4 = "Error at creating and/or starting hotword recognition."
            r5 = 47186(0xb852, float:6.6122E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
            r16.mo23894p()
            return r3
        L_0x0149:
            r0 = move-exception
        L_0x014a:
            r16.mo23894p()
            if (r21 == 0) goto L_0x017c
            r3 = r21
            com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData r3 = (com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData) r3
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r3 = r3.f52056b
            if (r3 == 0) goto L_0x017c
            com.google.common.f.e r3 = f52185f
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r5, r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.x r0 = r3.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r3 = 47185(0xb851, float:6.612E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            byte[] r2 = (byte[]) r2
            int r2 = r2.length
            java.lang.String r3 = "Invalid or incompatible speaker models. Silent enrollment required. ModelSize: %d"
            r0.mo56387q(r3, r2)
            goto L_0x01a0
        L_0x017c:
            com.google.common.f.e r3 = f52185f
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r5, r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.x r0 = r3.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r3 = 47184(0xb850, float:6.6119E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            byte[] r2 = (byte[]) r2
            int r2 = r2.length
            java.lang.String r3 = "Invalid or incompatible speaker models. Model does not have speakerid. ModelSize: %d"
            r0.mo56387q(r3, r2)
        L_0x01a0:
            r0 = 5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.hotword.C18384u.mo23893j(int, boolean, long, com.google.android.libraries.assistant.hotword.data.HotwordData, int):int");
    }

    /* renamed from: k */
    public final int mo23797k() {
        return this.f52188c != null ? 3 : 1;
    }

    /* renamed from: l */
    public final StringBuilder mo23798l() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("\n    initializationStatus=");
        sb.append(C18374k.m35778a(mo23797k()));
        if (this.f52149p != null) {
            sb.append("\n");
            sb.append(this.f52149p.mo23811e());
        }
        return sb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo23894p() {
        C58976aa aaVar = C58975e.f156826a;
        C18371h hVar = this.f52149p;
        if (hVar != null) {
            hVar.mo23808b();
            synchronized (this.f52191g) {
                this.f52189d = null;
            }
        }
    }
}
