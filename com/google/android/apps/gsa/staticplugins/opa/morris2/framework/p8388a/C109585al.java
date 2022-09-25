package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14781a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14236bt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14237bu;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1076c.C14645a;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15389q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.al */
/* compiled from: PG */
public final class C109585al implements C14781a {

    /* renamed from: a */
    public static final C59071e f305198a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.al");

    /* renamed from: b */
    public final C14986h f305199b;

    /* renamed from: c */
    public final AtomicBoolean f305200c = new AtomicBoolean(true);

    /* renamed from: d */
    public final AtomicBoolean f305201d = new AtomicBoolean(false);

    /* renamed from: e */
    public final AtomicBoolean f305202e = new AtomicBoolean(false);

    /* renamed from: f */
    public final C86124t f305203f;

    /* renamed from: g */
    public final Context f305204g;

    /* renamed from: h */
    public Optional f305205h = Optional.empty();

    /* renamed from: i */
    public final C14096x f305206i;

    /* renamed from: j */
    private final C60887da f305207j;

    /* renamed from: k */
    private final C14645a f305208k;

    /* renamed from: l */
    private final AtomicBoolean f305209l = new AtomicBoolean(false);

    /* renamed from: m */
    private Optional f305210m = Optional.empty();

    public C109585al(C14986h hVar, C60887da daVar, C14645a aVar, C14096x xVar, C86124t tVar, Context context) {
        this.f305199b = hVar;
        this.f305207j = daVar;
        this.f305208k = aVar;
        this.f305206i = xVar;
        this.f305203f = tVar;
        this.f305204g = context;
    }

    /* renamed from: l */
    private final C60870cx m182363l() {
        if (this.f305205h.isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(C14782b.SUCCESS);
        }
        if (this.f305210m.isEmpty()) {
            this.f305210m = Optional.m71637of(C60922j.m93045h(this.f305208k.mo21589b(), new C109580ag(this), this.f305207j));
        }
        return (C60870cx) this.f305210m.get();
    }

    /* renamed from: m */
    private final C60870cx m182364m() {
        C60870cx h = C60922j.m93045h(this.f305208k.mo21589b(), new C109580ag(this), this.f305207j);
        try {
            C90877ak.m148473g(h, 20, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C59104x d = f305198a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(24904)).mo56386p("Geller read failed.");
        } catch (ExecutionException | TimeoutException e2) {
            C59104x d2 = f305198a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(24905)).mo56386p("Geller read failed.");
        }
        if (!h.isDone()) {
            C59104x c = f305198a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
            ((C59052c) ((C59052c) c).mo56372aa(24903)).mo56386p("Geller read did not complete within the expected time.");
        }
        return C60856cj.m92900i(C14782b.SUCCESS);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final void mo21503c() {
        C60870cx l = m182363l();
        C14096x xVar = this.f305206i;
        C58976aa aaVar = C58975e.f156826a;
        C60870cx d = xVar.f42764b.mo46042d();
        C60870cx b = C47638k.m84751b(l, d).mo51521b(new C109581ah(this, l, d), C60826bg.f164896a);
        C109582ai aiVar = new C109582ai(this);
        C60856cj.m92911t(b, C47810es.m84974n(aiVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo21504d() {
        this.f305205h = Optional.empty();
        this.f305210m = Optional.empty();
    }

    /* renamed from: e */
    public final void mo21505e() {
        this.f305209l.set(false);
    }

    /* renamed from: f */
    public final void mo97908f(C52686as asVar) {
        if (!this.f305205h.isEmpty()) {
            boolean k = mo97910k(asVar);
            if (this.f305202e.getAndSet(k) != k) {
                this.f305209l.set(true);
            }
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r0 != 6) goto L_0x013d;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be mo21727h(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc r7) {
        /*
            r6 = this;
            int r0 = r7.f43038a
            com.google.android.libraries.assistant.auto.tng.morris.e.bb r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb.m30579a(r0)
            com.google.android.libraries.assistant.auto.tng.morris.e.bb r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb.DRIVING_SETTINGS_DATA_REQUEST
            java.lang.String r2 = "Morris.SettingsDataSrc"
            if (r0 == r1) goto L_0x0027
            com.google.common.f.e r0 = f305198a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            int r7 = r7.f43038a
            com.google.android.libraries.assistant.auto.tng.morris.e.bb r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb.m30579a(r7)
            r1 = 24899(0x6143, float:3.4891E-41)
            java.lang.String r2 = "getDataForRequest(), request.getRequestCase() should be DRIVING_SETTINGS_DATA_REQUEST but was: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r1)).mo56389s(r2, r7)
            com.google.android.libraries.assistant.auto.tng.morris.e.be r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be.f43041c
            return r7
        L_0x0027:
            int r0 = r7.f43038a
            r1 = 17
            if (r0 != r1) goto L_0x0032
            java.lang.Object r0 = r7.f43039b
            com.google.android.libraries.assistant.auto.tng.morris.e.bu r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14237bu) r0
            goto L_0x0034
        L_0x0032:
            com.google.android.libraries.assistant.auto.tng.morris.e.bu r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14237bu.f43088d
        L_0x0034:
            int r0 = r0.f43090a
            int r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14236bt.m30583b(r0)
            r3 = 1
            if (r0 != 0) goto L_0x003e
            r0 = 1
        L_0x003e:
            int r0 = r0 + -2
            r4 = -1
            if (r0 == r4) goto L_0x010a
            if (r0 == 0) goto L_0x010a
            if (r0 == r3) goto L_0x0052
            r4 = 2
            if (r0 == r4) goto L_0x010a
            r4 = 3
            if (r0 == r4) goto L_0x010a
            r4 = 6
            if (r0 == r4) goto L_0x010a
            goto L_0x013d
        L_0x0052:
            j$.util.Optional r7 = r6.f305205h
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x005d
            com.google.android.libraries.assistant.auto.tng.morris.e.be r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be.f43041c
            return r7
        L_0x005d:
            com.google.android.libraries.assistant.auto.tng.morris.e.be r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be.f43041c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.bd r7 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14220bd) r7
            com.google.android.libraries.assistant.auto.tng.morris.e.bw r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14239bw.f43093c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.bv r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14238bv) r0
            j$.util.Optional r1 = r6.f305205h
            com.google.assistant.e.l.a.as r2 = com.google.assistant.p3897e.p3929l.p3930a.C52686as.f138291q
            java.lang.Object r1 = r1.orElse(r2)
            com.google.assistant.e.l.a.as r1 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r1
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.l.a.ar r1 = (com.google.assistant.p3897e.p3929l.p3930a.C52685ar) r1
            android.content.Context r2 = r6.f305204g
            boolean r2 = com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab.m30482c(r2)
            r4 = 0
            if (r2 == 0) goto L_0x008e
            android.content.Context r2 = r6.f305204g
            boolean r2 = com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab.m30485f(r2)
            if (r2 == 0) goto L_0x009d
        L_0x008e:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.l.a.as r2 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r2
            int r5 = r2.f138293a
            r5 = r5 | 2048(0x800, float:2.87E-42)
            r2.f138293a = r5
            r2.f138300h = r4
        L_0x009d:
            android.content.Context r2 = r6.f305204g
            boolean r2 = com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab.m30481b(r2)
            if (r2 != 0) goto L_0x00b5
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.l.a.as r2 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r2
            int r4 = r2.f138293a
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r2.f138293a = r4
            r2.f138299g = r3
            goto L_0x00cc
        L_0x00b5:
            android.content.Context r2 = r6.f305204g
            boolean r2 = com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab.m30485f(r2)
            if (r2 == 0) goto L_0x00cc
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.l.a.as r2 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r2
            int r3 = r2.f138293a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r2.f138293a = r3
            r2.f138299g = r4
        L_0x00cc:
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.l.a.as r1 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.bw r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14239bw) r2
            r1.getClass()
            r2.f43095a = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.f305209l
            boolean r1 = r1.get()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.bw r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14239bw) r2
            r2.f43096b = r1
            r7.copyOnWrite()
            com.google.protobuf.bv r1 = r7.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.be r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be) r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.bw r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14239bw) r0
            r0.getClass()
            r1.f43044b = r0
            r0 = 13
            r1.f43043a = r0
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.be r7 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be) r7
            return r7
        L_0x010a:
            com.google.common.f.e r0 = f305198a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r2 = 24898(0x6142, float:3.489E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            int r2 = r7.f43038a
            if (r2 != r1) goto L_0x0128
            java.lang.Object r7 = r7.f43039b
            com.google.android.libraries.assistant.auto.tng.morris.e.bu r7 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14237bu) r7
            goto L_0x012a
        L_0x0128:
            com.google.android.libraries.assistant.auto.tng.morris.e.bu r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14237bu.f43088d
        L_0x012a:
            int r7 = r7.f43090a
            int r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14236bt.m30583b(r7)
            if (r7 != 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r3 = r7
        L_0x0134:
            java.lang.String r7 = "Unsupported Op: Cannot getDataForRequest(%s)"
            java.lang.String r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14236bt.m30582a(r3)
            r0.mo56389s(r7, r1)
        L_0x013d:
            com.google.android.libraries.assistant.auto.tng.morris.e.be r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be.f43041c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.C109585al.mo21727h(com.google.android.libraries.assistant.auto.tng.morris.e.bc):com.google.android.libraries.assistant.auto.tng.morris.e.be");
    }

    /* renamed from: i */
    public final C60870cx mo21728i(C14219bc bcVar) {
        C14237bu buVar;
        C14237bu buVar2;
        if (C14218bb.m30579a(bcVar.f43038a) != C14218bb.DRIVING_SETTINGS_DATA_REQUEST) {
            C59104x d = f305198a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
            ((C59052c) ((C59052c) d).mo56372aa(24901)).mo56389s("fetchAndStoreData(), request.getRequestCase() should be DRIVING_SETTINGS_DATA_REQUEST but was: %s", C14218bb.m30579a(bcVar.f43038a));
            return C60856cj.m92900i(C14782b.FAILED);
        }
        if (bcVar.f43038a == 17) {
            buVar = (C14237bu) bcVar.f43039b;
        } else {
            buVar = C14237bu.f43088d;
        }
        int b = C14236bt.m30583b(buVar.f43090a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        int i2 = b - 2;
        if (!(i2 == -1 || i2 == 0)) {
            if (i2 == 1) {
                return m182364m();
            }
            if (!(i2 == 2 || i2 == 3 || i2 == 6)) {
                return C60856cj.m92900i(C14782b.FAILED);
            }
        }
        C59104x d2 = f305198a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
        C59052c cVar = (C59052c) ((C59052c) d2).mo56372aa(24900);
        if (bcVar.f43038a == 17) {
            buVar2 = (C14237bu) bcVar.f43039b;
        } else {
            buVar2 = C14237bu.f43088d;
        }
        int b2 = C14236bt.m30583b(buVar2.f43090a);
        if (b2 != 0) {
            i = b2;
        }
        cVar.mo56389s("Unsupported Op: Cannot fetchAndStoreData(%s)", C14236bt.m30582a(i));
        return C60856cj.m92900i(C14782b.FAILED);
    }

    /* renamed from: j */
    public final void mo97909j(C52686as asVar) {
        C60870cx d = this.f305208k.mo21590d(asVar);
        C109584ak akVar = new C109584ak(this, asVar);
        C60856cj.m92911t(d, C47810es.m84974n(akVar), this.f305207j);
    }

    /* renamed from: k */
    public final boolean mo97910k(C52686as asVar) {
        if (this.f305203f.mo79746e(C90051dc.f248827ai)) {
            return C15389q.m32021a(asVar, this.f305203f) == 6;
        }
        return asVar.f138301i;
    }

    /* renamed from: t */
    public final void mo21729t(C14219bc bcVar, C14324f fVar, C14499lm lmVar) {
        C14237bu buVar;
        C14237bu buVar2;
        C14237bu buVar3;
        C14237bu buVar4;
        C14237bu buVar5;
        if (C14218bb.m30579a(bcVar.f43038a) != C14218bb.DRIVING_SETTINGS_DATA_REQUEST) {
            C59104x d = f305198a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
            ((C59052c) ((C59052c) d).mo56372aa(24914)).mo56389s("sendFireAndForgetRequest(), request.getRequestCase() should be DRIVING_SETTINGS_DATA_REQUEST but was: %s", C14218bb.m30579a(bcVar.f43038a));
            return;
        }
        if (bcVar.f43038a == 17) {
            buVar = (C14237bu) bcVar.f43039b;
        } else {
            buVar = C14237bu.f43088d;
        }
        int b = C14236bt.m30583b(buVar.f43090a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        int i2 = b - 2;
        if (i2 == -1 || i2 == 0 || i2 == 1) {
            C59104x d2 = f305198a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
            C59052c cVar = (C59052c) ((C59052c) d2).mo56372aa(24913);
            if (bcVar.f43038a == 17) {
                buVar2 = (C14237bu) bcVar.f43039b;
            } else {
                buVar2 = C14237bu.f43088d;
            }
            int b2 = C14236bt.m30583b(buVar2.f43090a);
            if (b2 != 0) {
                i = b2;
            }
            cVar.mo56389s("Unsupported Op: Cannot sendFireAndForget(%s)", C14236bt.m30582a(i));
        } else if (i2 == 2) {
            int i3 = bcVar.f43038a;
            if (i3 == 17) {
                buVar3 = (C14237bu) bcVar.f43039b;
            } else {
                buVar3 = C14237bu.f43088d;
            }
            if (buVar3.f43091b != null) {
                if (i3 == 17) {
                    buVar4 = (C14237bu) bcVar.f43039b;
                } else {
                    buVar4 = C14237bu.f43088d;
                }
                C52686as asVar = buVar4.f43091b;
                if (asVar == null) {
                    asVar = C52686as.f138291q;
                }
                mo97909j(asVar);
                return;
            }
            C59104x c = f305198a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
            ((C59052c) ((C59052c) c).mo56372aa(24912)).mo56386p("Driving settings cannot be empty.");
        } else if (i2 == 3) {
            AtomicBoolean atomicBoolean = this.f305209l;
            if (bcVar.f43038a == 17) {
                buVar5 = (C14237bu) bcVar.f43039b;
            } else {
                buVar5 = C14237bu.f43088d;
            }
            atomicBoolean.set(buVar5.f43092c);
        } else if (i2 == 6) {
            C60856cj.m92911t(m182363l(), C47810es.m84974n(new C109583aj(this)), this.f305207j);
        }
    }
}
