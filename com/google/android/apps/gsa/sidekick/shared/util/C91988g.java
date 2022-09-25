package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.p489g.p494d.C9137a;
import com.google.android.apps.p489g.p494d.C9140ac;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9164b;
import com.google.android.apps.p489g.p494d.C9189by;
import com.google.android.apps.p489g.p494d.C9190bz;
import com.google.android.apps.p489g.p494d.C9192ca;
import com.google.android.apps.p489g.p494d.C9195cd;
import com.google.android.apps.p489g.p494d.C9223de;
import com.google.android.apps.p489g.p494d.C9224df;
import com.google.android.apps.p489g.p494d.C9260eo;
import com.google.android.apps.p489g.p494d.C9261ep;
import com.google.android.apps.p489g.p494d.C9281y;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7523ak;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7598cy;
import com.google.p375ai.p378b.C7605de;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C7805kp;
import com.google.p375ai.p378b.C7971qt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.g */
/* compiled from: PG */
public final class C91988g {

    /* renamed from: a */
    private static final C59071e f256483a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.util.g");

    /* renamed from: a */
    public static void m150964a(C9281y yVar, C7526an anVar) {
        yVar.copyOnWrite();
        C9141ad adVar = (C9141ad) yVar.instance;
        C9141ad adVar2 = C9141ad.f31521K;
        anVar.getClass();
        adVar.f31540f = anVar;
        adVar.f31535a |= 8;
        if ((((C9141ad) yVar.instance).f31535a & 4) == 0 && (anVar.f26051a & 32) != 0) {
            try {
                int a = C91987f.m150963a(anVar);
                C9137a aVar = (C9137a) C9164b.f31642o.createBuilder();
                aVar.copyOnWrite();
                C9164b bVar = (C9164b) aVar.instance;
                bVar.f31644a |= 1;
                bVar.f31645b = a;
                yVar.copyOnWrite();
                C9141ad adVar3 = (C9141ad) yVar.instance;
                C9164b bVar2 = (C9164b) aVar.build();
                bVar2.getClass();
                adVar3.f31539e = bVar2;
                adVar3.f31535a |= 4;
            } catch (C91963an e) {
                ((C59052c) ((C59052c) ((C59052c) f256483a.mo56225c()).mo56382g(e)).mo56372aa(11941)).mo56386p("Could not find icon resource ID");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.apps.p489g.p494d.C9141ad m150965b(com.google.android.apps.p489g.p494d.C9140ac r4, com.google.p375ai.p378b.C7681g r5, int r6) {
        /*
            com.google.android.apps.g.d.ad r0 = com.google.android.apps.p489g.p494d.C9141ad.f31521K
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.g.d.y r0 = (com.google.android.apps.p489g.p494d.C9281y) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.g.d.ad r1 = (com.google.android.apps.p489g.p494d.C9141ad) r1
            int r4 = r4.f31520am
            r1.f31537c = r4
            int r4 = r1.f31535a
            r4 = r4 | 1
            r1.f31535a = r4
            int r4 = r5.f26835cv
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.g.d.ad r5 = (com.google.android.apps.p489g.p494d.C9141ad) r5
            int r1 = r5.f31535a
            r1 = r1 | 2
            r5.f31535a = r1
            r5.f31538d = r4
            r4 = 0
            r5 = 0
            if (r6 != 0) goto L_0x0035
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x007c
            r6 = 0
        L_0x0035:
            com.google.android.apps.g.d.b r1 = com.google.android.apps.p489g.p494d.C9164b.f31642o
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.g.d.a r1 = (com.google.android.apps.p489g.p494d.C9137a) r1
            if (r6 == 0) goto L_0x004f
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.g.d.b r2 = (com.google.android.apps.p489g.p494d.C9164b) r2
            int r3 = r2.f31644a
            r3 = r3 | 1
            r2.f31644a = r3
            r2.f31645b = r6
            goto L_0x0055
        L_0x004f:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x009f
        L_0x0055:
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.android.apps.g.d.b r6 = (com.google.android.apps.p489g.p494d.C9164b) r6
            int r2 = r6.f31644a
            r2 = r2 | 512(0x200, float:7.175E-43)
            r6.f31644a = r2
            r6.f31654k = r4
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.g.d.ad r4 = (com.google.android.apps.p489g.p494d.C9141ad) r4
            com.google.protobuf.bv r6 = r1.build()
            com.google.android.apps.g.d.b r6 = (com.google.android.apps.p489g.p494d.C9164b) r6
            r6.getClass()
            r4.f31539e = r6
            int r6 = r4.f31535a
            r6 = r6 | 4
            r4.f31535a = r6
        L_0x007c:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L_0x0097
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L_0x008f
            com.google.protobuf.bv r4 = r0.build()
            com.google.android.apps.g.d.ad r4 = (com.google.android.apps.p489g.p494d.C9141ad) r4
            return r4
        L_0x008f:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.g.d.ad r4 = (com.google.android.apps.p489g.p494d.C9141ad) r4
            throw r5
        L_0x0097:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.g.d.ad r4 = (com.google.android.apps.p489g.p494d.C9141ad) r4
            throw r5
        L_0x009f:
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.g.d.b r4 = (com.google.android.apps.p489g.p494d.C9164b) r4
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.util.C91988g.m150965b(com.google.android.apps.g.d.ac, com.google.ai.b.g, int):com.google.android.apps.g.d.ad");
    }

    /* renamed from: c */
    public static final C9141ad m150966c(C7526an anVar, C7681g gVar, int i) {
        C9281y yVar;
        String str;
        int i2 = anVar.f26051a;
        String str2 = null;
        if ((i2 & 2) != 0) {
            if ((i2 & 128) != 0) {
                str2 = anVar.f26058h;
            }
            yVar = (C9281y) m150967d(anVar.f26053c, str2, gVar, i).toBuilder();
        } else if ((i2 & 8) != 0) {
            if ((i2 & 256) != 0) {
                str = anVar.f26059i;
            } else {
                str = null;
            }
            if ((i2 & 2048) != 0) {
                str2 = anVar.f26061k;
            }
            yVar = (C9281y) m150968e(anVar.f26055e, (C7805kp) null, str, str2, (String) null, gVar, i).toBuilder();
        } else if ((i2 & 4) == 0) {
            return null;
        } else {
            Intent intent = new Intent(anVar.f26054d);
            intent.setFlags(268435456);
            for (C7523ak akVar : anVar.f26056f) {
                int i3 = akVar.f26043a;
                if ((i3 & 2) != 0) {
                    intent.putExtra(akVar.f26044b, akVar.f26045c);
                } else if ((i3 & 4) != 0) {
                    intent.putExtra(akVar.f26044b, akVar.f26046d);
                } else if ((i3 & 16) != 0) {
                    intent.putExtra(akVar.f26044b, akVar.f26047e);
                }
            }
            yVar = (C9281y) m150967d(intent.toUri(1), (String) null, gVar, i).toBuilder();
        }
        m150964a(yVar, anVar);
        return (C9141ad) yVar.build();
    }

    /* renamed from: d */
    public static final C9141ad m150967d(String str, String str2, C7681g gVar, int i) {
        C9189by byVar = (C9189by) C9195cd.f31746j.createBuilder();
        byVar.copyOnWrite();
        C9195cd cdVar = (C9195cd) byVar.instance;
        str.getClass();
        cdVar.f31748a |= 2;
        cdVar.f31750c = str;
        if (str2 != null) {
            byVar.copyOnWrite();
            C9195cd cdVar2 = (C9195cd) byVar.instance;
            cdVar2.f31748a |= 4;
            cdVar2.f31751d = str2;
        }
        C9281y yVar = (C9281y) m150965b(C9140ac.OPEN_URL, gVar, i).toBuilder();
        yVar.copyOnWrite();
        C9141ad adVar = (C9141ad) yVar.instance;
        C9195cd cdVar3 = (C9195cd) byVar.build();
        cdVar3.getClass();
        adVar.f31541g = cdVar3;
        adVar.f31535a |= 16;
        return (C9141ad) yVar.build();
    }

    /* renamed from: e */
    public static final C9141ad m150968e(String str, C7805kp kpVar, String str2, String str3, String str4, C7681g gVar, int i) {
        C7598cy cyVar = (C7598cy) C7605de.f26269s.createBuilder();
        cyVar.copyOnWrite();
        C7605de deVar = (C7605de) cyVar.instance;
        str.getClass();
        deVar.f26271a |= 1;
        deVar.f26272b = str;
        if (kpVar != null) {
            cyVar.copyOnWrite();
            C7605de deVar2 = (C7605de) cyVar.instance;
            deVar2.f26273c = kpVar;
            deVar2.f26271a |= 2;
        }
        if (str2 != null) {
            cyVar.copyOnWrite();
            C7605de deVar3 = (C7605de) cyVar.instance;
            deVar3.f26271a |= 4;
            deVar3.f26274d = str2;
        }
        if (str3 != null) {
            cyVar.copyOnWrite();
            C7605de deVar4 = (C7605de) cyVar.instance;
            deVar4.f26271a |= 8;
            deVar4.f26275e = str3;
        }
        if (str4 != null) {
            cyVar.copyOnWrite();
            C7605de deVar5 = (C7605de) cyVar.instance;
            deVar5.f26271a |= 256;
            deVar5.f26280j = str4;
        }
        C9281y yVar = (C9281y) m150965b(C9140ac.SEARCH, gVar, i).toBuilder();
        yVar.copyOnWrite();
        C9141ad adVar = (C9141ad) yVar.instance;
        C7605de deVar6 = (C7605de) cyVar.build();
        deVar6.getClass();
        adVar.f31543i = deVar6;
        adVar.f31535a |= 64;
        return (C9141ad) yVar.build();
    }

    /* renamed from: f */
    public static final C9141ad m150969f(C7708h hVar, C9224df dfVar, C7971qt qtVar, C7681g gVar, int i) {
        C9223de deVar = (C9223de) dfVar.toBuilder();
        if (qtVar != null) {
            deVar.copyOnWrite();
            C9224df dfVar2 = (C9224df) deVar.instance;
            dfVar2.f31882b = qtVar;
            dfVar2.f31881a |= 1;
        }
        if ((hVar.f26896a & 64) != 0) {
            C7799kj kjVar = hVar.f26903h;
            if (kjVar == null) {
                kjVar = C7799kj.f27263h;
            }
            deVar.copyOnWrite();
            C9224df dfVar3 = (C9224df) deVar.instance;
            kjVar.getClass();
            dfVar3.f31889i = kjVar;
            dfVar3.f31881a |= 64;
        }
        if ((((C9224df) deVar.instance).f31881a & 2) == 0) {
            if (qtVar != null && (qtVar.f27999a & 1) != 0) {
                String str = qtVar.f28000b;
                deVar.copyOnWrite();
                C9224df dfVar4 = (C9224df) deVar.instance;
                str.getClass();
                dfVar4.f31881a |= 2;
                dfVar4.f31883c = str;
            } else if ((hVar.f26896a & 2) != 0) {
                String str2 = hVar.f26898c;
                deVar.copyOnWrite();
                C9224df dfVar5 = (C9224df) deVar.instance;
                str2.getClass();
                dfVar5.f31881a |= 2;
                dfVar5.f31883c = str2;
            }
        }
        C9281y yVar = (C9281y) m150965b(C9140ac.SECOND_SCREEN, gVar, i).toBuilder();
        yVar.copyOnWrite();
        C9141ad adVar = (C9141ad) yVar.instance;
        C9224df dfVar6 = (C9224df) deVar.build();
        dfVar6.getClass();
        adVar.f31545k = dfVar6;
        adVar.f31535a |= 256;
        return (C9141ad) yVar.build();
    }

    /* renamed from: g */
    public static final C9141ad m150970g(Intent intent, C7681g gVar) {
        Bundle bundle;
        String str;
        String uri = intent.toUri(1);
        Bundle bundle2 = null;
        C9281y yVar = (C9281y) m150967d(uri, (String) null, gVar, R.drawable.quantum_ic_arrow_forward_white_24).toBuilder();
        try {
            Intent parseUri = Intent.parseUri(uri, 1);
            if (parseUri == null) {
                bundle = null;
            } else {
                bundle = parseUri.getExtras();
            }
            if (intent != null) {
                bundle2 = intent.getExtras();
            }
            if (!(bundle == null || bundle2 == null || bundle.size() == bundle2.size())) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : bundle2.keySet()) {
                    Object obj = bundle2.get(str2);
                    if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short)) {
                        if (obj instanceof ArrayList) {
                            ArrayList arrayList2 = (ArrayList) obj;
                            C9190bz bzVar = (C9190bz) C9192ca.f31740d.createBuilder();
                            bzVar.copyOnWrite();
                            C9192ca caVar = (C9192ca) bzVar.instance;
                            str2.getClass();
                            caVar.f31742a |= 1;
                            caVar.f31743b = str2;
                            C9192ca caVar2 = (C9192ca) bzVar.build();
                            if (arrayList2.isEmpty() || !(arrayList2.get(0) instanceof String)) {
                                throw new UnsupportedOperationException("Unsupported list type");
                            }
                            arrayList.add(caVar2);
                        } else {
                            if (obj == null) {
                                str = "null";
                            } else {
                                str = obj.getClass().getName();
                            }
                            throw new UnsupportedOperationException("Unsupported extra type: " + str);
                        }
                    }
                }
                C9195cd cdVar = ((C9141ad) yVar.instance).f31541g;
                if (cdVar == null) {
                    cdVar = C9195cd.f31746j;
                }
                C9189by byVar = (C9189by) cdVar.toBuilder();
                byVar.copyOnWrite();
                ((C9195cd) byVar.instance).f31754g = C9195cd.emptyProtobufList();
                byVar.copyOnWrite();
                C9195cd cdVar2 = (C9195cd) byVar.instance;
                C62971cq cqVar = cdVar2.f31754g;
                if (!cqVar.mo58948c()) {
                    cdVar2.f31754g = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) arrayList, (List) cdVar2.f31754g);
                yVar.copyOnWrite();
                C9141ad adVar = (C9141ad) yVar.instance;
                C9195cd cdVar3 = (C9195cd) byVar.build();
                cdVar3.getClass();
                adVar.f31541g = cdVar3;
                adVar.f31535a |= 16;
            }
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) f256483a.mo56225c()).mo56382g(e)).mo56372aa(11940)).mo56386p("Unable to convert Intent to URI");
        }
        return (C9141ad) yVar.build();
    }

    /* renamed from: h */
    public static final C9141ad m150971h(String str, String str2, String[] strArr, C7681g gVar) {
        C9281y yVar = (C9281y) m150965b(C9140ac.WEB_VIEW, gVar, 0).toBuilder();
        C9260eo eoVar = (C9260eo) C9261ep.f32026h.createBuilder();
        eoVar.copyOnWrite();
        C9261ep epVar = (C9261ep) eoVar.instance;
        str.getClass();
        epVar.f32028a |= 1;
        epVar.f32029b = str;
        eoVar.copyOnWrite();
        C9261ep epVar2 = (C9261ep) eoVar.instance;
        epVar2.f32028a |= 2;
        epVar2.f32030c = "mail";
        eoVar.copyOnWrite();
        C9261ep epVar3 = (C9261ep) eoVar.instance;
        str2.getClass();
        epVar3.f32028a |= 4;
        epVar3.f32031d = str2;
        eoVar.copyOnWrite();
        C9261ep epVar4 = (C9261ep) eoVar.instance;
        epVar4.f32028a |= 8;
        epVar4.f32032e = true;
        eoVar.copyOnWrite();
        C9261ep epVar5 = (C9261ep) eoVar.instance;
        epVar5.f32028a |= 16;
        epVar5.f32033f = true;
        eoVar.mo17458a(Arrays.asList(strArr));
        yVar.copyOnWrite();
        C9141ad adVar = (C9141ad) yVar.instance;
        C9261ep epVar6 = (C9261ep) eoVar.build();
        epVar6.getClass();
        adVar.f31546l = epVar6;
        adVar.f31535a |= 512;
        return (C9141ad) yVar.build();
    }
}
