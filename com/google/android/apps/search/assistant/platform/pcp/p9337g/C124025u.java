package com.google.android.apps.search.assistant.platform.pcp.p9337g;

import android.content.ContentValues;
import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124048ad;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124086bm;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124109ch;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124117co;
import com.google.android.apps.search.assistant.platform.pcp.validity.C124169r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3994s.p3995a.C53126ci;
import com.google.assistant.p3994s.p3995a.C53153di;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.assistant.p3994s.p3995a.C53204ff;
import com.google.assistant.p3994s.p3995a.C53212fn;
import com.google.assistant.p3994s.p3995a.C53218ft;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.assistant.p3994s.p3995a.C53247gv;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60836bq;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69258x;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.g.u */
/* compiled from: PG */
public final class C124025u {

    /* renamed from: a */
    public static final C59071e f342561a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.g.u");

    /* renamed from: b */
    public final Executor f342562b;

    /* renamed from: c */
    public final C124017m f342563c;

    /* renamed from: d */
    public final C123623b f342564d;

    /* renamed from: e */
    public final C21370a f342565e;

    /* renamed from: f */
    public final Optional f342566f;

    /* renamed from: g */
    public final C60836bq f342567g = new C60836bq();

    /* renamed from: h */
    public final Map f342568h = new HashMap();

    /* renamed from: i */
    public final Map f342569i = new HashMap();

    /* renamed from: j */
    public final Map f342570j = new HashMap();

    /* renamed from: k */
    public final Map f342571k = new HashMap();

    /* renamed from: l */
    public final List f342572l = new ArrayList();

    /* renamed from: m */
    public final C124100bz f342573m;

    /* renamed from: n */
    public final C124117co f342574n;

    /* renamed from: o */
    private final AccountId f342575o;

    /* renamed from: p */
    private final Context f342576p;

    public C124025u(Executor executor, C124017m mVar, Context context, AccountId accountId, C21370a aVar, Optional optional, C124100bz bzVar, C124117co coVar) {
        this.f342562b = executor;
        this.f342563c = mVar;
        this.f342564d = C123624c.m202992a(context, accountId);
        this.f342565e = aVar;
        this.f342576p = context;
        this.f342575o = accountId;
        this.f342566f = optional;
        this.f342573m = bzVar;
        this.f342574n = coVar;
    }

    /* renamed from: a */
    public final ContentValues mo106233a(C53126ci ciVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i = ciVar.f139233c;
        if (i == 1) {
            String str = ciVar.f139232b;
            C53153di diVar = ciVar.f139234d;
            if (diVar == null) {
                diVar = C53153di.f139315c;
            }
            C62940bt r3 = C62942bv.checkIsLite(C53245gt.f139565o);
            diVar.mo58887l(r3);
            Object l = diVar.f169962ag.mo58854l(r3.f169971d);
            if (l == null) {
                obj = r3.f169969b;
            } else {
                obj = r3.mo58889c(l);
            }
            MessageLite messageLite = (MessageLite) obj;
            C53153di diVar2 = ciVar.f139234d;
            if (diVar2 == null) {
                diVar2 = C53153di.f139315c;
            }
            return C123611ad.m202943b(i, str, messageLite, diVar2.f139318b.getBytes(), ciVar.f139236f.mo59174N(), this.f342565e.mo26870b());
        } else if (i == 7) {
            String str2 = ciVar.f139232b;
            C53153di diVar3 = ciVar.f139234d;
            if (diVar3 == null) {
                diVar3 = C53153di.f139315c;
            }
            C62940bt r32 = C62942bv.checkIsLite(C53212fn.f139468h);
            diVar3.mo58887l(r32);
            Object l2 = diVar3.f169962ag.mo58854l(r32.f169971d);
            if (l2 == null) {
                obj2 = r32.f169969b;
            } else {
                obj2 = r32.mo58889c(l2);
            }
            MessageLite messageLite2 = (MessageLite) obj2;
            C53153di diVar4 = ciVar.f139234d;
            if (diVar4 == null) {
                diVar4 = C53153di.f139315c;
            }
            return C123611ad.m202943b(i, str2, messageLite2, diVar4.f139318b.getBytes(), ciVar.f139236f.mo59174N(), this.f342565e.mo26870b());
        } else if (i == 9) {
            String str3 = ciVar.f139232b;
            C53153di diVar5 = ciVar.f139234d;
            if (diVar5 == null) {
                diVar5 = C53153di.f139315c;
            }
            C62940bt r33 = C62942bv.checkIsLite(C53218ft.f139482b);
            diVar5.mo58887l(r33);
            Object l3 = diVar5.f169962ag.mo58854l(r33.f169971d);
            if (l3 == null) {
                obj3 = r33.f169969b;
            } else {
                obj3 = r33.mo58889c(l3);
            }
            MessageLite messageLite3 = (MessageLite) obj3;
            C53153di diVar6 = ciVar.f139234d;
            if (diVar6 == null) {
                diVar6 = C53153di.f139315c;
            }
            return C123611ad.m202943b(i, str3, messageLite3, diVar6.f139318b.getBytes(), ciVar.f139236f.mo59174N(), this.f342565e.mo26870b());
        } else if (i == 18) {
            String str4 = ciVar.f139232b;
            C53153di diVar7 = ciVar.f139234d;
            if (diVar7 == null) {
                diVar7 = C53153di.f139315c;
            }
            C62940bt r34 = C62942bv.checkIsLite(C53190es.f139394t);
            diVar7.mo58887l(r34);
            Object l4 = diVar7.f169962ag.mo58854l(r34.f169971d);
            if (l4 == null) {
                obj4 = r34.f169969b;
            } else {
                obj4 = r34.mo58889c(l4);
            }
            MessageLite messageLite4 = (MessageLite) obj4;
            C53153di diVar8 = ciVar.f139234d;
            if (diVar8 == null) {
                diVar8 = C53153di.f139315c;
            }
            return C123611ad.m202943b(i, str4, messageLite4, diVar8.f139318b.getBytes(), ciVar.f139236f.mo59174N(), this.f342565e.mo26870b());
        } else if (i == 101) {
            String str5 = ciVar.f139232b;
            C53153di diVar9 = ciVar.f139234d;
            if (diVar9 == null) {
                diVar9 = C53153di.f139315c;
            }
            C62940bt r35 = C62942bv.checkIsLite(C53204ff.f139459b);
            diVar9.mo58887l(r35);
            Object l5 = diVar9.f169962ag.mo58854l(r35.f169971d);
            if (l5 == null) {
                obj5 = r35.f169969b;
            } else {
                obj5 = r35.mo58889c(l5);
            }
            MessageLite messageLite5 = (MessageLite) obj5;
            C53153di diVar10 = ciVar.f139234d;
            if (diVar10 == null) {
                diVar10 = C53153di.f139315c;
            }
            return C123611ad.m202943b(i, str5, messageLite5, diVar10.f139318b.getBytes(), ciVar.f139236f.mo59174N(), this.f342565e.mo26870b());
        } else if (i != 110) {
            String str6 = ciVar.f139232b;
            C53153di diVar11 = ciVar.f139234d;
            if (diVar11 == null) {
                diVar11 = C53153di.f139315c;
            }
            C53153di diVar12 = ciVar.f139234d;
            if (diVar12 == null) {
                diVar12 = C53153di.f139315c;
            }
            return C123611ad.m202943b(i, str6, diVar11, diVar12.f139318b.getBytes(), ciVar.f139236f.mo59174N(), this.f342565e.mo26870b());
        } else {
            String str7 = ciVar.f139232b;
            C53153di diVar13 = ciVar.f139234d;
            if (diVar13 == null) {
                diVar13 = C53153di.f139315c;
            }
            C62940bt r36 = C62942bv.checkIsLite(C53247gv.f139581c);
            diVar13.mo58887l(r36);
            Object l6 = diVar13.f169962ag.mo58854l(r36.f169971d);
            if (l6 == null) {
                obj6 = r36.f169969b;
            } else {
                obj6 = r36.mo58889c(l6);
            }
            MessageLite messageLite6 = (MessageLite) obj6;
            C53153di diVar14 = ciVar.f139234d;
            if (diVar14 == null) {
                diVar14 = C53153di.f139315c;
            }
            return C123611ad.m202943b(i, str7, messageLite6, diVar14.f139318b.getBytes(), ciVar.f139236f.mo59174N(), this.f342565e.mo26870b());
        }
    }

    /* renamed from: b */
    public final List mo106234b(C53126ci ciVar, long j) {
        ArrayList arrayList = new ArrayList();
        C58485gu b = C124086bm.m203508a(this.f342576p, this.f342575o).mo106279b(ciVar.f139233c);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C53306j jVar = (C53306j) b.get(i);
            Optional g = C124048ad.m203471a(this.f342576p, this.f342575o).mo106254g(jVar, ciVar.f139233c);
            if (g.isPresent() && (((C69258x) g.get()).f185381a & 1) != 0) {
                arrayList.add(C124169r.m203613h(Optional.m71637of(this.f342575o), ciVar.f139232b, ciVar.f139233c, jVar.f139793X, C124109ch.m203531a(Instant.ofEpochMilli(j), (C69258x) g.get())));
            }
        }
        return arrayList;
    }
}
