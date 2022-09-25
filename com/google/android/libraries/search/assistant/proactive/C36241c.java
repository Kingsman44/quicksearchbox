package com.google.android.libraries.search.assistant.proactive;

import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28449s;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28376al;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28377am;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.android.libraries.logging.p2185ve.synthetic.C28465i;
import com.google.android.libraries.logging.p2185ve.synthetic.C28470n;
import com.google.android.libraries.logging.p2185ve.synthetic.remote.C28473c;
import com.google.android.libraries.logging.p2185ve.synthetic.remote.ParcelableSyntheticTree;
import com.google.android.libraries.logging.p2185ve.synthetic.remote.TreeNodeRef;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajz;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60870cx;
import com.google.p3717aq.p3718a.p3719a.C47875i;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.assistant.proactive.c */
/* compiled from: PG */
public final class C36241c implements C36231b {

    /* renamed from: a */
    private final C28463g f94667a;

    /* renamed from: b */
    private final C28310af f94668b;

    /* renamed from: c */
    private final C28443m f94669c;

    public C36241c(C28465i iVar, C28310af afVar, C28443m mVar) {
        this.f94667a = iVar.mo33923a(C58733pz.f156496a);
        this.f94668b = afVar;
        this.f94669c = mVar;
    }

    /* renamed from: h */
    private final C28313c m64698h(int i, C58833ax axVar, C58833ax axVar2, int i2, int i3) {
        C28313c a = this.f94668b.mo33805a(C28427h.m53115a(i));
        if (axVar.mo56113h()) {
            a.mo33858f(new C28353e(C36220ap.f94627a, (ajz) axVar.mo56107c()));
        }
        a.mo33859g(C45954d.m82060a((AccountId) ((C58847bk) axVar2).f156646a));
        if (i2 > 0) {
            a.mo33859g(new C28423g(C28473c.f77274a, TreeNodeRef.m53228b(i2).f77271a));
        }
        if (i3 >= 0) {
            a.mo33858f(C28449s.m53155a(i3));
        }
        return a;
    }

    /* renamed from: i */
    private final C28439i m64699i(int i, aas aas, C58833ax axVar, ajz ajz) {
        C28313c h = m64698h(i, C58833ax.m90834k(ajz), axVar, -1, -1);
        h.mo33859g(C28375ak.m53061c(i));
        if (!aas.f134675m.isEmpty()) {
            try {
                C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
                C60220t b = C28294l.m52912b(aas.f134675m);
                qVar.copyOnWrite();
                C60218r rVar = (C60218r) qVar.instance;
                b.getClass();
                rVar.f162928b = b;
                rVar.f162927a |= 1;
                h.mo33859g(new C28423g(C28377am.f77114b, (C60218r) qVar.build()));
            } catch (IOException unused) {
                C58976aa aaVar = C58975e.f156826a;
            }
        }
        aap aap = aas.f134676n;
        if (aap == null) {
            aap = aap.f134650h;
        }
        if ((aap.f134652a & 8) != 0) {
            aap aap2 = aas.f134676n;
            if (aap2 == null) {
                aap2 = aap.f134650h;
            }
            C63204j jVar = aap2.f134657f;
            if (jVar == null) {
                jVar = C63204j.f170749e;
            }
            h.mo33858f(new C28353e(C28376al.f77109a, jVar));
        }
        return this.f94667a.mo33918b(h);
    }

    /* renamed from: a */
    public final void mo40045a(aas aas, C58833ax axVar, ajz ajz) {
        this.f94667a.mo33920d(m64699i(107929, aas, axVar, ajz));
        this.f94667a.mo33922f();
    }

    /* renamed from: b */
    public final void mo40046b(aas aas, C58833ax axVar, ajz ajz) {
        this.f94667a.mo33920d(m64699i(85000, aas, axVar, ajz));
        this.f94667a.mo33922f();
    }

    /* renamed from: c */
    public final void mo40047c(aas aas, C58833ax axVar, ajz ajz) {
        this.f94667a.mo33920d(m64699i(100627, aas, axVar, ajz));
        this.f94667a.mo33922f();
    }

    /* renamed from: d */
    public final void mo40048d(String str, ajz ajz) {
        ParcelableSyntheticTree a = C36206ab.m64605a(str);
        C28440j g = C28442l.m53141g();
        C28439i a2 = a.mo33924a(this.f94667a, C62921ba.m95368a());
        C28439i a3 = TreeNodeRef.m53228b(1).mo33927a(a2);
        if (a3 != null) {
            a2 = a3;
        }
        g.mo33895b(new C28441k(C36220ap.f94628b, ajz));
        this.f94669c.mo33853c(g.mo33894a(), a2);
        this.f94667a.mo33922f();
    }

    /* renamed from: e */
    public final void mo40049e(String str, ajz ajz) {
        ParcelableSyntheticTree a = C36206ab.m64605a(str);
        C28440j jVar = new C28440j(34);
        C28439i a2 = a.mo33924a(this.f94667a, C62921ba.m95368a());
        C28439i a3 = TreeNodeRef.m53228b(1).mo33927a(a2);
        if (a3 != null) {
            a2 = a3;
        }
        jVar.mo33895b(new C28441k(C36220ap.f94628b, ajz));
        this.f94669c.mo33853c(jVar.mo33894a(), a2);
        this.f94667a.mo33922f();
    }

    /* renamed from: f */
    public final ParcelableSyntheticTree mo40050f(aas aas, C58833ax axVar, ajz ajz) {
        Object obj;
        boolean z = aas.f134677o;
        C28313c h = m64698h(47411, C58833ax.m90834k(ajz), axVar, -1, -1);
        if (z) {
            h.mo33860h(3);
        }
        h.mo33859g(C28375ak.m53061c(47411));
        if (!aas.f134675m.isEmpty()) {
            try {
                C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
                C60220t b = C28294l.m52912b(aas.f134675m);
                qVar.copyOnWrite();
                C60218r rVar = (C60218r) qVar.instance;
                b.getClass();
                rVar.f162928b = b;
                rVar.f162927a |= 1;
                h.mo33859g(new C28423g(C28377am.f77114b, (C60218r) qVar.build()));
            } catch (IOException unused) {
                C58976aa aaVar = C58975e.f156826a;
            }
        }
        aap aap = aas.f134676n;
        if (aap == null) {
            aap = aap.f134650h;
        }
        if ((aap.f134652a & 8) != 0) {
            aap aap2 = aas.f134676n;
            if (aap2 == null) {
                aap2 = aap.f134650h;
            }
            C63204j jVar = aap2.f134657f;
            if (jVar == null) {
                jVar = C63204j.f170749e;
            }
            h.mo33858f(new C28353e(C28376al.f77109a, jVar));
        }
        C28439i b2 = this.f94667a.mo33918b(h);
        this.f94667a.mo33920d(b2);
        C28463g gVar = this.f94667a;
        C28313c h2 = m64698h(46142, C58836b.f156633a, axVar, 1, -1);
        gVar.mo33919c(b2);
        C28470n.m53226a(b2, h2);
        C62940bt r0 = C62942bv.checkIsLite(abc.f134692p);
        aas.mo58887l(r0);
        Object l = aas.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C47887u uVar = ((abc) obj).f134698e;
        if (uVar == null) {
            uVar = C47887u.f123976l;
        }
        int i = 0;
        for (C47875i iVar : uVar.f123986i) {
            C28463g gVar2 = this.f94667a;
            int i2 = iVar.f123952f;
            C28313c h3 = m64698h(i2 == 0 ? 46143 : i2, C58836b.f156633a, axVar, i + 2, i);
            gVar2.mo33919c(b2);
            C28470n.m53226a(b2, h3);
            i++;
        }
        this.f94667a.mo33922f();
        return new ParcelableSyntheticTree(b2);
    }

    /* renamed from: g */
    public final C60870cx mo40051g(ParcelableSyntheticTree parcelableSyntheticTree, TreeNodeRef treeNodeRef, ajz ajz) {
        C28439i a;
        C28440j h = C28442l.m53142h();
        C28439i a2 = parcelableSyntheticTree.mo33924a(this.f94667a, C62921ba.m95368a());
        if (!(treeNodeRef == null || (a = treeNodeRef.mo33927a(a2)) == null)) {
            a2 = a;
        }
        h.mo33895b(new C28441k(C36220ap.f94628b, ajz));
        C60870cx b = this.f94669c.mo33852b(h.mo33894a(), a2);
        this.f94667a.mo33922f();
        return b;
    }
}
