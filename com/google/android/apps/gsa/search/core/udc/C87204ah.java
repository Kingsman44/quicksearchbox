package com.google.android.apps.gsa.search.core.udc;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90109fg;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.udc.ah */
/* compiled from: PG */
public final class C87204ah {

    /* renamed from: a */
    public static final C59071e f235611a = C59071e.m91332i("com.google.android.apps.gsa.search.core.udc.ah");

    /* renamed from: b */
    public static final C56116b[] f235612b = {C56116b.WEB_AND_APP, C56116b.SUPPL_WEB_AND_APP, C56116b.SUPPL_WEB_AND_APP_DEVICE_LEVEL, C56116b.DEVICE_INFO, C56116b.DEVICE_INFO_DEVICE_LEVEL, C56116b.LOCATION_HISTORY, C56116b.LOCATION_REPORTING, C56116b.VOICE_AND_AUDIO};

    /* renamed from: c */
    public final C86338r f235613c;

    /* renamed from: d */
    public final Map f235614d = new HashMap();

    /* renamed from: e */
    private final Context f235615e;

    /* renamed from: f */
    private final C68214a f235616f;

    /* renamed from: g */
    private final C86130z f235617g;

    /* renamed from: h */
    private final C86124t f235618h;

    public C87204ah(Context context, C86338r rVar, C68214a aVar, C86130z zVar, C86124t tVar) {
        this.f235615e = context;
        this.f235613c = rVar;
        this.f235616f = aVar;
        this.f235617g = zVar;
        this.f235618h = tVar;
    }

    /* renamed from: c */
    public static Map m141022c(C87197aa aaVar) {
        EnumMap enumMap = new EnumMap(C56116b.class);
        for (C87229y yVar : aaVar.f235606a) {
            C56116b a = C56116b.m87897a(yVar.f235652b);
            if (a == null) {
                a = C56116b.UNKNOWN_ID;
            }
            enumMap.put(a, yVar);
        }
        return enumMap;
    }

    /* renamed from: d */
    public static void m141023d(Map map, C56116b bVar) {
        C87224t tVar;
        if (map.containsKey(bVar)) {
            tVar = (C87224t) ((C87229y) map.get(bVar)).toBuilder();
        } else {
            tVar = (C87224t) C87229y.f235649e.createBuilder();
            tVar.copyOnWrite();
            C87229y yVar = (C87229y) tVar.instance;
            yVar.f235652b = bVar.f149511l;
            yVar.f235651a |= 1;
        }
        tVar.copyOnWrite();
        C87229y yVar2 = (C87229y) tVar.instance;
        yVar2.f235653c = 1;
        yVar2.f235651a |= 2;
        tVar.copyOnWrite();
        C87229y yVar3 = (C87229y) tVar.instance;
        yVar3.f235654d = 1;
        yVar3.f235651a |= 4;
        map.put(bVar, (C87229y) tVar.build());
    }

    /* renamed from: a */
    public final C60870cx mo80835a(Account account) {
        String str = account.name;
        C87198ab abVar = (C87198ab) ((C58833ax) this.f235616f.mo27525b()).mo56107c();
        abVar.getClass();
        C60870cx a = abVar.mo80833a(this.f235615e, account, this.f235618h, Arrays.asList(f235612b));
        C60856cj.m92911t(a, new C87203ag(), C60826bg.f164896a);
        C60870cx g = C60922j.m93044g(a, new C87202af(this, account), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: b */
    public final Map mo80836b(Account account) {
        Map map;
        C87197aa aaVar;
        synchronized (this.f235614d) {
            Map map2 = (Map) this.f235614d.get(account);
            if (map2 != null) {
                return map2;
            }
            C86338r rVar = this.f235613c;
            String str = account.name;
            byte[] e = rVar.mo80079e("udc_cached_settings_" + str, (byte[]) null);
            if (e != null) {
                try {
                    aaVar = (C87197aa) C62942bv.parseFrom((C62942bv) C87197aa.f235604b, e, C62921ba.m95368a());
                } catch (C62974ct e2) {
                    ((C59052c) ((C59052c) ((C59052c) f235611a.mo56226d()).mo56382g(e2)).mo56372aa(9373)).mo56386p("Error parsing proto");
                    aaVar = C87197aa.f235604b;
                }
                map = m141022c(aaVar);
            } else {
                map = new EnumMap(C56116b.class);
            }
            this.f235614d.put(account, map);
            return map;
        }
    }

    /* renamed from: e */
    public final boolean mo80837e(Account account, C56116b bVar) {
        return mo80836b(account).get(bVar) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = com.google.android.apps.gsa.search.core.udc.C87226v.m141057a(r1.f235654d);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo80838f(android.accounts.Account r1, com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b r2) {
        /*
            r0 = this;
            java.util.Map r1 = r0.mo80836b(r1)
            java.lang.Object r1 = r1.get(r2)
            com.google.android.apps.gsa.search.core.udc.y r1 = (com.google.android.apps.gsa.search.core.udc.C87229y) r1
            if (r1 == 0) goto L_0x001a
            int r1 = r1.f235654d
            int r1 = com.google.android.apps.gsa.search.core.udc.C87226v.m141057a(r1)
            if (r1 != 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            r2 = 2
            if (r1 != r2) goto L_0x001a
            r1 = 1
            return r1
        L_0x001a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.udc.C87204ah.mo80838f(android.accounts.Account, com.google.bn.b.a.a.a.b):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = com.google.android.apps.gsa.search.core.udc.C87228x.m141058a(r1.f235653c);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo80839g(android.accounts.Account r1, com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b r2) {
        /*
            r0 = this;
            java.util.Map r1 = r0.mo80836b(r1)
            java.lang.Object r1 = r1.get(r2)
            com.google.android.apps.gsa.search.core.udc.y r1 = (com.google.android.apps.gsa.search.core.udc.C87229y) r1
            if (r1 == 0) goto L_0x001a
            int r1 = r1.f235653c
            int r1 = com.google.android.apps.gsa.search.core.udc.C87228x.m141058a(r1)
            if (r1 != 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            r2 = 2
            if (r1 != r2) goto L_0x001a
            r1 = 1
            return r1
        L_0x001a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.udc.C87204ah.mo80839g(android.accounts.Account, com.google.bn.b.a.a.a.b):boolean");
    }

    /* renamed from: h */
    public final boolean mo80840h() {
        return this.f235617g.mo79767g(R.bool.udc_settings_cache_enabled) && this.f235618h.mo79746e(C90109fg.f250575q);
    }
}
