package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.android.apps.gsa.p8867w.p8868a.C118730b;
import com.google.android.apps.search.assistant.libraries.p8979j.C119434c;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121011a;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121090b;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126437f;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.HashSet;
import java.util.Locale;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.m */
/* compiled from: PG */
public final class C128443m implements C119434c {

    /* renamed from: b */
    private static final C59071e f353264b = C59071e.m91331h();

    /* renamed from: c */
    private static final HashSet f353265c;

    /* renamed from: a */
    public final C121090b f353266a;

    /* renamed from: d */
    private final boolean f353267d;

    /* renamed from: e */
    private final boolean f353268e;

    /* renamed from: f */
    private final C121011a f353269f;

    /* renamed from: g */
    private final AccountId f353270g;

    /* renamed from: h */
    private final C46175b f353271h;

    /* renamed from: i */
    private final C118730b f353272i;

    static {
        String languageTag = Locale.getDefault().toLanguageTag();
        C69664n.m101060f(languageTag, "getDefault().toLanguageTag()");
        String[] strArr = {languageTag};
        HashSet hashSet = new HashSet(C69505av.m100860b(1));
        C69531o.m100941r(strArr, hashSet);
        f353265c = hashSet;
    }

    public C128443m(C118730b bVar, boolean z, boolean z2, C121011a aVar, AccountId accountId, C46175b bVar2, C121090b bVar3) {
        C69664n.m101061g(aVar, "assistantEligibilityChecker");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar2, "accountManager");
        C69664n.m101061g(bVar3, "mobileLocaleSettingsReadAccessor");
        this.f353272i = bVar;
        this.f353267d = z;
        this.f353268e = z2;
        this.f353269f = aVar;
        this.f353270g = accountId;
        this.f353271h = bVar2;
        this.f353266a = bVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104328a(com.google.android.libraries.assistant.p1533o.C18460aw r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128441k
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.n.k r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128441k) r0
            int r1 = r0.f353260e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f353260e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.n.k r0 = new com.google.android.apps.search.assistant.surfaces.voice.n.k
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f353258c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f353260e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0068
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r6 = r0.f353257b
            java.lang.Object r2 = r0.f353256a
            p5462h.C69714l.m101134b(r7)
            goto L_0x004e
        L_0x003a:
            p5462h.C69714l.m101134b(r7)
            boolean r7 = r6.f52388g
            if (r7 != 0) goto L_0x006a
            r0.f353256a = r5
            r0.f353257b = r6
            r0.f353260e = r4
            java.lang.Object r7 = r5.mo108435d(r0)
            if (r7 == r1) goto L_0x0069
            r2 = r5
        L_0x004e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x006a
            r7 = 0
            r0.f353256a = r7
            r0.f353257b = r7
            r0.f353260e = r3
            com.google.android.apps.search.assistant.surfaces.voice.n.m r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128443m) r2
            com.google.android.libraries.assistant.o.aw r6 = (com.google.android.libraries.assistant.p1533o.C18460aw) r6
            java.lang.Object r7 = r2.mo108436e(r6, r0)
            if (r7 != r1) goto L_0x0068
            return r1
        L_0x0068:
            return r7
        L_0x0069:
            return r1
        L_0x006a:
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128443m.mo104328a(com.google.android.libraries.assistant.o.aw, h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo104329b(C126437f fVar) {
        fVar.mo107615b(C37176a.f96975cn.mo40815i(C62722b.OK));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108436e(com.google.android.libraries.assistant.p1533o.C18460aw r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128439i
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.voice.n.i r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128439i) r0
            int r1 = r0.f353251e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f353251e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.n.i r0 = new com.google.android.apps.search.assistant.surfaces.voice.n.i
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f353249c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f353251e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.f353248b
            java.lang.Object r0 = r0.f353247a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0056
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            p5462h.C69714l.m101134b(r8)
            h.f.b.ae r8 = new h.f.b.ae
            r8.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r8.f186027a = r2
            com.google.android.apps.search.assistant.surfaces.voice.n.j r2 = new com.google.android.apps.search.assistant.surfaces.voice.n.j
            r4 = 0
            r2.<init>(r6, r8, r4)
            r0.f353247a = r7
            r0.f353248b = r8
            r0.f353251e = r3
            java.lang.Object r0 = kotlinx.coroutines.C71423ax.m104196a(r2, r0)
            if (r0 == r1) goto L_0x0117
            r0 = r7
            r7 = r8
        L_0x0056:
            com.google.common.f.e r8 = f353264b
            com.google.common.f.x r1 = r8.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            h.f.b.ae r7 = (p5462h.p5473f.p5475b.C69648ae) r7
            java.lang.Object r2 = r7.f186027a
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.String r2 = r2.toString()
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 38812(0x979c, float:5.4387E-41)
            r4.<init>(r5)
            r1.mo56379ah(r4)
            java.lang.String r4 = "Assistant locales: %s"
            r1.mo56389s(r4, r2)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.google.android.libraries.assistant.o.aw r0 = (com.google.android.libraries.assistant.p1533o.C18460aw) r0
            int r2 = r0.f52382a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x00af
            com.google.android.libraries.assistant.o.av r2 = r0.f52387f
            if (r2 != 0) goto L_0x008b
            com.google.android.libraries.assistant.o.av r2 = com.google.android.libraries.assistant.p1533o.C18459av.f52376c
        L_0x008b:
            java.lang.String r2 = r2.f52378a
            java.lang.String r4 = "configuration.languages.primaryLanguage"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0099
            goto L_0x00a4
        L_0x0099:
            com.google.android.libraries.assistant.o.av r2 = r0.f52387f
            if (r2 != 0) goto L_0x009f
            com.google.android.libraries.assistant.o.av r2 = com.google.android.libraries.assistant.p1533o.C18459av.f52376c
        L_0x009f:
            java.lang.String r2 = r2.f52378a
            r1.add(r2)
        L_0x00a4:
            com.google.android.libraries.assistant.o.av r0 = r0.f52387f
            if (r0 != 0) goto L_0x00aa
            com.google.android.libraries.assistant.o.av r0 = com.google.android.libraries.assistant.p1533o.C18459av.f52376c
        L_0x00aa:
            com.google.protobuf.cq r0 = r0.f52379b
            r1.addAll(r0)
        L_0x00af:
            com.google.common.f.x r0 = r8.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r2 = r1.toString()
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 38813(0x979d, float:5.4389E-41)
            r4.<init>(r5)
            r0.mo56379ah(r4)
            java.lang.String r4 = "VoiceSearch locales: %s"
            r0.mo56389s(r4, r2)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r0 = r7.f186027a
            java.util.HashSet r2 = f353265c
            boolean r0 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r2)
            if (r0 == 0) goto L_0x00f4
            com.google.common.f.x r7 = r8.mo56224b()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            java.util.Locale r0 = java.util.Locale.getDefault()
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 38815(0x979f, float:5.4391E-41)
            r1.<init>(r2)
            r7.mo56379ah(r1)
            java.lang.String r1 = "VoiceSearch locale is empty, and Assistant locale is default %s"
            r7.mo56389s(r1, r0)
            goto L_0x00fc
        L_0x00f4:
            java.lang.Object r7 = r7.f186027a
            java.util.HashSet r7 = (java.util.HashSet) r7
            boolean r3 = r7.equals(r1)
        L_0x00fc:
            com.google.common.f.x r7 = r8.mo56224b()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 38814(0x979e, float:5.439E-41)
            r0.<init>(r1)
            r7.mo56379ah(r0)
            java.lang.String r0 = "Assistant and VoiceSearch locales match = %s"
            r7.mo56389s(r0, r8)
            return r8
        L_0x0117:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128443m.mo108436e(com.google.android.libraries.assistant.o.aw, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108434c(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128437g
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.voice.n.g r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128437g) r0
            int r1 = r0.f353242d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f353242d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.n.g r0 = new com.google.android.apps.search.assistant.surfaces.voice.n.g
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f353240b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f353242d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 == r5) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            p5462h.C69714l.m101134b(r8)
            goto L_0x0077
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0033:
            java.lang.Object r2 = r0.f353239a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0052
        L_0x0039:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.assistant.platform.h.c.a r8 = r7.f353269f
            com.google.common.util.concurrent.cx r8 = r8.mo104232b()
            java.lang.String r2 = "assistantEligibilityChecker.isAssistantEnabled"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            r0.f353239a = r7
            r0.f353242d = r5
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r8 == r1) goto L_0x008c
            r2 = r7
        L_0x0052:
            java.lang.String r6 = "assistantEligibilityChec…sAssistantEnabled.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0087
            com.google.android.apps.search.assistant.surfaces.voice.n.m r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128443m) r2
            com.google.android.apps.search.assistant.platform.h.c.a r8 = r2.f353269f
            com.google.common.util.concurrent.cx r8 = r8.mo104231a()
            java.lang.String r2 = "assistantEligibilityChecker.isAssistantEligible"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            r2 = 0
            r0.f353239a = r2
            r0.f353242d = r4
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r8 == r1) goto L_0x0086
        L_0x0077:
            java.lang.String r0 = "assistantEligibilityChec…AssistantEligible.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r0)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0087
            r3 = 1
            goto L_0x0087
        L_0x0086:
            return r1
        L_0x0087:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128443m.mo108434c(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108437f(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128442l
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.voice.n.l r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128442l) r0
            int r1 = r0.f353263c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f353263c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.n.l r0 = new com.google.android.apps.search.assistant.surfaces.voice.n.l
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f353261a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f353263c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0048
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.apps.tiktok.account.data.b r5 = r4.f353271h
            com.google.apps.tiktok.account.AccountId r2 = r4.f353270g
            com.google.common.util.concurrent.cx r5 = r5.mo50246c(r2)
            java.lang.String r2 = "accountManager.getAccount(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f353263c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 != r1) goto L_0x0048
            return r1
        L_0x0048:
            com.google.apps.tiktok.account.data.a r5 = (com.google.apps.tiktok.account.data.C46108a) r5
            com.google.apps.tiktok.account.data.j r5 = r5.mo50210b()
            java.lang.String r5 = r5.f121165j
            java.lang.String r0 = "google"
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128443m.mo108437f(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108435d(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128438h
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.voice.n.h r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128438h) r0
            int r1 = r0.f353246d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f353246d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.n.h r0 = new com.google.android.apps.search.assistant.surfaces.voice.n.h
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f353244b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f353246d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 == r5) goto L_0x003c
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p5462h.C69714l.m101134b(r8)
            goto L_0x0098
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0036:
            java.lang.Object r2 = r0.f353243a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0074
        L_0x003c:
            java.lang.Object r2 = r0.f353243a
            p5462h.C69714l.m101134b(r8)
            goto L_0x005a
        L_0x0042:
            p5462h.C69714l.m101134b(r8)
            boolean r8 = r7.f353267d
            if (r8 != 0) goto L_0x004e
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            return r8
        L_0x004e:
            r0.f353243a = r7
            r0.f353246d = r5
            java.lang.Object r8 = r7.mo108434c(r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r7
        L_0x005a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0067
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            return r8
        L_0x0067:
            r0.f353243a = r2
            r0.f353246d = r4
            r8 = r2
            com.google.android.apps.search.assistant.surfaces.voice.n.m r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128443m) r8
            java.lang.Object r8 = r8.mo108437f(r0)
            if (r8 == r1) goto L_0x00ab
        L_0x0074:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0081
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            return r8
        L_0x0081:
            com.google.android.apps.search.assistant.surfaces.voice.n.m r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128443m) r2
            boolean r8 = r2.f353268e
            if (r8 == 0) goto L_0x00a6
            com.google.android.apps.gsa.w.a.b r8 = r2.f353272i
            com.google.common.util.concurrent.cx r8 = r8.mo103939a()
            r2 = 0
            r0.f353243a = r2
            r0.f353246d = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r8 == r1) goto L_0x00a5
        L_0x0098:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x00a6
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            return r8
        L_0x00a5:
            return r1
        L_0x00a6:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            return r8
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128443m.mo108435d(h.c.g):java.lang.Object");
    }
}
