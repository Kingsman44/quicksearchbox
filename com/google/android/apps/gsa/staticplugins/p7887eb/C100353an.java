package com.google.android.apps.gsa.staticplugins.p7887eb;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.core.p6519al.p6749o.C85536a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.p7020bd.C89408a;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7192v.C91165r;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60472rd;
import com.google.common.p4552o.C60473re;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p5451f.p5452a.p5453a.p5454a.C69395aq;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69402ax;
import p5451f.p5452a.p5453a.p5454a.C69408bc;
import p5451f.p5452a.p5453a.p5454a.C69410be;
import p5451f.p5452a.p5453a.p5454a.C69411bf;
import p5451f.p5452a.p5453a.p5454a.C69415bj;
import p5451f.p5452a.p5453a.p5454a.C69417bl;
import p5451f.p5452a.p5453a.p5454a.C69418bm;
import p5451f.p5452a.p5453a.p5454a.C69420bo;
import p5451f.p5452a.p5453a.p5454a.C69421bp;
import p5451f.p5452a.p5453a.p5454a.C69431bz;
import p5451f.p5452a.p5453a.p5454a.C69436cd;
import p5451f.p5452a.p5453a.p5454a.C69457v;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.an */
/* compiled from: PG */
public final class C100353an extends C86734a implements C85536a {

    /* renamed from: a */
    public static final C59071e f280614a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.eb.an");

    /* renamed from: b */
    public final C86124t f280615b;

    /* renamed from: c */
    public final C100358d f280616c;

    /* renamed from: f */
    public final C89859i f280617f;

    /* renamed from: g */
    private final C21370a f280618g;

    /* renamed from: h */
    private final Context f280619h;

    /* renamed from: i */
    private final C22871g f280620i;

    /* renamed from: j */
    private final C68214a f280621j;

    /* renamed from: k */
    private final C68214a f280622k;

    /* renamed from: l */
    private final C68214a f280623l;

    /* renamed from: m */
    private final C68214a f280624m;

    /* renamed from: n */
    private final C68214a f280625n;

    /* renamed from: o */
    private final C84515a f280626o;

    /* renamed from: p */
    private final SharedPreferences f280627p;

    /* renamed from: q */
    private final C68214a f280628q;

    /* renamed from: r */
    private final C68214a f280629r;

    /* renamed from: s */
    private final C68214a f280630s;

    /* renamed from: t */
    private final C68214a f280631t;

    /* renamed from: u */
    private final C68214a f280632u;

    /* renamed from: v */
    private final C68214a f280633v;

    /* renamed from: w */
    private final C68214a f280634w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100353an(C21370a aVar, Context context, C86124t tVar, C22871g gVar, C100358d dVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C84515a aVar6, C68214a aVar7, SharedPreferences sharedPreferences, C68214a aVar8, C68214a aVar9, C68214a aVar10, C89859i iVar, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14) {
        super(C118575h.WORKER_AWARE_TIP, "awaretip");
        this.f280618g = aVar;
        this.f280619h = context;
        this.f280615b = tVar;
        this.f280620i = gVar;
        this.f280616c = dVar;
        this.f280621j = aVar2;
        this.f280622k = aVar3;
        this.f280623l = aVar4;
        this.f280624m = aVar5;
        this.f280626o = aVar6;
        this.f280625n = aVar7;
        this.f280627p = sharedPreferences;
        this.f280628q = aVar8;
        this.f280629r = aVar9;
        this.f280630s = aVar10;
        this.f280617f = iVar;
        this.f280631t = aVar11;
        this.f280632u = aVar12;
        this.f280633v = aVar13;
        this.f280634w = aVar14;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r7 != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x055a, code lost:
        r13 = com.google.common.util.concurrent.C60922j.m93044g(r0, new com.google.android.apps.gsa.staticplugins.p7887eb.C100343ad(r12, r14, r13), com.google.common.util.concurrent.C60826bg.f164896a);
        r14 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0567, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r7 != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r7 != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        if (r7 != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        if (r2 > r4) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c6, code lost:
        if (r2 == r4) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        if (r2 < r4) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0131, code lost:
        if (((com.google.android.apps.gsa.shared.p6995aq.C89257aa) r12.f280629r.mo27525b()).mo83227t().length > 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0191, code lost:
        if (com.google.p395al.p417d.p418a.C8590q.m23277b(((android.content.SharedPreferences) ((com.google.android.apps.gsa.search.core.preferences.C86293ai) r12.f280624m.mo27525b()).f233332a.mo27525b()).getInt("search_video_preview_autoplay", com.google.p395al.p417d.p418a.C8590q.AUTOPLAY_UNSPECIFIED.f29729e)) != com.google.p395al.p417d.p418a.C8590q.AUTOPLAY_UNSPECIFIED) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0193, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0195, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01dc, code lost:
        if (r2 == false) goto L_0x01e8;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.common.util.concurrent.C60870cx m166338v(p5451f.p5452a.p5453a.p5454a.C69420bo r13, int r14) {
        /*
            r12 = this;
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            com.google.common.util.concurrent.C60856cj.m92900i(r1)
            int r2 = r13.f185739b
            int r2 = p5451f.p5452a.p5453a.p5454a.C69408bc.m100750a(r2)
            r3 = 1
            if (r2 != 0) goto L_0x0012
            r2 = 1
        L_0x0012:
            dagger.a r4 = r12.f280622k
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r4 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r4
            r5 = -1
            int r2 = r2 + r5
            f.a.a.a.aq r6 = p5451f.p5452a.p5453a.p5454a.C69395aq.TOPDECK_FEATURE_TIP
            r6 = 4
            java.lang.String r7 = "androidVersion"
            switch(r2) {
                case 3: goto L_0x01d2;
                case 4: goto L_0x01c7;
                case 5: goto L_0x0024;
                case 6: goto L_0x01c2;
                case 7: goto L_0x0024;
                case 8: goto L_0x01b1;
                case 9: goto L_0x01a4;
                case 10: goto L_0x0197;
                case 11: goto L_0x01de;
                case 12: goto L_0x0171;
                case 13: goto L_0x0160;
                case 14: goto L_0x0158;
                case 15: goto L_0x0150;
                case 16: goto L_0x0024;
                case 17: goto L_0x0024;
                case 18: goto L_0x0024;
                case 19: goto L_0x01de;
                case 20: goto L_0x0024;
                case 21: goto L_0x0142;
                case 22: goto L_0x0134;
                case 23: goto L_0x0124;
                case 24: goto L_0x0024;
                case 25: goto L_0x0024;
                case 26: goto L_0x0024;
                case 27: goto L_0x00f8;
                case 28: goto L_0x0024;
                case 29: goto L_0x00d0;
                case 30: goto L_0x00a8;
                case 31: goto L_0x0080;
                case 32: goto L_0x0024;
                case 33: goto L_0x0026;
                case 34: goto L_0x0026;
                case 35: goto L_0x0026;
                case 36: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x01e8
        L_0x0026:
            dagger.a r4 = r12.f280621j
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bm r4 = (com.google.android.apps.gsa.assistant.shared.bm) r4
            dagger.a r7 = r12.f280622k
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r7 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r7
            boolean r8 = r4.u()
            boolean r4 = r4.w()
            boolean r9 = r7.mo83823l()
            int r10 = r7.mo83855R()
            if (r10 == 0) goto L_0x0056
            if (r10 == r6) goto L_0x0056
            r11 = 2
            if (r10 != r11) goto L_0x0054
            boolean r7 = r7.mo83879aP()
            if (r7 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r7 = 0
            goto L_0x0057
        L_0x0056:
            r7 = 1
        L_0x0057:
            switch(r2) {
                case 33: goto L_0x0076;
                case 34: goto L_0x006c;
                case 35: goto L_0x0064;
                case 36: goto L_0x005c;
                default: goto L_0x005a;
            }
        L_0x005a:
            goto L_0x0195
        L_0x005c:
            if (r8 != 0) goto L_0x0195
            if (r9 != 0) goto L_0x0195
            if (r7 == 0) goto L_0x0195
            goto L_0x0193
        L_0x0064:
            if (r8 != 0) goto L_0x0195
            if (r9 == 0) goto L_0x0195
            if (r7 == 0) goto L_0x0195
            goto L_0x0193
        L_0x006c:
            if (r8 == 0) goto L_0x0195
            if (r4 == 0) goto L_0x0195
            if (r9 != 0) goto L_0x0195
            if (r7 == 0) goto L_0x0195
            goto L_0x0193
        L_0x0076:
            if (r8 == 0) goto L_0x0195
            if (r4 == 0) goto L_0x0195
            if (r9 == 0) goto L_0x0195
            if (r7 == 0) goto L_0x0195
            goto L_0x0193
        L_0x0080:
            int r2 = android.os.Build.VERSION.SDK_INT
            com.google.protobuf.dn r4 = r13.f185740c
            boolean r8 = r4.containsKey(r7)
            if (r8 == 0) goto L_0x00a2
            java.lang.Object r4 = r4.get(r7)
            f.a.a.a.bh r4 = (p5451f.p5452a.p5453a.p5454a.C69413bh) r4
            int r7 = r4.f185726a
            if (r7 != r3) goto L_0x009d
            java.lang.Object r4 = r4.f185727b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x009e
        L_0x009d:
            r4 = -1
        L_0x009e:
            if (r2 <= r4) goto L_0x0195
            goto L_0x0193
        L_0x00a2:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x00a8:
            int r2 = android.os.Build.VERSION.SDK_INT
            com.google.protobuf.dn r4 = r13.f185740c
            boolean r8 = r4.containsKey(r7)
            if (r8 == 0) goto L_0x00ca
            java.lang.Object r4 = r4.get(r7)
            f.a.a.a.bh r4 = (p5451f.p5452a.p5453a.p5454a.C69413bh) r4
            int r7 = r4.f185726a
            if (r7 != r3) goto L_0x00c5
            java.lang.Object r4 = r4.f185727b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x00c6
        L_0x00c5:
            r4 = -1
        L_0x00c6:
            if (r2 != r4) goto L_0x0195
            goto L_0x0193
        L_0x00ca:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x00d0:
            int r2 = android.os.Build.VERSION.SDK_INT
            com.google.protobuf.dn r4 = r13.f185740c
            boolean r8 = r4.containsKey(r7)
            if (r8 == 0) goto L_0x00f2
            java.lang.Object r4 = r4.get(r7)
            f.a.a.a.bh r4 = (p5451f.p5452a.p5453a.p5454a.C69413bh) r4
            int r7 = r4.f185726a
            if (r7 != r3) goto L_0x00ed
            java.lang.Object r4 = r4.f185727b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x00ee
        L_0x00ed:
            r4 = -1
        L_0x00ee:
            if (r2 >= r4) goto L_0x0195
            goto L_0x0193
        L_0x00f2:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x00f8:
            dagger.a r2 = r12.f280630s
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.e.f r2 = (com.google.android.apps.gsa.shared.p7037e.C89720f) r2
            dagger.a r4 = r2.f242879d
            java.lang.Object r4 = r4.mo27525b()
            com.google.common.base.ax r4 = (com.google.common.base.C58833ax) r4
            boolean r4 = r4.mo56113h()
            if (r4 != 0) goto L_0x0110
            goto L_0x0195
        L_0x0110:
            dagger.a r2 = r2.f242879d
            java.lang.Object r2 = r2.mo27525b()
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            java.lang.Object r2 = r2.mo56107c()
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            boolean r2 = r2.isRequestPinShortcutSupported()
            goto L_0x01dc
        L_0x0124:
            dagger.a r2 = r12.f280629r
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.aq.aa r2 = (com.google.android.apps.gsa.shared.p6995aq.C89257aa) r2
            int[] r2 = r2.mo83227t()
            int r2 = r2.length
            if (r2 <= 0) goto L_0x0195
            goto L_0x0193
        L_0x0134:
            dagger.a r2 = r12.f280629r
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.aq.aa r2 = (com.google.android.apps.gsa.shared.p6995aq.C89257aa) r2
            boolean r2 = r2.mo83221m()
            goto L_0x01dc
        L_0x0142:
            dagger.a r2 = r12.f280629r
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.aq.aa r2 = (com.google.android.apps.gsa.shared.p6995aq.C89257aa) r2
            boolean r2 = r2.mo83220l()
            goto L_0x01dc
        L_0x0150:
            android.content.Context r2 = r12.f280619h
            boolean r2 = com.google.android.apps.gsa.shared.util.p7162d.C90962a.m148577a(r2)
            goto L_0x01dc
        L_0x0158:
            android.content.SharedPreferences r2 = r12.f280627p
            boolean r2 = com.google.android.apps.gsa.shared.p6995aq.C89257aa.m145197o(r2)
            goto L_0x01dc
        L_0x0160:
            com.google.android.libraries.f.a r2 = r12.f280618g
            com.google.android.apps.gsa.search.core.i.t r4 = r12.f280615b
            dagger.a r7 = r12.f280628q
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.libraries.storage.protostore.ab r7 = (com.google.android.libraries.storage.protostore.C42876ab) r7
            boolean r2 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148939n(r2, r4, r7)
            goto L_0x01dc
        L_0x0171:
            dagger.a r2 = r12.f280624m
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.ai r2 = (com.google.android.apps.gsa.search.core.preferences.C86293ai) r2
            dagger.a r2 = r2.f233332a
            java.lang.Object r2 = r2.mo27525b()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            com.google.al.d.a.q r4 = com.google.p395al.p417d.p418a.C8590q.AUTOPLAY_UNSPECIFIED
            int r4 = r4.f29729e
            java.lang.String r7 = "search_video_preview_autoplay"
            int r2 = r2.getInt(r7, r4)
            com.google.al.d.a.q r2 = com.google.p395al.p417d.p418a.C8590q.m23277b(r2)
            com.google.al.d.a.q r4 = com.google.p395al.p417d.p418a.C8590q.AUTOPLAY_UNSPECIFIED
            if (r2 == r4) goto L_0x0195
        L_0x0193:
            r2 = 1
            goto L_0x01dc
        L_0x0195:
            r2 = 0
            goto L_0x01dc
        L_0x0197:
            dagger.a r2 = r12.f280621j
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bm r2 = (com.google.android.apps.gsa.assistant.shared.bm) r2
            boolean r2 = r2.l()
            goto L_0x01dc
        L_0x01a4:
            dagger.a r2 = r12.f280621j
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bm r2 = (com.google.android.apps.gsa.assistant.shared.bm) r2
            boolean r2 = r2.u()
            goto L_0x01dc
        L_0x01b1:
            dagger.a r2 = r12.f280623l
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r2 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r2
            java.lang.String r2 = r2.mo79659F()
            boolean r2 = r4.mo83847J(r2)
            goto L_0x01dc
        L_0x01c2:
            boolean r2 = r4.mo83819h()
            goto L_0x01dc
        L_0x01c7:
            com.google.android.apps.gsa.shared.speech.hotword.a.f r2 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE
            java.lang.String r7 = r4.mo83863Z()
            boolean r2 = r4.mo83833v(r2, r7)
            goto L_0x01dc
        L_0x01d2:
            com.google.android.apps.gsa.shared.speech.hotword.a.f r2 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_GOOGLE
            java.lang.String r7 = r4.mo83863Z()
            boolean r2 = r4.mo83833v(r2, r7)
        L_0x01dc:
            if (r2 == 0) goto L_0x01e8
        L_0x01de:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x055a
        L_0x01e8:
            int r2 = r13.f185739b
            int r2 = p5451f.p5452a.p5453a.p5454a.C69408bc.m100750a(r2)
            if (r2 != 0) goto L_0x01f1
            r2 = 1
        L_0x01f1:
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            int r2 = r2 + r5
            r7 = 28
            if (r2 == r7) goto L_0x04ad
            r7 = 32
            if (r2 == r7) goto L_0x0477
            switch(r2) {
                case 24: goto L_0x0401;
                case 25: goto L_0x03a8;
                case 26: goto L_0x0324;
                default: goto L_0x0201;
            }
        L_0x0201:
            java.lang.String r6 = "stalenessCutoffDays"
            switch(r2) {
                case 37: goto L_0x02e5;
                case 38: goto L_0x029b;
                case 39: goto L_0x027f;
                case 40: goto L_0x0263;
                case 41: goto L_0x0247;
                case 42: goto L_0x0208;
                default: goto L_0x0206;
            }
        L_0x0206:
            goto L_0x054d
        L_0x0208:
            com.google.protobuf.dn r0 = r13.f185740c
            boolean r1 = r0.containsKey(r6)
            if (r1 == 0) goto L_0x0241
            java.lang.Object r0 = r0.get(r6)
            f.a.a.a.bh r0 = (p5451f.p5452a.p5453a.p5454a.C69413bh) r0
            int r1 = r0.f185726a
            if (r1 != r3) goto L_0x0222
            java.lang.Object r0 = r0.f185727b
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
        L_0x0222:
            dagger.a r0 = r12.f280633v
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.play.core.a.e r0 = (com.google.android.play.core.p3525a.C45032e) r0
            com.google.android.gms.tasks.ab r0 = r0.mo48866a()
            com.google.common.util.concurrent.cx r0 = m166340x(r0)
            com.google.android.apps.gsa.staticplugins.eb.h r1 = new com.google.android.apps.gsa.staticplugins.eb.h
            r1.<init>(r5)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x054d
        L_0x0241:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x0247:
            dagger.a r0 = r12.f280633v
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.play.core.a.e r0 = (com.google.android.play.core.p3525a.C45032e) r0
            com.google.android.gms.tasks.ab r0 = r0.mo48866a()
            com.google.common.util.concurrent.cx r0 = m166340x(r0)
            com.google.android.apps.gsa.staticplugins.eb.g r1 = com.google.android.apps.gsa.staticplugins.p7887eb.C100361g.f280653a
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x054d
        L_0x0263:
            dagger.a r0 = r12.f280633v
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.play.core.a.e r0 = (com.google.android.play.core.p3525a.C45032e) r0
            com.google.android.gms.tasks.ab r0 = r0.mo48866a()
            com.google.common.util.concurrent.cx r0 = m166340x(r0)
            com.google.android.apps.gsa.staticplugins.eb.f r1 = com.google.android.apps.gsa.staticplugins.p7887eb.C100360f.f280652a
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x054d
        L_0x027f:
            dagger.a r0 = r12.f280633v
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.play.core.a.e r0 = (com.google.android.play.core.p3525a.C45032e) r0
            com.google.android.gms.tasks.ab r0 = r0.mo48866a()
            com.google.common.util.concurrent.cx r0 = m166340x(r0)
            com.google.android.apps.gsa.staticplugins.eb.ak r1 = com.google.android.apps.gsa.staticplugins.p7887eb.C100350ak.f280611a
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x054d
        L_0x029b:
            com.google.protobuf.dn r2 = r13.f185740c
            java.lang.String r4 = "voiceSearchQueriesForActiveUser"
            boolean r6 = r2.containsKey(r4)
            if (r6 == 0) goto L_0x02df
            java.lang.Object r2 = r2.get(r4)
            f.a.a.a.bh r2 = (p5451f.p5452a.p5453a.p5454a.C69413bh) r2
            int r4 = r2.f185726a
            if (r4 != r3) goto L_0x02b7
            java.lang.Object r2 = r2.f185727b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r5 = r2.intValue()
        L_0x02b7:
            android.content.SharedPreferences r2 = r12.f280627p
            java.lang.String r3 = "agsa_legacy_voice_search_queries_counter_from_active_user"
            int r0 = r2.getInt(r3, r0)
            if (r0 >= r5) goto L_0x02c7
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x054d
        L_0x02c7:
            dagger.a r0 = r12.f280634w
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.al.bp.g r0 = (com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85004g) r0
            com.google.common.util.concurrent.cx r0 = r0.mo78604a()
            com.google.android.apps.gsa.staticplugins.eb.r r1 = com.google.android.apps.gsa.staticplugins.p7887eb.C100372r.f280667a
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x054d
        L_0x02df:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x02e5:
            com.google.protobuf.dn r0 = r13.f185740c
            boolean r1 = r0.containsKey(r6)
            if (r1 == 0) goto L_0x031e
            java.lang.Object r0 = r0.get(r6)
            f.a.a.a.bh r0 = (p5451f.p5452a.p5453a.p5454a.C69413bh) r0
            int r1 = r0.f185726a
            if (r1 != r3) goto L_0x02ff
            java.lang.Object r0 = r0.f185727b
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
        L_0x02ff:
            dagger.a r0 = r12.f280633v
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.play.core.a.e r0 = (com.google.android.play.core.p3525a.C45032e) r0
            com.google.android.gms.tasks.ab r0 = r0.mo48866a()
            com.google.common.util.concurrent.cx r0 = m166340x(r0)
            com.google.android.apps.gsa.staticplugins.eb.aj r1 = new com.google.android.apps.gsa.staticplugins.eb.aj
            r1.<init>(r5)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x054d
        L_0x031e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x0324:
            com.google.android.apps.gsa.search.core.i.t r0 = r12.f280615b
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C89972ak.f246541P
            java.lang.String r0 = r0.mo79758x(r1)
            android.content.Context r1 = r12.f280619h     // Catch:{ FileNotFoundException -> 0x0347 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ FileNotFoundException -> 0x0347 }
            android.util.Pair r0 = com.google.android.apps.gsa.shared.util.C90772bp.m148303k(r1, r0)     // Catch:{ FileNotFoundException -> 0x0347 }
            java.lang.Object r1 = r0.first     // Catch:{ FileNotFoundException -> 0x0347 }
            android.content.res.Resources r1 = (android.content.res.Resources) r1     // Catch:{ FileNotFoundException -> 0x0347 }
            java.lang.Object r0 = r0.second     // Catch:{ FileNotFoundException -> 0x0347 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ FileNotFoundException -> 0x0347 }
            int r0 = r0.intValue()     // Catch:{ FileNotFoundException -> 0x0347 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ FileNotFoundException -> 0x0347 }
            goto L_0x0363
        L_0x0347:
            r0 = move-exception
            com.google.common.f.e r1 = f280614a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Cannot find string for uri."
            r3 = 33336(0x8238, float:4.6714E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            android.content.Context r0 = r12.f280619h
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2132092127(0x7f1524df, float:1.9824642E38)
            java.lang.String r0 = r0.getString(r1)
        L_0x0363:
            dagger.a r1 = r12.f280630s
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.e.f r1 = (com.google.android.apps.gsa.shared.p7037e.C89720f) r1
            dagger.a r2 = r1.f242879d
            java.lang.Object r2 = r2.mo27525b()
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            boolean r2 = r2.mo56113h()
            if (r2 != 0) goto L_0x0383
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0399
        L_0x0383:
            dagger.a r1 = r1.f242879d
            java.lang.Object r1 = r1.mo27525b()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            java.lang.Object r1 = r1.mo56107c()
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            java.util.List r1 = r1.getPinnedShortcuts()
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x0399:
            com.google.android.apps.gsa.shared.e.a r2 = new com.google.android.apps.gsa.shared.e.a
            r2.<init>(r0)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r0)
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x054d
        L_0x03a8:
            com.google.android.apps.gsa.search.core.i.t r0 = r12.f280615b
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C89972ak.f246543R
            long r0 = r0.mo79743a(r1)
            int r1 = (int) r0
            com.google.android.libraries.f.a r0 = r12.f280618g
            com.google.android.apps.gsa.search.core.i.t r2 = r12.f280615b
            dagger.a r3 = r12.f280628q
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.libraries.storage.protostore.ab r3 = (com.google.android.libraries.storage.protostore.C42876ab) r3
            f.a.a.a.n r4 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148932g(r2)
            if (r4 != 0) goto L_0x03cf
            com.google.protobuf.ct r0 = new com.google.protobuf.ct
            java.lang.String r1 = "Null proto returned."
            r0.<init>((java.lang.String) r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            goto L_0x03f2
        L_0x03cf:
            boolean r5 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148938m(r2)
            if (r5 != 0) goto L_0x03e1
            com.google.protobuf.ct r0 = new com.google.protobuf.ct
            java.lang.String r1 = "Feature is not enabled."
            r0.<init>((java.lang.String) r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            goto L_0x03f2
        L_0x03e1:
            com.google.common.util.concurrent.cx r3 = r3.mo46042d()
            com.google.android.apps.gsa.shared.v.k r5 = new com.google.android.apps.gsa.shared.v.k
            r5.<init>(r4, r0, r1, r2)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r3, r5, r0)
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
        L_0x03f2:
            com.google.android.apps.gsa.staticplugins.eb.ag r1 = new com.google.android.apps.gsa.staticplugins.eb.ag
            r1.<init>(r12)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x054d
        L_0x0401:
            com.google.protobuf.dn r0 = r13.f185740c
            java.lang.String r1 = "feedLowEngagementTrackingWindowDays"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x0471
            java.lang.Object r0 = r0.get(r1)
            f.a.a.a.bh r0 = (p5451f.p5452a.p5453a.p5454a.C69413bh) r0
            int r1 = r0.f185726a
            if (r1 != r3) goto L_0x041d
            java.lang.Object r0 = r0.f185727b
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
        L_0x041d:
            com.google.protobuf.dn r0 = r13.f185740c
            java.lang.String r1 = "feedLowEngagingOnlyCountDays"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x046b
            java.lang.Object r0 = r0.get(r1)
            f.a.a.a.bh r0 = (p5451f.p5452a.p5453a.p5454a.C69413bh) r0
            int r1 = r0.f185726a
            if (r1 != r6) goto L_0x044c
            java.lang.Object r0 = r0.f185727b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x044c
            com.google.android.libraries.f.a r0 = r12.f280618g
            com.google.android.apps.gsa.search.core.i.t r1 = r12.f280615b
            dagger.a r2 = r12.f280628q
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.libraries.storage.protostore.ab r2 = (com.google.android.libraries.storage.protostore.C42876ab) r2
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148944s(r0, r1, r2, r5)
            goto L_0x045c
        L_0x044c:
            com.google.android.libraries.f.a r0 = r12.f280618g
            com.google.android.apps.gsa.search.core.i.t r1 = r12.f280615b
            dagger.a r2 = r12.f280628q
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.libraries.storage.protostore.ab r2 = (com.google.android.libraries.storage.protostore.C42876ab) r2
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148943r(r0, r1, r2, r5)
        L_0x045c:
            com.google.android.apps.gsa.staticplugins.eb.ah r1 = new com.google.android.apps.gsa.staticplugins.eb.ah
            r1.<init>(r13)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            goto L_0x054d
        L_0x046b:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x0471:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x0477:
            dagger.a r0 = r12.f280631t
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.gsa.k.g r0 = (com.google.android.libraries.gsa.p1876k.C22871g) r0
            dagger.a r1 = r12.f280632u
            java.lang.Object r1 = r1.mo27525b()
            r2 = r1
            com.google.android.apps.gsa.n.g.i r2 = (com.google.android.apps.gsa.n.g.i) r2
            dagger.a r1 = r12.f280623l
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r1 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r1
            java.lang.String r1 = r1.mo79659F()
            java.lang.String r3 = com.google.common.base.C58837ba.m90858g(r1)
            com.google.protos.p.b.ak r4 = com.google.protos.p5129p.p5131b.C65753ak.VAAV2_BLUE_BAR
            r5 = 0
            com.google.protos.ap.a.a.ac r6 = com.google.protos.p4874ap.p4875a.p4876a.C63662ac.f172144a
            com.google.bj.c.d.b r7 = com.google.p4184bj.p4193c.p4199d.C55992b.f149102b
            com.google.common.util.concurrent.cx r1 = r2.a(r3, r4, r5, r6, r7)
            java.lang.String r2 = "Get geller"
            com.google.android.apps.gsa.staticplugins.eb.y r3 = com.google.android.apps.gsa.staticplugins.p7887eb.C100379y.f280674a
            com.google.common.util.concurrent.cx r4 = r0.mo28209i(r1, r2, r3)
            goto L_0x054d
        L_0x04ad:
            com.google.protobuf.dn r0 = r13.f185740c
            java.lang.String r1 = "metricType"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x057a
            java.lang.Object r0 = r0.get(r1)
            f.a.a.a.bh r0 = (p5451f.p5452a.p5453a.p5454a.C69413bh) r0
            int r1 = r0.f185726a
            if (r1 != r3) goto L_0x04ca
            java.lang.Object r0 = r0.f185727b
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x04cb
        L_0x04ca:
            r0 = -1
        L_0x04cb:
            com.google.protobuf.dn r1 = r13.f185740c
            java.lang.String r2 = "duration"
            boolean r4 = r1.containsKey(r2)
            if (r4 == 0) goto L_0x0574
            java.lang.Object r1 = r1.get(r2)
            f.a.a.a.bh r1 = (p5451f.p5452a.p5453a.p5454a.C69413bh) r1
            int r2 = r1.f185726a
            if (r2 != r3) goto L_0x04e8
            java.lang.Object r1 = r1.f185727b
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x04e9
        L_0x04e8:
            r1 = -1
        L_0x04e9:
            com.google.protobuf.dn r2 = r13.f185740c
            java.lang.String r4 = "granularity"
            boolean r6 = r2.containsKey(r4)
            if (r6 == 0) goto L_0x056e
            java.lang.Object r2 = r2.get(r4)
            f.a.a.a.bh r2 = (p5451f.p5452a.p5453a.p5454a.C69413bh) r2
            int r4 = r2.f185726a
            if (r4 != r3) goto L_0x0506
            java.lang.Object r2 = r2.f185727b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0507
        L_0x0506:
            r2 = -1
        L_0x0507:
            com.google.protobuf.dn r4 = r13.f185740c
            java.lang.String r6 = "engagementLevel"
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L_0x0568
            java.lang.Object r4 = r4.get(r6)
            f.a.a.a.bh r4 = (p5451f.p5452a.p5453a.p5454a.C69413bh) r4
            int r6 = r4.f185726a
            if (r6 != r3) goto L_0x0523
            java.lang.Object r3 = r4.f185727b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r5 = r3.intValue()
        L_0x0523:
            com.google.android.apps.gsa.search.core.i.t r6 = r12.f280615b
            dagger.a r3 = r12.f280628q
            java.lang.Object r3 = r3.mo27525b()
            r7 = r3
            com.google.android.libraries.storage.protostore.ab r7 = (com.google.android.libraries.storage.protostore.C42876ab) r7
            com.google.android.libraries.f.a r8 = r12.f280618g
            f.a.a.a.l r9 = p5451f.p5452a.p5453a.p5454a.C69447l.m100760a(r0)
            int r10 = p5451f.p5452a.p5453a.p5454a.C69452q.m100763a(r1)
            int r11 = p5451f.p5452a.p5453a.p5454a.C69453r.m100764a(r2)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148947v(r6, r7, r8, r9, r10, r11)
            com.google.android.apps.gsa.staticplugins.eb.ai r1 = new com.google.android.apps.gsa.staticplugins.eb.ai
            r1.<init>(r5)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
        L_0x054d:
            com.google.android.apps.gsa.staticplugins.eb.i r0 = new com.google.android.apps.gsa.staticplugins.eb.i
            r0.<init>()
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r4, r0, r1)
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
        L_0x055a:
            com.google.android.apps.gsa.staticplugins.eb.ad r1 = new com.google.android.apps.gsa.staticplugins.eb.ad
            r1.<init>(r12, r14, r13)
            com.google.common.util.concurrent.bg r13 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r13)
            com.google.android.apps.gsa.shared.s.a.a r14 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            return r13
        L_0x0568:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x056e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x0574:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L_0x057a:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7887eb.C100353an.m166338v(f.a.a.a.bo, int):com.google.common.util.concurrent.cx");
    }

    /* renamed from: w */
    private final C60870cx m166339w(int i, C69415bj bjVar) {
        if (this.f280616c.f280644b.getBoolean(C100358d.m166373j("conditions_met_once_", i), false)) {
            return C60856cj.m92900i(true);
        }
        return mo91892l(i, bjVar);
    }

    /* renamed from: x */
    private static C60870cx m166340x(C146006ab abVar) {
        return C2169h.m6027a(new C100378x(abVar));
    }

    /* renamed from: y */
    private final void m166341y(int i) {
        C100358d dVar = this.f280616c;
        dVar.mo91902k(i);
        if (!dVar.f280644b.contains(C100358d.m166373j("dismissed_on_click_", i))) {
            C59104x c = C100358d.f280643a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TipSharedPrefManager");
            ((C59052c) ((C59052c) c).mo56372aa(33318)).mo56387q("invalid tip %d: not click expiration tip", i);
        } else {
            C86337q b = dVar.f280644b.mo80076b();
            b.mo80067b(C100358d.m166373j("dismissed_on_click_", i), true);
            b.apply();
        }
        this.f280616c.mo91904m(i);
    }

    /* renamed from: a */
    public final C60870cx mo79049a(int i) {
        if (!this.f280616c.mo91908q(i)) {
            return mo91893m(i);
        }
        return C60856cj.m92900i(false);
    }

    /* renamed from: b */
    public final C60870cx mo79050b() {
        C58485gu g = this.f280616c.mo91899g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            mo91894n(((Integer) g.get(i)).intValue());
        }
        C86337q b = this.f280616c.f280644b.mo80076b();
        b.mo80066a();
        b.apply();
        return C118826c.f331423b;
    }

    /* renamed from: c */
    public final C60870cx mo79051c(int i) {
        try {
            m166341y(i);
            C100358d dVar = this.f280616c;
            dVar.mo91902k(i);
            if (dVar.f280644b.contains(C100358d.m166373j("positive_interaction_max_", i))) {
                String j = C100358d.m166373j("positive_interaction_count_", i);
                C86337q b = dVar.f280644b.mo80076b();
                b.mo80070e(j, dVar.f280644b.getInt(j, 0) + 1);
                b.apply();
            }
            if (dVar.f280644b.contains(C100358d.m166373j("last_tip_seen_time_for_positive_interaction_", i))) {
                String j2 = C100358d.m166373j("last_tip_seen_time_for_positive_interaction_", i);
                C86337q b2 = dVar.f280644b.mo80076b();
                b2.mo80072g(j2, dVar.f280645c.mo26870b());
                b2.apply();
            }
            mo91896u(1263, i);
            return C118826c.m197213c(mo79053e());
        } catch (C89408a | C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f280614a.mo56225c()).mo56382g(e)).mo56372aa(33341)).mo56386p("Failed to mark clicked");
            mo91896u(1272, i);
            return C118826c.f331423b;
        }
    }

    /* renamed from: d */
    public final C60870cx mo79052d(int i) {
        try {
            C100358d dVar = this.f280616c;
            dVar.mo91902k(i);
            if (!dVar.f280644b.contains(C100358d.m166373j("conditions_resolved_", i))) {
                C59104x c = C100358d.f280643a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TipSharedPrefManager");
                ((C59052c) ((C59052c) c).mo56372aa(33317)).mo56387q("invalid tip %d: not tip with extra condition", i);
            } else {
                C86337q b = dVar.f280644b.mo80076b();
                b.mo80067b(C100358d.m166373j("conditions_resolved_", i), true);
                b.apply();
            }
            mo91896u(1265, i);
            return C118826c.m197213c(mo79053e());
        } catch (C89408a e) {
            ((C59052c) ((C59052c) ((C59052c) f280614a.mo56225c()).mo56382g(e)).mo56372aa(33345)).mo56386p("Failed to mark condition met");
            mo91896u(1272, i);
            return C118826c.f331423b;
        }
    }

    /* renamed from: e */
    public final C60870cx mo79053e() {
        ArrayList arrayList = new ArrayList();
        for (C69395aq aqVar : C69395aq.values()) {
            if (aqVar != C69395aq.TIP_NOT_SET) {
                ArrayList arrayList2 = new ArrayList();
                C58485gu j = C58485gu.m89842j(C60757n.m92749j(this.f280616c.f280644b.mo80080f(C100358d.m166373j("ids_for_tip_case_", aqVar.f185677j))));
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    int intValue = ((Integer) j.get(i)).intValue();
                    C60870cx g = C60922j.m93044g(mo91893m(intValue), new C100371q(this, intValue, this.f280616c.mo91908q(intValue)), C60826bg.f164896a);
                    C90476a aVar = C91018d.f254254a;
                    arrayList2.add(g);
                }
                C60870cx g2 = C60922j.m93044g(C60856cj.m92896e(arrayList2), C100340aa.f280597a, C60826bg.f164896a);
                C90476a aVar2 = C91018d.f254254a;
                arrayList.add(g2);
            }
        }
        C60870cx b = C118826c.m197212b(arrayList);
        this.f280620i.mo28211k(b, "processBackgroundTipsCallback", new C100351al(this));
        return this.f280620i.mo28210j(b, "Checks if new tips need to be setup since tips have been processed and maybe cleaned up.", new C100373s(this));
    }

    /* renamed from: f */
    public final C60870cx mo79054f() {
        C60870cx cxVar;
        C60870cx cxVar2;
        this.f280617f.mo83702b(C89849ae.TIPMANAGER_SETUP_START);
        C69457v vVar = (C69457v) this.f280615b.mo79754t(C89972ak.f246563d, C69457v.f185865b.getParserForType());
        if (vVar == null) {
            ((C59052c) ((C59052c) f280614a.mo56225c()).mo56372aa(33357)).mo56386p("Failed to set up tips. Flag that holds aware tips is null.");
            this.f280617f.mo83702b(C89849ae.TIPMANAGER_SETUP_ERROR);
            return C118826c.f331423b;
        }
        C69402ax axVar = (C69402ax) this.f280615b.mo79754t(C89972ak.f246552a, C69402ax.f185702c.getParserForType());
        if (axVar == null) {
            ((C59052c) ((C59052c) f280614a.mo56225c()).mo56372aa(33356)).mo56386p("Failed to set up tips. Flag that holds global conditions is null.");
            this.f280617f.mo83702b(C89849ae.TIPMANAGER_SETUP_ERROR);
            return C118826c.f331423b;
        }
        ArrayList arrayList = new ArrayList(this.f280616c.mo91899g());
        HashMap hashMap = new HashMap();
        boolean z = this.f280615b.mo79746e(C89972ak.f246531F) && C91165r.m148927b(1, (C42876ab) this.f280628q.mo27525b()) + TimeUnit.DAYS.toMillis(this.f280615b.mo79743a(C89972ak.f246565f)) >= this.f280618g.mo26870b();
        for (C69396ar arVar : vVar.f185867a) {
            C69421bp bpVar = arVar.f185682c;
            if (bpVar == null) {
                bpVar = C69421bp.f185742q;
            }
            if ((bpVar.f185744a & 1) != 0) {
                C69421bp bpVar2 = arVar.f185682c;
                if (bpVar2 == null) {
                    bpVar2 = C69421bp.f185742q;
                }
                int i = bpVar2.f185745b;
                mo91895p(C89849ae.TIPMANAGER_TIP_SETUP_START, i);
                if (z) {
                    C69421bp bpVar3 = arVar.f185682c;
                    if (bpVar3 == null) {
                        bpVar3 = C69421bp.f185742q;
                    }
                    if (!bpVar3.f185751h) {
                        mo91895p(C89849ae.TIPMANAGER_TIP_SETUP_SKIP, i);
                    }
                }
                if (this.f280615b.mo79746e(C89972ak.f246532G)) {
                    C69421bp bpVar4 = arVar.f185682c;
                    if (bpVar4 == null) {
                        bpVar4 = C69421bp.f185742q;
                    }
                    Iterator it = bpVar4.f185752i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!this.f280616c.mo91908q(((Integer) it.next()).intValue())) {
                            mo91895p(C89849ae.TIPMANAGER_TIP_SETUP_SKIP, i);
                            break;
                        }
                    }
                }
                if (this.f280616c.f280644b.contains(C100358d.m166373j("done_", i))) {
                    hashMap.put(Integer.valueOf(i), C60856cj.m92900i(true));
                    if (this.f280616c.mo91908q(i)) {
                        mo91895p(C89849ae.TIPMANAGER_TIP_IS_EXPIRED, i);
                    } else {
                        mo91895p(C89849ae.TIPMANAGER_TIP_ALREADY_SETUP, i);
                    }
                } else {
                    Integer valueOf = Integer.valueOf(i);
                    C69421bp bpVar5 = arVar.f185682c;
                    if (((bpVar5 == null ? C69421bp.f185742q : bpVar5).f185744a & 1) != 0) {
                        if (bpVar5 == null) {
                            bpVar5 = C69421bp.f185742q;
                        }
                        int i2 = bpVar5.f185745b;
                        int i3 = bpVar5.f185744a;
                        if ((i3 & 2) == 0 && (i3 & 4) == 0 && (i3 & 8) == 0 && (i3 & 128) == 0) {
                            ((C59052c) ((C59052c) f280614a.mo56225c()).mo56372aa(33350)).mo56387q("invalid tip %d: no expiration condition", i2);
                            mo91895p(C89849ae.TIPMANAGER_TIP_SETUP_EARLY_FAILURE, i2);
                            cxVar = C60856cj.m92900i(false);
                        } else {
                            try {
                                C69415bj bjVar = bpVar5.f185750g;
                                if (bjVar == null) {
                                    bjVar = C69415bj.f185728c;
                                }
                                cxVar2 = m166339w(i2, bjVar);
                            } catch (IllegalArgumentException e) {
                                ((C59052c) ((C59052c) ((C59052c) f280614a.mo56225c()).mo56382g(e)).mo56372aa(33349)).mo56386p("Condition parameter was not found for tip.");
                                mo91896u(1272, i2);
                                mo91895p(C89849ae.TIPMANAGER_TIP_SETUP_EARLY_FAILURE, i2);
                                cxVar2 = C60856cj.m92900i(false);
                            }
                            cxVar = C60922j.m93044g(cxVar2, new C100364j(this, arVar, i2), C60826bg.f164896a);
                            C90476a aVar = C91018d.f254254a;
                        }
                    } else {
                        ((C59052c) ((C59052c) f280614a.mo56225c()).mo56372aa(33351)).mo56386p("invalid tip: no metadata or id");
                        this.f280617f.mo83702b(C89849ae.TIPMANAGER_TIP_SETUP_EARLY_FAILURE);
                        cxVar = C60856cj.m92900i(false);
                    }
                    hashMap.put(valueOf, cxVar);
                }
            } else {
                ((C59052c) ((C59052c) f280614a.mo56225c()).mo56372aa(33355)).mo56386p("Invalid tip:  no metadata or id");
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            C60870cx g = C60922j.m93044g((C60870cx) entry.getValue(), new C100365k(entry.getKey()), C60826bg.f164896a);
            C90476a aVar2 = C91018d.f254254a;
            arrayList2.add(g);
        }
        C60870cx g2 = C60922j.m93044g(C60856cj.m92906o(arrayList2), C100366l.f280659a, C60826bg.f164896a);
        C90476a aVar3 = C91018d.f254254a;
        return C60922j.m93044g(g2, new C100344ae(this, arrayList, axVar), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo79055g(int i) {
        try {
            C100358d dVar = this.f280616c;
            dVar.mo91902k(i);
            if (dVar.f280644b.contains(C100358d.m166373j("impression_max_", i))) {
                String j = C100358d.m166373j("impression_count_", i);
                C86337q b = dVar.f280644b.mo80076b();
                b.mo80070e(j, dVar.f280644b.getInt(j, 0) + 1);
                b.apply();
            }
            C69436cd cdVar = (C69436cd) dVar.f280647e.get(dVar.mo91900h(i));
            C69431bz i2 = dVar.mo91901i(i);
            if (cdVar != null) {
                if (i2 != C69431bz.UNKNOWN_TAB) {
                    if (dVar.f280644b.contains(C100358d.m166373j("interval_time_for_tip_type_", cdVar.f185809j))) {
                        String j2 = C100358d.m166373j("last_tip_seen_time_for_tip_type_", cdVar.f185809j);
                        C86337q b2 = dVar.f280644b.mo80076b();
                        b2.mo80072g(j2, dVar.f280645c.mo26870b());
                        b2.apply();
                    }
                    if (dVar.f280644b.contains(C100358d.m166373j("interval_time_for_tab_type_", i2.f185791j))) {
                        String j3 = C100358d.m166373j("last_tip_seen_time_for_tab_type_", i2.f185791j);
                        C86337q b3 = dVar.f280644b.mo80076b();
                        b3.mo80072g(j3, dVar.f280645c.mo26870b());
                        b3.apply();
                    }
                    if (dVar.f280644b.contains(C100358d.m166373j("maximum_count_for_tip_type_", cdVar.f185809j))) {
                        String j4 = C100358d.m166373j("impression_count_for_tip_type_", cdVar.f185809j);
                        C86337q b4 = dVar.f280644b.mo80076b();
                        b4.mo80070e(j4, dVar.f280644b.getInt(j4, 0) + 1);
                        b4.apply();
                    }
                }
            }
            C100358d dVar2 = this.f280616c;
            C86337q b5 = dVar2.f280644b.mo80076b();
            b5.mo80070e(C100358d.m166373j("active_type_tip_", dVar2.mo91900h(i).f185677j), i);
            b5.apply();
            C69431bz i3 = dVar2.mo91901i(i);
            C86337q b6 = dVar2.f280644b.mo80076b();
            b6.mo80070e(C100358d.m166373j("active_tab_tip_", i3.f185791j), i);
            b6.apply();
            C100358d dVar3 = this.f280616c;
            dVar3.mo91902k(i);
            if (!dVar3.f280644b.contains(C100358d.m166373j("time_duration_", i))) {
                C59104x c = C100358d.f280643a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TipSharedPrefManager");
                ((C59052c) ((C59052c) c).mo56372aa(33321)).mo56387q("invalid tip %d: not time expiration tip", i);
            } else {
                C86337q b7 = dVar3.f280644b.mo80076b();
                b7.mo80072g(C100358d.m166373j("time_start_time_", i), dVar3.f280645c.mo26870b());
                b7.apply();
                C118522by byVar = C118522by.AWARE_TIP_WORKER_PROCESS_TIPS;
                C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                afVar.copyOnWrite();
                C118472ag agVar = (C118472ag) afVar.instance;
                agVar.f328821a |= 1;
                agVar.f328822b = (long) dVar3.f280644b.getInt(C100358d.m166373j("time_duration_", i), Integer.MAX_VALUE);
                ((C118561t) dVar3.f280646d.mo27525b()).mo103754e(byVar, (C118472ag) afVar.build());
            }
        } catch (C89408a | C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f280614a.mo56225c()).mo56382g(e)).mo56372aa(33369)).mo56387q("Failed to mark impression for tip %d", i);
        }
        mo91896u(1261, i);
        return C118826c.f331423b;
    }

    /* renamed from: h */
    public final void mo79056h() {
        if (this.f280615b.mo79746e(C89972ak.f246575p)) {
            C69396ar arVar = (C69396ar) this.f280615b.mo79754t(C89972ak.f246566g, C69396ar.f185678d.getParserForType());
            if (arVar == null) {
                ((C59052c) ((C59052c) f280614a.mo56225c()).mo56372aa(33363)).mo56386p("Failed to set up feature tip. Flag that holds tip is null.");
            } else if (!arVar.equals(C69396ar.f185678d)) {
                mo79058j(arVar);
            }
        }
    }

    /* renamed from: i */
    public final void mo79057i(int i) {
        C69457v vVar = (C69457v) this.f280615b.mo79754t(C89972ak.f246563d, C69457v.f185865b.getParserForType());
        if (vVar == null) {
            ((C59052c) ((C59052c) f280614a.mo56225c()).mo56372aa(33364)).mo56387q("Failed to show tip %d. Flag that holds aware tips is null", i);
            return;
        }
        for (C69396ar arVar : vVar.f185867a) {
            C69421bp bpVar = arVar.f185682c;
            if (bpVar == null) {
                bpVar = C69421bp.f185742q;
            }
            if (bpVar.f185745b == i) {
                mo79058j(arVar);
                return;
            }
        }
    }

    /* renamed from: j */
    public final void mo79058j(C69396ar arVar) {
        C69421bp bpVar = arVar.f185682c;
        if (bpVar == null) {
            bpVar = C69421bp.f185742q;
        }
        if ((bpVar.f185744a & 1) != 0) {
            C69421bp bpVar2 = arVar.f185682c;
            if (bpVar2 == null) {
                bpVar2 = C69421bp.f185742q;
            }
            int i = bpVar2.f185745b;
            try {
                this.f280616c.mo91905n(arVar);
                C100358d dVar = this.f280616c;
                dVar.mo91902k(i);
                int i2 = dVar.f280644b.getInt(C100358d.m166373j("feature_tip_case_", i), 0);
                ArrayList arrayList = new ArrayList(C60757n.m92749j(dVar.f280644b.mo80080f(C100358d.m166373j("ids_for_tip_case_", i2))));
                Integer valueOf = Integer.valueOf(i);
                int indexOf = arrayList.indexOf(valueOf);
                if (indexOf != -1) {
                    arrayList.add(0, Integer.valueOf(((Integer) arrayList.remove(indexOf)).intValue()));
                    C86337q b = dVar.f280644b.mo80076b();
                    b.mo80071f(C100358d.m166373j("ids_for_tip_case_", i2), C60757n.m92752m(arrayList));
                    b.apply();
                    C69395aq h = this.f280616c.mo91900h(i);
                    C69395aq aqVar = C69395aq.TOPDECK_FEATURE_TIP;
                    int ordinal = h.ordinal();
                    if (ordinal == 1 || ordinal == 7) {
                        ((C91097g) this.f280625n.mo27525b()).mo65089a(this.f280626o.mo78218a("and.gsa.deeplink", C90208n.INTERESTS_TAB, false));
                        return;
                    }
                    return;
                }
                throw new C89408a(String.format("Tip %d was unsuccessfully set at next tip.", new Object[]{valueOf}));
            } catch (C89408a | C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f280614a.mo56225c()).mo56382g(e)).mo56372aa(33365)).mo56387q("Failed to show tip %d", i);
            }
        } else {
            ((C59052c) ((C59052c) f280614a.mo56225c()).mo56372aa(33366)).mo56386p("Tip with no ID");
        }
    }

    /* renamed from: k */
    public final C60870cx mo79059k(int i, int i2) {
        try {
            this.f280616c.mo91904m(i);
        } catch (C89408a | C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f280614a.mo56225c()).mo56382g(e)).mo56372aa(33343)).mo56387q("Failed to dismiss tip %d", i);
        }
        C69395aq aqVar = C69395aq.TOPDECK_FEATURE_TIP;
        if (i2 - 1 == 1) {
            return C118826c.m197213c(mo79053e());
        }
        try {
            if (this.f280616c.mo91900h(i) != C69395aq.TIP_NOT_SET) {
                m166341y(i);
                C100358d dVar = this.f280616c;
                dVar.mo91902k(i);
                if (dVar.f280644b.contains(C100358d.m166373j("negative_interaction_max_", i))) {
                    String j = C100358d.m166373j("negative_interaction_count_", i);
                    C86337q b = dVar.f280644b.mo80076b();
                    b.mo80070e(j, dVar.f280644b.getInt(j, 0) + 1);
                    b.apply();
                }
                if (dVar.f280644b.contains(C100358d.m166373j("last_tip_seen_time_for_negative_interaction_", i))) {
                    String j2 = C100358d.m166373j("last_tip_seen_time_for_negative_interaction_", i);
                    C86337q b2 = dVar.f280644b.mo80076b();
                    b2.mo80072g(j2, dVar.f280645c.mo26870b());
                    b2.apply();
                }
            }
            mo91896u(1264, i);
            return C118826c.m197213c(mo79053e());
        } catch (C89408a | C62974ct e2) {
            ((C59052c) ((C59052c) ((C59052c) f280614a.mo56225c()).mo56382g(e2)).mo56372aa(33338)).mo56386p("Failed to mark dismissed");
            mo91896u(1272, i);
            return C118826c.f331423b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final C60870cx mo91892l(int i, C69415bj bjVar) {
        C69415bj bjVar2;
        int i2;
        C69420bo boVar;
        C69415bj bjVar3;
        int i3;
        C69420bo boVar2;
        C69415bj bjVar4;
        int i4;
        C69420bo boVar3;
        C62971cq<C69411bf> cqVar = bjVar.f185731b;
        if (cqVar.isEmpty()) {
            return C60856cj.m92900i(true);
        }
        if (cqVar.size() == 1) {
            C69411bf bfVar = (C69411bf) cqVar.get(0);
            C69395aq aqVar = C69395aq.TOPDECK_FEATURE_TIP;
            int i5 = bfVar.f185721a;
            int a = C69410be.m100751a(i5);
            int i6 = a - 1;
            if (a == 0) {
                throw null;
            } else if (i6 == 0) {
                if (i5 == 1) {
                    bjVar4 = (C69415bj) bfVar.f185722b;
                } else {
                    bjVar4 = C69415bj.f185728c;
                }
                C60870cx g = C60922j.m93044g(mo91892l(i, bjVar4), new C100367m(bjVar), C60826bg.f164896a);
                C90476a aVar = C91018d.f254254a;
                return g;
            } else if (i6 == 1) {
                C69418bm bmVar = (C69418bm) C69420bo.f185736d.createBuilder();
                if (bfVar.f185721a != 2 || (i4 = C69408bc.m100750a(((Integer) bfVar.f185722b).intValue())) == 0) {
                    i4 = 1;
                }
                bmVar.copyOnWrite();
                C69420bo boVar4 = (C69420bo) bmVar.instance;
                boVar4.f185739b = i4 - 1;
                boVar4.f185738a |= 1;
                C60870cx g2 = C60922j.m93044g(m166338v((C69420bo) bmVar.build(), i), new C100368n(bjVar), C60826bg.f164896a);
                C90476a aVar2 = C91018d.f254254a;
                return g2;
            } else if (i6 != 2) {
                return C60856cj.m92900i(false);
            } else {
                if (i5 == 3) {
                    boVar3 = (C69420bo) bfVar.f185722b;
                } else {
                    boVar3 = C69420bo.f185736d;
                }
                C60870cx g3 = C60922j.m93044g(m166338v(boVar3, i), new C100369o(bjVar), C60826bg.f164896a);
                C90476a aVar3 = C91018d.f254254a;
                return g3;
            }
        } else {
            C69395aq aqVar2 = C69395aq.TOPDECK_FEATURE_TIP;
            int a2 = C69417bl.m100752a(bjVar.f185730a);
            if (a2 == 0) {
                a2 = 1;
            }
            int i7 = a2 - 1;
            if (i7 != 0) {
                if (i7 == 1) {
                    ArrayList arrayList = new ArrayList();
                    for (C69411bf bfVar2 : cqVar) {
                        int i8 = bfVar2.f185721a;
                        int a3 = C69410be.m100751a(i8);
                        int i9 = a3 - 1;
                        if (a3 == 0) {
                            throw null;
                        } else if (i9 == 0) {
                            if (i8 == 1) {
                                bjVar2 = (C69415bj) bfVar2.f185722b;
                            } else {
                                bjVar2 = C69415bj.f185728c;
                            }
                            arrayList.add(mo91892l(i, bjVar2));
                        } else if (i9 == 1) {
                            C69418bm bmVar2 = (C69418bm) C69420bo.f185736d.createBuilder();
                            if (bfVar2.f185721a != 2 || (i2 = C69408bc.m100750a(((Integer) bfVar2.f185722b).intValue())) == 0) {
                                i2 = 1;
                            }
                            bmVar2.copyOnWrite();
                            C69420bo boVar5 = (C69420bo) bmVar2.instance;
                            boVar5.f185739b = i2 - 1;
                            boVar5.f185738a |= 1;
                            arrayList.add(m166338v((C69420bo) bmVar2.build(), i));
                        } else if (i9 != 2) {
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                ((C60870cx) arrayList.get(i10)).cancel(true);
                            }
                            return C60856cj.m92900i(false);
                        } else {
                            if (i8 == 3) {
                                boVar = (C69420bo) bfVar2.f185722b;
                            } else {
                                boVar = C69420bo.f185736d;
                            }
                            arrayList.add(m166338v(boVar, i));
                        }
                    }
                    C60870cx g4 = C60922j.m93044g(C60856cj.m92896e(arrayList), C100374t.f280669a, C60826bg.f164896a);
                    C90476a aVar4 = C91018d.f254254a;
                    return g4;
                } else if (i7 != 3) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C69411bf bfVar3 : cqVar) {
                        int i11 = bfVar3.f185721a;
                        int a4 = C69410be.m100751a(i11);
                        int i12 = a4 - 1;
                        if (a4 == 0) {
                            throw null;
                        } else if (i12 == 0) {
                            if (i11 == 1) {
                                bjVar3 = (C69415bj) bfVar3.f185722b;
                            } else {
                                bjVar3 = C69415bj.f185728c;
                            }
                            arrayList2.add(mo91892l(i, bjVar3));
                        } else if (i12 == 1) {
                            C69418bm bmVar3 = (C69418bm) C69420bo.f185736d.createBuilder();
                            if (bfVar3.f185721a != 2 || (i3 = C69408bc.m100750a(((Integer) bfVar3.f185722b).intValue())) == 0) {
                                i3 = 1;
                            }
                            bmVar3.copyOnWrite();
                            C69420bo boVar6 = (C69420bo) bmVar3.instance;
                            boVar6.f185739b = i3 - 1;
                            boVar6.f185738a |= 1;
                            arrayList2.add(m166338v((C69420bo) bmVar3.build(), i));
                        } else if (i12 != 2) {
                            int size2 = arrayList2.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                ((C60870cx) arrayList2.get(i13)).cancel(true);
                            }
                            return C60856cj.m92900i(false);
                        } else {
                            if (i11 == 3) {
                                boVar2 = (C69420bo) bfVar3.f185722b;
                            } else {
                                boVar2 = C69420bo.f185736d;
                            }
                            arrayList2.add(m166338v(boVar2, i));
                        }
                    }
                    C60870cx g5 = C60922j.m93044g(C60856cj.m92906o(arrayList2), C100345af.f280606a, C60826bg.f164896a);
                    C90476a aVar5 = C91018d.f254254a;
                    return g5;
                }
            }
            return C60856cj.m92900i(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final C60870cx mo91893m(int i) {
        C69415bj bjVar = C69415bj.f185728c;
        try {
            C100358d dVar = this.f280616c;
            dVar.mo91902k(i);
            try {
                return m166339w(i, (C69415bj) C62942bv.parseFrom((C62942bv) C69415bj.f185728c, Base64.decode(dVar.f280644b.getString(C100358d.m166373j("conditions_", i), BuildConfig.FLAVOR), 0)));
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f280614a.mo56225c()).mo56382g(e)).mo56372aa(33346)).mo56386p("Condition parameter was not found for tip.");
                mo91896u(1272, i);
                return C60856cj.m92900i(false);
            }
        } catch (C89408a | C62974ct e2) {
            ((C59052c) ((C59052c) ((C59052c) f280614a.mo56225c()).mo56382g(e2)).mo56372aa(33347)).mo56386p("Failed to check if condition met");
            return C60856cj.m92900i(false);
        }
    }

    /* renamed from: n */
    public final void mo91894n(int i) {
        try {
            C69395aq h = this.f280616c.mo91900h(i);
            if (this.f280615b.mo79746e(C89972ak.f246555ac)) {
                C100358d dVar = this.f280616c;
                List j = C60757n.m92749j(dVar.f280644b.mo80080f(C100358d.m166373j("ids_for_tip_case_", h.f185677j)));
                if (!j.isEmpty()) {
                    Collections.shuffle(j);
                    C86337q b = dVar.f280644b.mo80076b();
                    b.mo80071f(C100358d.m166373j("ids_for_tip_case_", h.f185677j), C60757n.m92752m(j));
                    b.apply();
                }
            }
        } catch (C89408a | C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f280614a.mo56225c()).mo56382g(e)).mo56372aa(33362)).mo56387q("Failed to dismiss tip %d", i);
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }

    /* renamed from: p */
    public final void mo91895p(C89849ae aeVar, int i) {
        C89859i iVar = this.f280617f;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160122c |= 67108864;
        cbVar.f160067aE = i;
        fVar.f246203c = (C59687cb) ajVar.build();
        iVar.mo74236a(fVar.mo83699a());
    }

    /* renamed from: u */
    public final void mo91896u(int i, int i2) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        C100358d dVar = this.f280616c;
        C60472rd rdVar = (C60472rd) C60473re.f163662j.createBuilder();
        rdVar.copyOnWrite();
        C60473re reVar = (C60473re) rdVar.instance;
        reVar.f163664a |= 1;
        reVar.f163665b = i2;
        if (i2 != -1) {
            long j = dVar.f280644b.getLong(C100358d.m166373j("time_start_time_", i2), 0);
            if (j != 0) {
                rdVar.copyOnWrite();
                C60473re reVar2 = (C60473re) rdVar.instance;
                reVar2.f163664a |= 2;
                reVar2.f163666c = j;
                long b = dVar.f280645c.mo26870b();
                rdVar.copyOnWrite();
                C60473re reVar3 = (C60473re) rdVar.instance;
                reVar3.f163664a |= 4;
                reVar3.f163667d = b;
                if (dVar.f280644b.contains(C100358d.m166373j("time_duration_", i2))) {
                    int i3 = dVar.f280644b.getInt(C100358d.m166373j("time_duration_", i2), Integer.MAX_VALUE);
                    rdVar.copyOnWrite();
                    C60473re reVar4 = (C60473re) rdVar.instance;
                    reVar4.f163664a |= 8;
                    reVar4.f163668e = i3;
                }
            }
            rdVar.copyOnWrite();
            C60473re reVar5 = (C60473re) rdVar.instance;
            reVar5.f163664a |= 16;
            reVar5.f163669f = -1;
            int i4 = dVar.f280644b.getInt(C100358d.m166373j("impression_count_", i2), -1);
            if (i4 != -1) {
                rdVar.copyOnWrite();
                C60473re reVar6 = (C60473re) rdVar.instance;
                reVar6.f163664a |= 16;
                reVar6.f163669f = i4;
            }
            if (dVar.f280644b.contains(C100358d.m166373j("impression_max_", i2))) {
                int i5 = dVar.f280644b.getInt(C100358d.m166373j("impression_max_", i2), -1);
                rdVar.copyOnWrite();
                C60473re reVar7 = (C60473re) rdVar.instance;
                reVar7.f163664a |= 32;
                reVar7.f163670g = i5;
            }
            if (dVar.f280644b.contains(C100358d.m166373j("conditions_resolved_", i2))) {
                boolean z = dVar.f280644b.getBoolean(C100358d.m166373j("conditions_resolved_", i2), false);
                rdVar.copyOnWrite();
                C60473re reVar8 = (C60473re) rdVar.instance;
                reVar8.f163664a |= 64;
                reVar8.f163671h = z;
            }
            if (dVar.f280644b.contains(C100358d.m166373j("dismissed_on_click_", i2))) {
                boolean z2 = dVar.f280644b.getBoolean(C100358d.m166373j("dismissed_on_click_", i2), false);
                rdVar.copyOnWrite();
                C60473re reVar9 = (C60473re) rdVar.instance;
                reVar9.f163664a |= 128;
                reVar9.f163672i = z2;
            }
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            C60473re reVar10 = (C60473re) rdVar.build();
            reVar10.getClass();
            ufVar2.f164225cc = reVar10;
            ufVar2.f164254i |= 4194304;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
