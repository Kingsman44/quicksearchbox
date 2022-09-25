package com.google.android.apps.gsa.nga.engine.tclib;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.nga.engine.ak.a.c;
import com.google.android.apps.gsa.nga.engine.ar.ca;
import com.google.android.apps.gsa.nga.engine.ar.cu;
import com.google.android.apps.gsa.nga.engine.p5956ar.C75034bz;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6096p.C77443aj;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.p1481f.p1483b.C17949d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.SettableFuture;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61905bo;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61908br;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61910bt;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61924cg;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61925ch;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61949de;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61951dg;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61961dq;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61967j;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61970m;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.CloseableAssetFileDescriptor;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider;
import com.google.p4273bs.p4277b.p4278a.p4279a.C56461a;
import java.io.Closeable;
import java.io.IOException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* compiled from: PG */
public class TcLibWrapper implements ca, C77983a, C77443aj {

    /* renamed from: a */
    public static final C58974d f214745a = C58974d.m91136j();

    /* renamed from: b */
    public final Context f214746b;

    /* renamed from: c */
    public final C22871g f214747c;

    /* renamed from: d */
    public final C22871g f214748d;

    /* renamed from: e */
    public final C60888db f214749e;

    /* renamed from: f */
    public final C77999q f214750f;

    /* renamed from: g */
    public final C83305i f214751g;

    /* renamed from: h */
    public int f214752h = -1;

    /* renamed from: i */
    public int f214753i = -1;

    /* renamed from: j */
    public int f214754j = -1;

    /* renamed from: k */
    public TextClassifierLib f214755k;

    /* renamed from: l */
    public final C60836bq f214756l = new C60836bq();

    /* renamed from: m */
    private final C91142g f214757m;

    /* renamed from: n */
    private final c f214758n;

    /* renamed from: o */
    private final C76092h f214759o;

    /* renamed from: p */
    private final C17949d f214760p;

    /* renamed from: q */
    private C61910bt f214761q = null;

    /* renamed from: r */
    private C61920cc f214762r;

    /* renamed from: s */
    private WebrefAndPkgModelProvider f214763s;

    /* renamed from: t */
    private C61920cc f214764t;

    /* renamed from: u */
    private C61920cc f214765u;

    /* renamed from: v */
    private C61920cc f214766v;

    /* renamed from: w */
    private C61920cc f214767w;

    public TcLibWrapper(Context context, C22871g gVar, C22871g gVar2, C90851k kVar, C77999q qVar, C91142g gVar3, c cVar, C76092h hVar, C83305i iVar, C17949d dVar) {
        this.f214746b = context;
        this.f214747c = gVar;
        this.f214749e = kVar.mo85208a("TcLibWrapperExecutor");
        this.f214748d = gVar2;
        this.f214750f = qVar;
        this.f214757m = gVar3;
        this.f214758n = cVar;
        this.f214759o = hVar;
        this.f214751g = iVar;
        this.f214760p = dVar;
    }

    /* renamed from: A */
    private final ParcelFileDescriptor m125181A(C29690f fVar) {
        if (fVar == null) {
            return null;
        }
        C77999q qVar = this.f214750f;
        return qVar.f214823b.mo58338a(fVar, C61905bo.m94564a(qVar.f214822a), qVar.f214824c.mo72021b().mo72035a().mo71522b());
    }

    /* renamed from: B */
    private final CloseableAssetFileDescriptor m125182B(C29690f fVar) {
        if (fVar == null) {
            return null;
        }
        C77999q qVar = this.f214750f;
        return qVar.f214823b.mo58339b("tc_model", fVar, C61905bo.m94564a(qVar.f214822a));
    }

    /* renamed from: C */
    private final CloseableAssetFileDescriptor m125183C(C29690f fVar) {
        if (fVar == null) {
            return null;
        }
        C77999q qVar = this.f214750f;
        return qVar.f214823b.mo58339b("lightweight_tokens_data", fVar, C61905bo.m94564a(qVar.f214822a));
    }

    /* renamed from: D */
    private final CloseableAssetFileDescriptor m125184D(C29690f fVar) {
        if (fVar == null) {
            return null;
        }
        C77999q qVar = this.f214750f;
        return qVar.f214823b.mo58339b("tc_person_name_model", fVar, C61905bo.m94564a(qVar.f214822a));
    }

    /* renamed from: E */
    private final C61961dq m125185E(C29690f fVar) {
        if (fVar == null) {
            return null;
        }
        C77999q qVar = this.f214750f;
        return qVar.f214823b.mo58340c(fVar, C61905bo.m94564a(qVar.f214822a));
    }

    /* renamed from: n */
    public static C29690f m125186n(C58495hd hdVar, C80627v vVar) {
        return (C29690f) cu.b(hdVar, vVar).orElse(null);
    }

    public static native String nativeUpdate(TextClassifierLib textClassifierLib);

    /* renamed from: o */
    public static C60870cx m125187o(C60870cx cxVar, Executor executor) {
        SettableFuture settableFuture = new SettableFuture();
        cxVar.mo4106b(new C77991i(cxVar, settableFuture), executor);
        return settableFuture;
    }

    /* renamed from: z */
    private final ParcelFileDescriptor m125188z(C29690f fVar) {
        if (fVar == null) {
            return null;
        }
        C77999q qVar = this.f214750f;
        return qVar.f214823b.mo58338a(fVar, C61905bo.m94564a(qVar.f214822a), "alternate_name_model");
    }

    /* renamed from: a */
    public final void mo72574a(String str) {
        if (!this.f214757m.mo85405j(C90126fx.f251214eb)) {
            try {
                new C90873ag(mo72948p(C56461a.m88196b(this.f214746b.getFilesDir(), str)), this.f214747c, "[NGA] TCLibWrapper.updatePkgSlice", C77994l.f214801a).mo85223a(C77995m.f214802a);
            } catch (IOException e) {
                throw new IOException("Failed to read downloaded PKG Slice.", e);
            } catch (NumberFormatException e2) {
                throw new IOException("Failed to read directory structure of PKG Slice.", e2);
            }
        }
    }

    /* renamed from: b */
    public final C89849ae mo72936b() {
        return C89849ae.NGA_TCLIB_INITIALIZATION_FAILURE;
    }

    /* renamed from: c */
    public final C89849ae mo72937c() {
        return C89849ae.NGA_TCLIB_INITIALIZATION_START;
    }

    /* renamed from: d */
    public final C89849ae mo72938d() {
        return C89849ae.NGA_TCLIB_INITIALIZATION_SUCCESS;
    }

    /* renamed from: e */
    public final C58528ij mo72939e() {
        return C58528ij.m90015O(C80627v.TCLIB, C80627v.WEBREF, C80627v.SAFT_SEGMENTER, C80627v.TCLIB_PERSON_NAME, C80627v.CONTACT_NAMES, C80627v.NEURAL_MATCHING_ENCODER, C80627v.LIGHTWEIGHT_TOKENS);
    }

    /* renamed from: f */
    public final C60870cx mo72940f() {
        return this.f214747c.mo28201a("[NGA] TcLibWrapper.destroy", new C77988f(this));
    }

    /* renamed from: g */
    public final C60870cx mo72941g(C58495hd hdVar) {
        if (this.f214757m.mo85405j(C90126fx.f251480jc)) {
            return C118826c.f331423b;
        }
        Optional optional = (Optional) hdVar.getOrDefault(C80627v.SAFT_SEGMENTER, Optional.empty());
        C60870cx cxVar = C118826c.f331423b;
        if (optional.isPresent()) {
            ((C58970a) ((C58970a) f214745a.mo56224b()).mo56372aa(4796)).mo56386p("SAFT_SEGMENTER is available: ensuring segmenter is initialized.");
            cxVar = this.f214758n.a(cu.a((C29690f) optional.get()), ((C29690f) optional.get()).f80414e);
        }
        return this.f214747c.mo28210j(cxVar, "[NGA] ModelResourcesManager.onResourceGroupUpdate", new C77990h(this, hdVar));
    }

    /* renamed from: h */
    public final /* synthetic */ String mo72942h() {
        return C75034bz.m121290a(this);
    }

    /* renamed from: i */
    public final EnumSet mo72943i() {
        return EnumSet.of(C80627v.WEBREF);
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo72944j() {
        return true;
    }

    /* renamed from: k */
    public final boolean mo72945k(C58528ij ijVar) {
        return ijVar.contains(Integer.valueOf(C90126fx.f251373hb.f248757a)) || ijVar.contains(Integer.valueOf(C90126fx.f251768oz.f251802a)) || ijVar.contains(Integer.valueOf(C90126fx.f251498ju.f248757a)) || ijVar.contains(Integer.valueOf(C90126fx.f251076bw.f248757a)) || ijVar.contains(Integer.valueOf(C90126fx.f251375hd.f248757a)) || ijVar.contains(Integer.valueOf(C90126fx.f251480jc.f248757a)) || ijVar.contains(Integer.valueOf(C90126fx.f251153dT.f248757a));
    }

    /* renamed from: l */
    public final synchronized Optional mo72946l() {
        return Optional.ofNullable(this.f214763s).map(C77989g.f214780a);
    }

    /* renamed from: m */
    public final Optional mo72947m() {
        WebrefAndPkgModelProvider webrefAndPkgModelProvider;
        synchronized (this) {
            webrefAndPkgModelProvider = this.f214763s;
        }
        return Optional.ofNullable(webrefAndPkgModelProvider).map(C77984b.f214768a);
    }

    /* renamed from: p */
    public final synchronized C60870cx mo72948p(C61910bt btVar) {
        if (this.f214755k == null) {
            C61910bt btVar2 = this.f214761q;
            if (btVar2 != null) {
                try {
                    btVar2.close();
                } catch (IOException e) {
                    ((C58970a) ((C58970a) ((C58970a) f214745a.mo56226d()).mo56382g(e)).mo56372aa(4799)).mo56386p("Failed to close a previously saved PKG slice.");
                }
            }
            this.f214761q = btVar;
            return C60856cj.m92900i(C118826c.f331422a);
        }
        return mo72949q((C29690f) null, (C29690f) null, (C29690f) null, btVar, (C29690f) null, (C29690f) null, (C29690f) null);
    }

    /* renamed from: q */
    public final C60870cx mo72949q(C29690f fVar, C29690f fVar2, C29690f fVar3, C61910bt btVar, C29690f fVar4, C29690f fVar5, C29690f fVar6) {
        TextClassifierLib textClassifierLib;
        synchronized (this) {
            textClassifierLib = this.f214755k;
        }
        if (textClassifierLib == null) {
            return C60856cj.m92899h(new IOException());
        }
        return this.f214748d.mo28209i(this.f214756l.mo57305b(new C77998p(this, fVar, fVar2, fVar3, btVar, fVar4, fVar5, fVar6, textClassifierLib), C60826bg.f164896a), "[NGA] TcLibWrapper.modelUpdatedFuture.transform", new C77985c(this, fVar, fVar3, fVar5));
    }

    /* renamed from: r */
    public final synchronized TextClassifierLib mo72950r() {
        return this.f214755k;
    }

    /* renamed from: s */
    public final synchronized C61951dg mo72951s(C29690f fVar, C29690f fVar2, C29690f fVar3, C29690f fVar4, C29690f fVar5, C29690f fVar6) {
        C61949de p;
        this.f214762r = C61920cc.m94585c(m125182B(fVar));
        this.f214763s = new WebrefAndPkgModelProvider(m125185E(fVar2), this.f214761q, true);
        this.f214761q = null;
        if (mo72957y()) {
            this.f214764t = C61920cc.m94585c(m125184D(fVar3));
        } else {
            this.f214764t = C61920cc.m94585c((AssetFileDescriptor) null);
        }
        if (mo72955w()) {
            this.f214765u = C61920cc.m94585c(m125183C(fVar6));
        } else {
            this.f214765u = C61920cc.m94585c((AssetFileDescriptor) null);
        }
        boolean j = this.f214757m.mo85405j(C90126fx.f251498ju);
        C58480gp e = C58485gu.m89837e();
        if (j) {
            C58485gu d = C89988b.m146551d(this.f214757m.mo85403h(C90126fx.f250968U));
            int size = d.size();
            for (int i = 0; i < size; i++) {
                e.mo55396h(this.f214760p.mo23500a((String) d.get(i)));
            }
        }
        if (mo72954v()) {
            this.f214766v = new C61920cc(m125188z(fVar4));
        } else {
            this.f214766v = new C61920cc((Closeable) null);
        }
        if (mo72956x()) {
            this.f214767w = new C61920cc(m125181A(fVar5));
        } else {
            this.f214767w = new C61920cc((Closeable) null);
        }
        p = C61951dg.m94620p();
        C61908br brVar = (C61908br) Objects.requireNonNull(this.f214762r);
        if (brVar != null) {
            ((C61970m) p).f167465a = brVar;
            C61908br brVar2 = (C61908br) Objects.requireNonNull(this.f214764t);
            if (brVar2 != null) {
                ((C61970m) p).f167469e = brVar2;
                C61908br brVar3 = (C61908br) Objects.requireNonNull(this.f214763s);
                if (brVar3 != null) {
                    ((C61970m) p).f167468d = brVar3;
                    C61908br brVar4 = (C61908br) Objects.requireNonNull(this.f214766v);
                    if (brVar4 != null) {
                        ((C61970m) p).f167470f = brVar4;
                        C61908br brVar5 = (C61908br) Objects.requireNonNull(this.f214767w);
                        if (brVar5 != null) {
                            ((C61970m) p).f167471g = brVar5;
                            C61924cg k = C61925ch.m94598k();
                            k.mo58367f(true);
                            k.mo58365d(true);
                            k.mo58364c(true);
                            k.mo58363b(true);
                            k.mo58366e(true);
                            k.mo58368g(j);
                            k.mo58370i(e.mo55394f());
                            C61908br brVar6 = (C61908br) Objects.requireNonNull(this.f214765u);
                            if (brVar6 != null) {
                                ((C61967j) k).f167445a = brVar6;
                                k.mo58369h(this.f214759o.mo72021b().mo72035a().mo71521a());
                                ((C61970m) p).f167473i = k.mo58362a();
                            } else {
                                throw new NullPointerException("Null lightweightTokensProvider");
                            }
                        } else {
                            throw new NullPointerException("Null neuralMatchingEncoderProvider");
                        }
                    } else {
                        throw new NullPointerException("Null alternateContactModelProvider");
                    }
                } else {
                    throw new NullPointerException("Null webrefModelProvider");
                }
            } else {
                throw new NullPointerException("Null personNameModelProvider");
            }
        } else {
            throw new NullPointerException("Null coreModelProvider");
        }
        return p.mo58393a();
    }

    /* renamed from: t */
    public final void mo72952t(String str, C29690f fVar) {
        this.f214747c.mo28212l("[NGA] logModelFileGroup", new C77987e(this, fVar, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00da, code lost:
        return;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo72953u(com.google.android.libraries.mdi.C29690f r2, com.google.android.libraries.mdi.C29690f r3, com.google.android.libraries.mdi.C29690f r4, com.google.knowledge.cerebra.sense.textclassifier.tclib.C61910bt r5, com.google.android.libraries.mdi.C29690f r6, com.google.android.libraries.mdi.C29690f r7, com.google.android.libraries.mdi.C29690f r8) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.CloseableAssetFileDescriptor r2 = r1.m125182B(r2)     // Catch:{ all -> 0x00db }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dq r3 = r1.m125185E(r3)     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x0016
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r0 = r1.f214762r     // Catch:{ all -> 0x00db }
            java.lang.Object r0 = p3186j$.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x00db }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r0 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc) r0     // Catch:{ all -> 0x00db }
            r0.mo58361d(r2)     // Catch:{ all -> 0x00db }
        L_0x0016:
            if (r3 == 0) goto L_0x0024
            com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider r2 = r1.f214763s     // Catch:{ all -> 0x00db }
            java.lang.Object r2 = p3186j$.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x00db }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider r2 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider) r2     // Catch:{ all -> 0x00db }
            r0 = 1
            r2.mo58315d(r3, r0)     // Catch:{ all -> 0x00db }
        L_0x0024:
            boolean r2 = r1.mo72957y()     // Catch:{ all -> 0x00db }
            r3 = 0
            if (r2 == 0) goto L_0x003d
            com.google.knowledge.cerebra.sense.textclassifier.tclib.CloseableAssetFileDescriptor r2 = r1.m125184D(r4)     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x0048
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r4 = r1.f214764t     // Catch:{ all -> 0x00db }
            java.lang.Object r4 = p3186j$.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x00db }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r4 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc) r4     // Catch:{ all -> 0x00db }
            r4.mo58361d(r2)     // Catch:{ all -> 0x00db }
            goto L_0x0048
        L_0x003d:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r2 = r1.f214764t     // Catch:{ all -> 0x00db }
            java.lang.Object r2 = p3186j$.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x00db }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r2 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc) r2     // Catch:{ all -> 0x00db }
            r2.mo58361d(r3)     // Catch:{ all -> 0x00db }
        L_0x0048:
            boolean r2 = r1.mo72955w()     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x0060
            com.google.knowledge.cerebra.sense.textclassifier.tclib.CloseableAssetFileDescriptor r2 = r1.m125183C(r8)     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x006b
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r4 = r1.f214765u     // Catch:{ all -> 0x00db }
            java.lang.Object r4 = p3186j$.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x00db }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r4 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc) r4     // Catch:{ all -> 0x00db }
            r4.mo58361d(r2)     // Catch:{ all -> 0x00db }
            goto L_0x006b
        L_0x0060:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r2 = r1.f214765u     // Catch:{ all -> 0x00db }
            java.lang.Object r2 = p3186j$.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x00db }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r2 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc) r2     // Catch:{ all -> 0x00db }
            r2.mo58361d(r3)     // Catch:{ all -> 0x00db }
        L_0x006b:
            boolean r2 = r1.mo72954v()     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x0083
            android.os.ParcelFileDescriptor r2 = r1.m125188z(r6)     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x008e
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r4 = r1.f214766v     // Catch:{ all -> 0x00db }
            java.lang.Object r4 = p3186j$.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x00db }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r4 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc) r4     // Catch:{ all -> 0x00db }
            r4.mo58361d(r2)     // Catch:{ all -> 0x00db }
            goto L_0x008e
        L_0x0083:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r2 = r1.f214766v     // Catch:{ all -> 0x00db }
            java.lang.Object r2 = p3186j$.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x00db }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r2 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc) r2     // Catch:{ all -> 0x00db }
            r2.mo58361d(r3)     // Catch:{ all -> 0x00db }
        L_0x008e:
            boolean r2 = r1.mo72956x()     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x00b4
            android.os.ParcelFileDescriptor r2 = r1.m125181A(r7)     // Catch:{ all -> 0x00db }
            if (r2 != 0) goto L_0x00a8
            com.google.common.f.a.d r2 = f214745a     // Catch:{ all -> 0x00db }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x00db }
            java.lang.String r3 = "[Neural matching] Encoder file descriptor is null"
            r4 = 4809(0x12c9, float:6.739E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)     // Catch:{ all -> 0x00db }
            goto L_0x00bf
        L_0x00a8:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r3 = r1.f214767w     // Catch:{ all -> 0x00db }
            java.lang.Object r3 = p3186j$.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x00db }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r3 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc) r3     // Catch:{ all -> 0x00db }
            r3.mo58361d(r2)     // Catch:{ all -> 0x00db }
            goto L_0x00bf
        L_0x00b4:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r2 = r1.f214767w     // Catch:{ all -> 0x00db }
            java.lang.Object r2 = p3186j$.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x00db }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cc r2 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc) r2     // Catch:{ all -> 0x00db }
            r2.mo58361d(r3)     // Catch:{ all -> 0x00db }
        L_0x00bf:
            com.google.android.apps.gsa.shared.util.v.g r2 = r1.f214757m     // Catch:{ all -> 0x00db }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251214eb     // Catch:{ all -> 0x00db }
            boolean r2 = r2.mo85405j(r3)     // Catch:{ all -> 0x00db }
            if (r5 == 0) goto L_0x00d9
            if (r2 != 0) goto L_0x00d9
            com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider r2 = r1.f214763s     // Catch:{ all -> 0x00db }
            java.lang.Object r2 = p3186j$.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x00db }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider r2 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.WebrefAndPkgModelProvider) r2     // Catch:{ all -> 0x00db }
            r3 = 0
            r2.mo58313c(r5, r3)     // Catch:{ all -> 0x00db }
            monitor-exit(r1)
            return
        L_0x00d9:
            monitor-exit(r1)
            return
        L_0x00db:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.tclib.TcLibWrapper.mo72953u(com.google.android.libraries.mdi.f, com.google.android.libraries.mdi.f, com.google.android.libraries.mdi.f, com.google.knowledge.cerebra.sense.textclassifier.tclib.bt, com.google.android.libraries.mdi.f, com.google.android.libraries.mdi.f, com.google.android.libraries.mdi.f):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo72954v() {
        return this.f214757m.mo85405j(C90126fx.f251076bw);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo72955w() {
        this.f214759o.mo72021b();
        return this.f214757m.mo85405j(C90126fx.f251153dT);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean mo72956x() {
        return this.f214759o.mo72021b().mo72035a().mo71521a().f131520a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean mo72957y() {
        return this.f214757m.mo85405j(C90126fx.f251373hb) && C81451b.m129570a(this.f214759o.mo72021b().mo72039e(), this.f214757m.mo85403h(C90126fx.f251768oz));
    }
}
