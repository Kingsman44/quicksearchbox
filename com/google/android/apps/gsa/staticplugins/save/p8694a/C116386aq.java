package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.google.C54649b;
import com.google.C6578a;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4570p.C60353ai;
import com.google.common.p4552o.p4570p.C60354aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57618ch;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57643df;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.aq */
/* compiled from: PG */
final class C116386aq implements C22868d {

    /* renamed from: a */
    final /* synthetic */ String f322747a;

    /* renamed from: b */
    final /* synthetic */ long f322748b;

    /* renamed from: c */
    final /* synthetic */ C116388as f322749c;

    public C116386aq(C116388as asVar, String str, long j) {
        this.f322749c = asVar;
        this.f322747a = str;
        this.f322748b = j;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C116388as.f322750a.mo56225c()).mo56382g(th)).mo56372aa(31798)).mo56386p("Worker returned failure!");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C57643df dfVar;
        C57643df dfVar2;
        C57643df dfVar3;
        C57643df dfVar4;
        List<C57618ch> list = (List) obj;
        if (!list.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (C57618ch chVar : list) {
                C57569am amVar = chVar.f153911a;
                if (amVar != null) {
                    if (amVar.f153799a == 9) {
                        try {
                            hashSet.add(C54649b.m87519a(((C57643df) amVar.f153800b).f153947a));
                            if (amVar.f153799a == 9) {
                                dfVar = (C57643df) amVar.f153800b;
                            } else {
                                dfVar = C57643df.f153945e;
                            }
                            if (!dfVar.f153949c.isEmpty()) {
                                if (amVar.f153799a == 9) {
                                    dfVar4 = (C57643df) amVar.f153800b;
                                } else {
                                    dfVar4 = C57643df.f153945e;
                                }
                                hashSet.add(C54649b.m87519a(dfVar4.f153949c));
                            }
                            if (amVar.f153799a == 9) {
                                dfVar2 = (C57643df) amVar.f153800b;
                            } else {
                                dfVar2 = C57643df.f153945e;
                            }
                            if (!dfVar2.f153950d.isEmpty()) {
                                if (amVar.f153799a == 9) {
                                    dfVar3 = (C57643df) amVar.f153800b;
                                } else {
                                    dfVar3 = C57643df.f153945e;
                                }
                                hashSet.add(C54649b.m87519a(dfVar3.f153950d));
                            }
                        } catch (C6578a unused) {
                        }
                    } else {
                        ((C59052c) ((C59052c) C116388as.f322750a.mo56226d()).mo56372aa(31799)).mo56386p("Response contains saved webpage without URL");
                    }
                }
            }
            int a = this.f322749c.f322755f.mo102663a(this.f322747a);
            int size = hashSet.size();
            this.f322749c.f322755f.mo102665c(this.f322747a, hashSet);
            C116372ac acVar = this.f322749c.f322755f;
            String str = this.f322747a;
            long j = this.f322748b;
            C86337q b = acVar.f322702a.mo80076b();
            b.mo80072g("account-updated-ms:".concat(str), j);
            b.apply();
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1080;
            C60353ai aiVar = (C60353ai) C60354aj.f163354d.createBuilder();
            aiVar.copyOnWrite();
            C60354aj ajVar = (C60354aj) aiVar.instance;
            ajVar.f163356a |= 1;
            ajVar.f163357b = a;
            aiVar.copyOnWrite();
            C60354aj ajVar2 = (C60354aj) aiVar.instance;
            ajVar2.f163356a |= 2;
            ajVar2.f163358c = size;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            C60354aj ajVar3 = (C60354aj) aiVar.build();
            ajVar3.getClass();
            ufVar2.f164150bD = ajVar3;
            ufVar2.f164253h |= 8192;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            return;
        }
        mo17701gl(new Exception("Failed to update cache: Invalid ListItemsResponse"));
    }
}
