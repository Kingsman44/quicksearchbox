package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.recognition.C77571ax;
import com.google.android.apps.gsa.nga.engine.recognition.p6127l.C77745a;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.nga.shared.p6407v.C83312ig;
import com.google.android.libraries.assistant.soda.C19285e;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.speech.p5218j.C66911ea;
import com.google.speech.p5218j.C66913ec;
import com.google.speech.p5218j.C66914ed;
import com.google.speech.p5218j.C66915ee;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67155nb;
import com.google.speech.p5218j.C67157nd;
import com.google.speech.p5218j.C67158ne;
import com.google.speech.p5218j.C67159nf;
import com.google.speech.p5218j.C67179x;
import com.google.speech.p5218j.C67180y;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5220b.p5221a.C66788aa;
import com.google.speech.p5218j.p5220b.p5221a.C66797aj;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.ao */
/* compiled from: PG */
public final class C77761ao implements C83312ig, C77571ax, C19285e, C77745a {

    /* renamed from: a */
    private static final C58974d f214220a = C58974d.m91136j();

    /* renamed from: b */
    private final C77817v f214221b;

    /* renamed from: c */
    private final C81252aq f214222c;

    public C77761ao(C77817v vVar, C81252aq aqVar) {
        this.f214221b = vVar;
        this.f214222c = aqVar;
    }

    /* renamed from: a */
    public final void mo72710a(String str) {
        Lock readLock;
        C67158ne neVar = (C67158ne) C67159nf.f182553c.createBuilder();
        C67179x xVar = (C67179x) C67180y.f182596f.createBuilder();
        xVar.copyOnWrite();
        C67180y yVar = (C67180y) xVar.instance;
        str.getClass();
        yVar.f182598a |= 1;
        yVar.f182599b = str;
        neVar.copyOnWrite();
        C67159nf nfVar = (C67159nf) neVar.instance;
        C67180y yVar2 = (C67180y) xVar.build();
        yVar2.getClass();
        C62971cq cqVar = nfVar.f182556b;
        if (!cqVar.mo58948c()) {
            nfVar.f182556b = C62942bv.mutableCopy(cqVar);
        }
        nfVar.f182556b.add(yVar2);
        C67155nb nbVar = (C67155nb) C67157nd.f182549c.createBuilder();
        nbVar.copyOnWrite();
        C67157nd ndVar = (C67157nd) nbVar.instance;
        ndVar.f182552b = 1;
        ndVar.f182551a |= 1;
        C67157nd ndVar2 = (C67157nd) nbVar.build();
        neVar.copyOnWrite();
        C67159nf nfVar2 = (C67159nf) neVar.instance;
        ndVar2.getClass();
        C62971cq cqVar2 = nfVar2.f182555a;
        if (!cqVar2.mo58948c()) {
            nfVar2.f182555a = C62942bv.mutableCopy(cqVar2);
        }
        nfVar2.f182555a.add(ndVar2);
        C67159nf nfVar3 = (C67159nf) neVar.build();
        try {
            C77817v vVar = this.f214221b;
            readLock = vVar.f214367k.readLock();
            readLock.lock();
            Soda a = vVar.mo72833a();
            a.mo24353t();
            a.nativeExecuteTasks(a.f53871d, nfVar3.toByteArray());
            readLock.unlock();
        } catch (C77816u e) {
            C58970a aVar = (C58970a) ((C58970a) f214220a.mo56226d()).mo56382g(e);
            aVar.mo56380ai(C58979ad.SMALL);
            ((C58970a) aVar.mo56372aa(4452)).mo56386p("Soda not available to upload audio logs");
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo72811b(C66722az azVar) {
        try {
            this.f214221b.mo72834b(azVar);
        } catch (C77816u unused) {
        }
    }

    /* renamed from: c */
    public final C67087ko mo24442c(C67087ko koVar, C66797aj ajVar) {
        Lock readLock;
        try {
            C77817v vVar = this.f214221b;
            readLock = vVar.f214367k.readLock();
            readLock.lock();
            Soda a = vVar.mo72833a();
            a.mo24353t();
            C62921ba baVar = new C62921ba();
            baVar.mo58832e(C66788aa.f181631c);
            C67087ko koVar2 = (C67087ko) ((C67086kn) ((C67086kn) C67087ko.f182366n.createBuilder()).mergeFrom(a.nativeFixRecognition(a.f53871d, koVar.toByteArray(), ajVar.toByteArray()), baVar)).build();
            readLock.unlock();
            return koVar2;
        } catch (C77816u | C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) f214220a.mo56226d()).mo56382g(e)).mo56372aa(4449)).mo56386p("Soda not available to apply fuzzy fix");
            return koVar;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo72818d(C66913ec ecVar) {
        Lock readLock;
        C66911ea eaVar = (C66911ea) ecVar.toBuilder();
        boolean y = this.f214222c.mo74964y();
        eaVar.copyOnWrite();
        C66913ec ecVar2 = (C66913ec) eaVar.instance;
        ecVar2.f181886a |= 8;
        ecVar2.f181892g = y;
        boolean w = this.f214222c.mo74962w();
        eaVar.copyOnWrite();
        C66913ec ecVar3 = (C66913ec) eaVar.instance;
        ecVar3.f181886a |= 16;
        ecVar3.f181893h = w;
        eaVar.copyOnWrite();
        C66913ec ecVar4 = (C66913ec) eaVar.instance;
        ecVar4.f181889d = 1;
        ecVar4.f181886a = 1 | ecVar4.f181886a;
        C66913ec ecVar5 = (C66913ec) eaVar.build();
        try {
            C77817v vVar = this.f214221b;
            C66914ed edVar = (C66914ed) C66915ee.f181900b.createBuilder();
            edVar.copyOnWrite();
            C66915ee eeVar = (C66915ee) edVar.instance;
            ecVar5.getClass();
            eeVar.mo59748a();
            eeVar.f181902a.add(ecVar5);
            C66915ee eeVar2 = (C66915ee) edVar.build();
            readLock = vVar.f214367k.readLock();
            readLock.lock();
            vVar.mo72833a().mo24341m(eeVar2);
            readLock.unlock();
        } catch (C77816u e) {
            ((C58970a) ((C58970a) ((C58970a) f214220a.mo56226d()).mo56382g(e)).mo56372aa(4450)).mo56386p("Soda not available to log execution");
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }
}
