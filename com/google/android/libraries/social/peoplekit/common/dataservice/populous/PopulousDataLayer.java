package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.p3269d.p3270a.C41926ac;
import com.google.android.libraries.social.p3269d.p3270a.C41932g;
import com.google.android.libraries.social.p3269d.p3270a.C41934i;
import com.google.android.libraries.social.p3269d.p3270a.C41939n;
import com.google.android.libraries.social.p3269d.p3270a.C41941p;
import com.google.android.libraries.social.p3269d.p3270a.C41943r;
import com.google.android.libraries.social.p3269d.p3270a.C41948w;
import com.google.android.libraries.social.p3269d.p3270a.C41949x;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42012e;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42093c;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42094d;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42097g;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42098h;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42100j;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42101k;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42102l;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42106p;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42136f;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.populous.AutocompleteSessionBase;
import com.google.android.libraries.social.populous.C42182ao;
import com.google.android.libraries.social.populous.C42196ba;
import com.google.android.libraries.social.populous.C42200be;
import com.google.android.libraries.social.populous.C42201bf;
import com.google.android.libraries.social.populous.C42598s;
import com.google.android.libraries.social.populous.core.C42255ah;
import com.google.android.libraries.social.populous.core.C42276bb;
import com.google.android.libraries.social.populous.core.C42289bo;
import com.google.android.libraries.social.populous.core.C42318cq;
import com.google.android.libraries.social.populous.core.C42320cs;
import com.google.android.libraries.social.populous.core.C42321ct;
import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.core.C42344e;
import com.google.android.libraries.social.populous.core.C42347h;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.Loggable;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p5602o.p5607c.p5608a.p5609a.C71912k;
import p5602o.p5607c.p5608a.p5609a.C71913l;
import p5602o.p5607c.p5608a.p5609a.C71916o;
import p5602o.p5607c.p5608a.p5609a.C71917p;
import p5602o.p5607c.p5608a.p5609a.C71919r;
import p5602o.p5607c.p5608a.p5609a.C71920s;

/* compiled from: PG */
public final class PopulousDataLayer implements PeopleKitDataLayer, C42182ao, C42097g {
    public static final Parcelable.Creator CREATOR = new C42117k();

    /* renamed from: a */
    final AutocompleteSessionBase f110110a;

    /* renamed from: b */
    final PeopleKitConfig f110111b;

    /* renamed from: c */
    C42598s f110112c;

    /* renamed from: d */
    public C42075e f110113d;

    /* renamed from: e */
    private final Set f110114e;

    /* renamed from: f */
    private C42098h f110115f;

    /* renamed from: g */
    private boolean f110116g;

    /* renamed from: h */
    private boolean f110117h;

    public PopulousDataLayer(Parcel parcel) {
        this.f110114e = new HashSet();
        boolean z = false;
        this.f110117h = false;
        AutocompleteSessionBase autocompleteSessionBase = (AutocompleteSessionBase) parcel.readParcelable(AutocompleteSessionBase.class.getClassLoader());
        this.f110110a = autocompleteSessionBase;
        autocompleteSessionBase.mo44817f(this);
        this.f110111b = (PeopleKitConfig) parcel.readParcelable(PeopleKitConfig.class.getClassLoader());
        this.f110116g = parcel.readInt() != 0 ? true : z;
        this.f110117h = true;
    }

    /* renamed from: v */
    static final Loggable m73868v(Channel channel) {
        if (channel instanceof PopulousChannel) {
            return ((PopulousChannel) channel).mo44697L();
        }
        C42318cq cqVar = new C42318cq();
        cqVar.f110981h.add(C42331dc.USER_ENTERED);
        PersonFieldMetadata a = cqVar.mo45296a();
        if (channel.mo44621b() == 1) {
            C42289bo h = Email.m74331h();
            h.mo45249g(channel.mo44627h());
            ((C42344e) h).f111048a = a;
            return h.mo45250h();
        }
        C42347h hVar = new C42347h();
        hVar.mo45303d(channel.mo44627h());
        hVar.f111067b = a;
        return hVar.mo45304g();
    }

    /* renamed from: w */
    private final void m73869w(int i) {
        C42075e eVar = this.f110113d;
        C71912k kVar = (C71912k) C71913l.f191523f.createBuilder();
        kVar.copyOnWrite();
        C71913l lVar = (C71913l) kVar.instance;
        lVar.f191526b = 4;
        lVar.f191525a |= 1;
        C71916o oVar = (C71916o) C71917p.f191532e.createBuilder();
        oVar.copyOnWrite();
        C71917p pVar = (C71917p) oVar.instance;
        pVar.f191535b = 1;
        pVar.f191534a |= 1;
        long a = this.f110113d.mo44575a("top_suggestions_latency").mo44569a();
        oVar.copyOnWrite();
        C71917p pVar2 = (C71917p) oVar.instance;
        pVar2.f191534a |= 2;
        pVar2.f191536c = a;
        int e = this.f110113d.mo44579e();
        oVar.copyOnWrite();
        C71917p pVar3 = (C71917p) oVar.instance;
        int i2 = e - 1;
        if (e != 0) {
            pVar3.f191537d = i2;
            pVar3.f191534a |= 4;
            kVar.copyOnWrite();
            C71913l lVar2 = (C71913l) kVar.instance;
            C71917p pVar4 = (C71917p) oVar.build();
            pVar4.getClass();
            lVar2.f191529e = pVar4;
            lVar2.f191525a |= 8;
            C71919r rVar = (C71919r) C71920s.f191539e.createBuilder();
            int f = this.f110113d.mo44580f();
            rVar.copyOnWrite();
            C71920s sVar = (C71920s) rVar.instance;
            int i3 = f - 1;
            if (f != 0) {
                sVar.f191542b = i3;
                sVar.f191541a |= 1;
                rVar.copyOnWrite();
                C71920s sVar2 = (C71920s) rVar.instance;
                sVar2.f191543c = 1;
                sVar2.f191541a |= 2;
                rVar.copyOnWrite();
                C71920s sVar3 = (C71920s) rVar.instance;
                sVar3.f191541a = 4 | sVar3.f191541a;
                sVar3.f191544d = i;
                kVar.copyOnWrite();
                C71913l lVar3 = (C71913l) kVar.instance;
                C71920s sVar4 = (C71920s) rVar.build();
                sVar4.getClass();
                lVar3.f191527c = sVar4;
                lVar3.f191525a |= 2;
                eVar.mo44576b((C71913l) kVar.build());
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: x */
    private final void m73870x() {
        if (this.f110117h) {
            throw new IllegalStateException("The PopulousDataLayer was not rehydrated before being used");
        }
    }

    /* renamed from: y */
    private static final C60870cx m73871y() {
        return C60856cj.m92899h(new UnsupportedOperationException("HideSuggestionRpcLoader was not provided as a dependency."));
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x02c9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02be  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44713a(com.google.android.libraries.social.populous.Autocompletion[] r20, com.google.android.libraries.social.populous.C42152af r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = r2.f110407c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 6
            if (r3 == 0) goto L_0x01e3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r8 = r1.length
            r9 = 0
            r10 = 0
        L_0x0017:
            if (r9 >= r8) goto L_0x018a
            r11 = r1[r9]
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r12 = r0.f110111b
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.google.android.libraries.social.populous.Group r14 = r11.mo44772a()
            if (r14 == 0) goto L_0x0103
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.j r15 = new com.google.android.libraries.social.peoplekit.common.dataservice.populous.j
            r15.<init>()
            com.google.android.libraries.social.populous.core.GroupMetadata r16 = r14.mo44780a()
            com.google.common.base.ax r6 = r16.mo44930c()
            r15.f110161c = r6
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.e r6 = new com.google.android.libraries.social.peoplekit.common.dataservice.populous.e
            r6.<init>()
            java.lang.String r5 = r14.mo44783d()
            r6.f110130b = r5
            r6.f110131c = r4
            com.google.android.libraries.social.populous.Group r5 = r11.mo44772a()
            com.google.common.b.gu r5 = r5.mo44782c()
            int r4 = r5.size()
            r7 = 0
        L_0x0051:
            if (r7 >= r4) goto L_0x0097
            java.lang.Object r17 = r5.get(r7)
            com.google.android.libraries.social.populous.core.GroupOrigin r17 = (com.google.android.libraries.social.populous.core.GroupOrigin) r17
            com.google.android.libraries.social.populous.core.Name r18 = r17.mo45006a()
            if (r18 != 0) goto L_0x0067
            int r7 = r7 + 1
            com.google.android.libraries.social.populous.core.Photo r18 = r17.mo45007b()
            if (r18 == 0) goto L_0x0051
        L_0x0067:
            com.google.android.libraries.social.populous.core.Name r4 = r17.mo45006a()
            if (r4 == 0) goto L_0x0087
            com.google.android.libraries.social.populous.core.Name r4 = r17.mo45006a()
            java.lang.String r4 = r4.f110777a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0087
            com.google.android.libraries.social.populous.core.Name r4 = r17.mo45006a()
            java.lang.String r4 = r4.f110777a
            java.lang.String r4 = r4.toString()
            r5 = 0
            r6.mo44728b(r4, r5, r5)
        L_0x0087:
            com.google.android.libraries.social.populous.core.Photo r4 = r17.mo45007b()
            if (r4 == 0) goto L_0x0097
            com.google.android.libraries.social.populous.core.Photo r4 = r17.mo45007b()
            java.lang.String r4 = r4.mo45048d()
            r6.f110139k = r4
        L_0x0097:
            r4 = 2
            r6.f110129a = r4
            com.google.android.libraries.social.populous.Group r4 = r11.mo44772a()
            r6.f110154z = r4
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousChannel r4 = r6.mo44727a()
            r13.add(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.google.common.b.gu r5 = r14.mo44781b()
            int r6 = r5.size()
            r7 = 0
        L_0x00b5:
            if (r7 >= r6) goto L_0x00f4
            java.lang.Object r11 = r5.get(r7)
            com.google.android.libraries.social.populous.GroupMember r11 = (com.google.android.libraries.social.populous.GroupMember) r11
            com.google.android.libraries.social.populous.Person r11 = r11.mo44788a()
            com.google.common.b.gu r14 = r11.f110371g
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x00d5
            com.google.common.b.gu r14 = r11.f110371g
            r17 = r5
            r5 = 0
            java.lang.Object r14 = r14.get(r5)
            com.google.android.libraries.social.populous.core.ContactMethodField r14 = (com.google.android.libraries.social.populous.core.ContactMethodField) r14
            goto L_0x00e4
        L_0x00d5:
            r17 = r5
            com.google.android.libraries.social.populous.core.j r5 = new com.google.android.libraries.social.populous.core.j
            r5.<init>()
            java.lang.String r14 = ""
            r5.f111078a = r14
            com.google.android.libraries.social.populous.core.ProfileId r14 = r5.mo45312d()
        L_0x00e4:
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.e r5 = com.google.android.libraries.social.peoplekit.common.dataservice.populous.C42112f.m73903b(r11, r14, r12)
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousChannel r5 = r5.mo44727a()
            r4.add(r5)
            int r7 = r7 + 1
            r5 = r17
            goto L_0x00b5
        L_0x00f4:
            r15.f110159a = r13
            r15.f110160b = r4
            java.util.List r4 = r15.f110159a
            r4.getClass()
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousCoalescedGroup r4 = new com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousCoalescedGroup
            r4.<init>((com.google.android.libraries.social.peoplekit.common.dataservice.populous.C42116j) r15)
            goto L_0x016f
        L_0x0103:
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.h r4 = new com.google.android.libraries.social.peoplekit.common.dataservice.populous.h
            r4.<init>()
            com.google.android.libraries.social.populous.Person r5 = r11.mo44773b()
            com.google.common.b.gu r6 = r5.f110371g
            r7 = r6
            com.google.common.b.pq r7 = (com.google.common.p4522b.C58724pq) r7
            int r7 = r7.f156474d
            r11 = 0
        L_0x0114:
            if (r11 >= r7) goto L_0x012d
            java.lang.Object r14 = r6.get(r11)
            com.google.android.libraries.social.populous.core.ContactMethodField r14 = (com.google.android.libraries.social.populous.core.ContactMethodField) r14
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.e r14 = com.google.android.libraries.social.peoplekit.common.dataservice.populous.C42112f.m73903b(r5, r14, r12)
            r15 = 2
            r14.f110129a = r15
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousChannel r14 = r14.mo44727a()
            r13.add(r14)
            int r11 = r11 + 1
            goto L_0x0114
        L_0x012d:
            boolean r6 = com.google.android.libraries.social.peoplekit.common.p3283e.C42131a.m73927j()
            if (r6 == 0) goto L_0x014a
            boolean r6 = r12.mo44761f()
            if (r6 != 0) goto L_0x013a
            goto L_0x014a
        L_0x013a:
            com.google.by.c.b.a.b.d r6 = r5.f110370f
            if (r6 == 0) goto L_0x014a
            boolean r7 = com.google.android.libraries.social.peoplekit.common.dataservice.populous.C42112f.m73906e(r6)
            r4.f110156b = r7
            java.util.List r6 = com.google.android.libraries.social.peoplekit.common.dataservice.populous.C42112f.m73904c(r6)
            r4.f110157c = r6
        L_0x014a:
            com.google.common.b.gu r5 = r5.f110371g
            r6 = r5
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6
            int r6 = r6.f156474d
            r7 = 0
        L_0x0152:
            if (r7 >= r6) goto L_0x0166
            int r11 = r7 + 1
            java.lang.Object r7 = r5.get(r7)
            com.google.android.libraries.social.populous.core.ContactMethodField r7 = (com.google.android.libraries.social.populous.core.ContactMethodField) r7
            boolean r7 = com.google.android.libraries.social.peoplekit.common.dataservice.populous.C42112f.m73905d(r7)
            if (r7 == 0) goto L_0x0164
            r5 = 1
            goto L_0x0167
        L_0x0164:
            r7 = r11
            goto L_0x0152
        L_0x0166:
            r5 = 0
        L_0x0167:
            r4.f110158d = r5
            r4.f110155a = r13
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousCoalescedChannels r4 = r4.mo44731a()
        L_0x016f:
            r3.add(r4)
            java.util.List r4 = r4.mo44648c()
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r4 = (com.google.android.libraries.social.peoplekit.common.dataservice.Channel) r4
            boolean r4 = r4.mo44611C()
            if (r4 == 0) goto L_0x0185
            int r10 = r10 + 1
        L_0x0185:
            int r9 = r9 + 1
            r4 = 6
            goto L_0x0017
        L_0x018a:
            boolean r1 = com.google.android.libraries.social.peoplekit.common.p3283e.C42131a.m73925h()
            if (r1 != 0) goto L_0x01b0
            int r1 = r2.f110405a
            if (r1 != 0) goto L_0x01a3
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r1 = r0.f110111b
            com.google.android.libraries.social.peoplekit.common.dataservice.p r1 = com.google.android.libraries.social.peoplekit.common.dataservice.C42106p.m73813a(r1)
            r1.f110066b = r3
            long r4 = java.lang.System.currentTimeMillis()
            r1.f110067c = r4
            goto L_0x01b0
        L_0x01a3:
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r1 = r0.f110111b
            com.google.android.libraries.social.peoplekit.common.dataservice.p r1 = com.google.android.libraries.social.peoplekit.common.dataservice.C42106p.m73813a(r1)
            java.util.List r1 = r1.mo44695b()
            r1.addAll(r3)
        L_0x01b0:
            com.google.android.libraries.social.peoplekit.common.dataservice.c r1 = new com.google.android.libraries.social.peoplekit.common.dataservice.c
            r1.<init>()
            int r4 = r2.f110405a
            r1.f110046a = r4
            boolean r4 = r2.f110406b
            r1.f110047b = r4
            java.lang.String r4 = r2.f110407c
            r1.f110048c = r4
            r1.f110049d = r10
            com.google.android.libraries.social.peoplekit.common.dataservice.d r4 = new com.google.android.libraries.social.peoplekit.common.dataservice.d
            r4.<init>(r1)
            int r1 = r2.f110405a
            r0.m73869w(r1)
            java.util.Set r1 = r0.f110114e
            java.util.Iterator r1 = r1.iterator()
        L_0x01d3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03bf
            java.lang.Object r2 = r1.next()
            com.google.android.libraries.social.peoplekit.common.dataservice.l r2 = (com.google.android.libraries.social.peoplekit.common.dataservice.C42102l) r2
            r2.mo44456g(r3, r4)
            goto L_0x01d3
        L_0x01e3:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.length
            r5 = 0
            r6 = 0
        L_0x01eb:
            r7 = 0
            if (r5 >= r4) goto L_0x02cd
            r8 = r1[r5]
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r9 = r0.f110111b
            r8.getClass()
            com.google.android.libraries.social.populous.Person r10 = r8.mo44773b()
            com.google.android.libraries.social.populous.Group r8 = r8.mo44772a()
            if (r10 == 0) goto L_0x0218
            com.google.common.b.gu r11 = r10.f110371g
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x0218
            com.google.common.b.gu r7 = r10.f110371g
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            com.google.android.libraries.social.populous.core.ContactMethodField r7 = (com.google.android.libraries.social.populous.core.ContactMethodField) r7
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.e r7 = com.google.android.libraries.social.peoplekit.common.dataservice.populous.C42112f.m73903b(r10, r7, r9)
            r10 = 6
            r12 = 0
            goto L_0x02b2
        L_0x0218:
            if (r8 == 0) goto L_0x02ba
            com.google.common.b.gu r10 = r8.mo44782c()
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0226
            goto L_0x02ba
        L_0x0226:
            com.google.common.b.gu r10 = r8.mo44782c()
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            com.google.android.libraries.social.populous.core.GroupOrigin r10 = (com.google.android.libraries.social.populous.core.GroupOrigin) r10
            java.lang.String r10 = r10.mo45008c()
            java.lang.String r11 = "CONTACT_LABEL"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x02ba
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.e r7 = new com.google.android.libraries.social.peoplekit.common.dataservice.populous.e
            r7.<init>()
            boolean r10 = r9.mo44763h()
            if (r10 == 0) goto L_0x0256
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.v r10 = new com.google.android.libraries.social.peoplekit.common.dataservice.populous.v
            r10.<init>()
            r10.f110199a = r8
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousGroup r12 = new com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousGroup
            r12.<init>((com.google.android.libraries.social.peoplekit.common.dataservice.populous.C42128v) r10)
            r7.f110153y = r12
        L_0x0256:
            com.google.common.b.gu r10 = r8.mo44782c()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x02a8
            com.google.common.b.gu r10 = r8.mo44782c()
            r12 = 0
            java.lang.Object r10 = r10.get(r12)
            com.google.android.libraries.social.populous.core.GroupOrigin r10 = (com.google.android.libraries.social.populous.core.GroupOrigin) r10
            com.google.android.libraries.social.populous.core.Name r13 = r10.mo45006a()
            java.lang.String r13 = r13.f110777a
            java.lang.String r13 = r13.toString()
            r14 = 1
            r7.mo44728b(r13, r14, r14)
            com.google.android.libraries.social.populous.core.Photo r13 = r10.mo45007b()
            if (r13 == 0) goto L_0x0289
            com.google.android.libraries.social.populous.core.Photo r13 = r10.mo45007b()
            java.lang.String r13 = r13.mo45048d()
            r7.f110139k = r13
        L_0x0289:
            java.lang.String r10 = r10.mo45008c()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x029e
            java.lang.String r10 = r8.mo44783d()
            r7.f110130b = r10
            r10 = 7
            r7.f110131c = r10
            r10 = 6
            goto L_0x02aa
        L_0x029e:
            java.lang.String r10 = r8.mo44783d()
            r7.f110130b = r10
            r10 = 6
            r7.f110131c = r10
            goto L_0x02aa
        L_0x02a8:
            r10 = 6
            r12 = 0
        L_0x02aa:
            java.lang.String r9 = r9.mo44760e()
            r7.f110151w = r9
            r7.f110154z = r8
        L_0x02b2:
            r8 = 3
            r7.f110129a = r8
            com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousChannel r7 = r7.mo44727a()
            goto L_0x02bc
        L_0x02ba:
            r10 = 6
            r12 = 0
        L_0x02bc:
            if (r7 == 0) goto L_0x02c9
            r3.add(r7)
            boolean r7 = r7.mo44611C()
            if (r7 == 0) goto L_0x02c9
            int r6 = r6 + 1
        L_0x02c9:
            int r5 = r5 + 1
            goto L_0x01eb
        L_0x02cd:
            com.google.android.libraries.social.peoplekit.common.dataservice.c r1 = new com.google.android.libraries.social.peoplekit.common.dataservice.c
            r1.<init>()
            int r4 = r2.f110405a
            r1.f110046a = r4
            boolean r4 = r2.f110406b
            r1.f110047b = r4
            java.lang.String r4 = r2.f110407c
            r1.f110048c = r4
            r1.f110049d = r6
            com.google.android.libraries.social.peoplekit.common.dataservice.d r4 = new com.google.android.libraries.social.peoplekit.common.dataservice.d
            r4.<init>(r1)
            int r1 = r2.f110405a
            com.google.android.libraries.social.peoplekit.common.analytics.e r2 = r0.f110113d
            o.c.a.a.l r5 = p5602o.p5607c.p5608a.p5609a.C71913l.f191523f
            com.google.protobuf.bn r5 = r5.createBuilder()
            o.c.a.a.k r5 = (p5602o.p5607c.p5608a.p5609a.C71912k) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            o.c.a.a.l r6 = (p5602o.p5607c.p5608a.p5609a.C71913l) r6
            r8 = 4
            r6.f191526b = r8
            int r9 = r6.f191525a
            r10 = 1
            r9 = r9 | r10
            r6.f191525a = r9
            o.c.a.a.p r6 = p5602o.p5607c.p5608a.p5609a.C71917p.f191532e
            com.google.protobuf.bn r6 = r6.createBuilder()
            o.c.a.a.o r6 = (p5602o.p5607c.p5608a.p5609a.C71916o) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            o.c.a.a.p r9 = (p5602o.p5607c.p5608a.p5609a.C71917p) r9
            r9.f191535b = r10
            int r11 = r9.f191534a
            r11 = r11 | r10
            r9.f191534a = r11
            com.google.android.libraries.social.peoplekit.common.analytics.e r9 = r0.f110113d
            java.lang.String r10 = "auto_latency"
            com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch r9 = r9.mo44575a(r10)
            long r9 = r9.mo44569a()
            r6.copyOnWrite()
            com.google.protobuf.bv r11 = r6.instance
            o.c.a.a.p r11 = (p5602o.p5607c.p5608a.p5609a.C71917p) r11
            int r12 = r11.f191534a
            r13 = 2
            r12 = r12 | r13
            r11.f191534a = r12
            r11.f191536c = r9
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            o.c.a.a.l r9 = (p5602o.p5607c.p5608a.p5609a.C71913l) r9
            com.google.protobuf.bv r6 = r6.build()
            o.c.a.a.p r6 = (p5602o.p5607c.p5608a.p5609a.C71917p) r6
            r6.getClass()
            r9.f191529e = r6
            int r6 = r9.f191525a
            r6 = r6 | 8
            r9.f191525a = r6
            o.c.a.a.s r6 = p5602o.p5607c.p5608a.p5609a.C71920s.f191539e
            com.google.protobuf.bn r6 = r6.createBuilder()
            o.c.a.a.r r6 = (p5602o.p5607c.p5608a.p5609a.C71919r) r6
            com.google.android.libraries.social.peoplekit.common.analytics.e r9 = r0.f110113d
            int r9 = r9.mo44580f()
            r6.copyOnWrite()
            com.google.protobuf.bv r10 = r6.instance
            o.c.a.a.s r10 = (p5602o.p5607c.p5608a.p5609a.C71920s) r10
            int r11 = r9 + -1
            if (r9 == 0) goto L_0x03c0
            r10.f191542b = r11
            int r7 = r10.f191541a
            r9 = 1
            r7 = r7 | r9
            r10.f191541a = r7
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            o.c.a.a.s r7 = (p5602o.p5607c.p5608a.p5609a.C71920s) r7
            r9 = 2
            r7.f191543c = r9
            int r10 = r7.f191541a
            r10 = r10 | r9
            r7.f191541a = r10
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            o.c.a.a.s r7 = (p5602o.p5607c.p5608a.p5609a.C71920s) r7
            int r9 = r7.f191541a
            r8 = r8 | r9
            r7.f191541a = r8
            r7.f191544d = r1
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            o.c.a.a.l r1 = (p5602o.p5607c.p5608a.p5609a.C71913l) r1
            com.google.protobuf.bv r6 = r6.build()
            o.c.a.a.s r6 = (p5602o.p5607c.p5608a.p5609a.C71920s) r6
            r6.getClass()
            r1.f191527c = r6
            int r6 = r1.f191525a
            r7 = 2
            r6 = r6 | r7
            r1.f191525a = r6
            com.google.protobuf.bv r1 = r5.build()
            o.c.a.a.l r1 = (p5602o.p5607c.p5608a.p5609a.C71913l) r1
            r2.mo44576b(r1)
            java.util.Set r1 = r0.f110114e
            java.util.Iterator r1 = r1.iterator()
        L_0x03af:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03bf
            java.lang.Object r2 = r1.next()
            com.google.android.libraries.social.peoplekit.common.dataservice.l r2 = (com.google.android.libraries.social.peoplekit.common.dataservice.C42102l) r2
            r2.mo44453d(r3, r4)
            goto L_0x03af
        L_0x03bf:
            return
        L_0x03c0:
            goto L_0x03c2
        L_0x03c1:
            throw r7
        L_0x03c2:
            goto L_0x03c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousDataLayer.mo44713a(com.google.android.libraries.social.populous.Autocompletion[], com.google.android.libraries.social.populous.af):void");
    }

    /* renamed from: b */
    public final void mo44687b(List list, int i) {
        C42075e eVar = this.f110113d;
        C71912k kVar = (C71912k) C71913l.f191523f.createBuilder();
        kVar.copyOnWrite();
        C71913l lVar = (C71913l) kVar.instance;
        lVar.f191526b = 4;
        lVar.f191525a |= 1;
        C71916o oVar = (C71916o) C71917p.f191532e.createBuilder();
        oVar.copyOnWrite();
        C71917p pVar = (C71917p) oVar.instance;
        pVar.f191535b = 1;
        pVar.f191534a |= 1;
        long a = this.f110113d.mo44575a("device_latency").mo44569a();
        oVar.copyOnWrite();
        C71917p pVar2 = (C71917p) oVar.instance;
        pVar2.f191534a |= 2;
        pVar2.f191536c = a;
        kVar.copyOnWrite();
        C71913l lVar2 = (C71913l) kVar.instance;
        C71917p pVar3 = (C71917p) oVar.build();
        pVar3.getClass();
        lVar2.f191529e = pVar3;
        lVar2.f191525a |= 8;
        C71919r rVar = (C71919r) C71920s.f191539e.createBuilder();
        int f = this.f110113d.mo44580f();
        rVar.copyOnWrite();
        C71920s sVar = (C71920s) rVar.instance;
        int i2 = f - 1;
        if (f != 0) {
            sVar.f191542b = i2;
            sVar.f191541a |= 1;
            rVar.copyOnWrite();
            C71920s sVar2 = (C71920s) rVar.instance;
            sVar2.f191543c = 3;
            sVar2.f191541a |= 2;
            rVar.copyOnWrite();
            C71920s sVar3 = (C71920s) rVar.instance;
            sVar3.f191541a = 4 | sVar3.f191541a;
            sVar3.f191544d = 0;
            kVar.copyOnWrite();
            C71913l lVar3 = (C71913l) kVar.instance;
            C71920s sVar4 = (C71920s) rVar.build();
            sVar4.getClass();
            lVar3.f191527c = sVar4;
            lVar3.f191525a |= 2;
            eVar.mo44576b((C71913l) kVar.build());
            C42093c cVar = new C42093c();
            cVar.f110046a = 0;
            cVar.f110047b = true;
            cVar.f110048c = BuildConfig.FLAVOR;
            cVar.f110049d = i;
            for (C42102l s : this.f110114e) {
                s.mo44457s(list);
            }
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public final Channel mo44658c(String str, Context context) {
        C42100j jVar = new C42100j();
        jVar.f110056b = str;
        return jVar.mo44690a(context);
    }

    /* renamed from: d */
    public final Channel mo44659d(String str, String str2, Context context) {
        C42100j jVar = new C42100j();
        jVar.f110055a = str;
        jVar.f110056b = str2;
        return jVar.mo44690a(context);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final C60870cx mo44660e(ExecutorService executorService, List list) {
        return m73871y();
    }

    /* renamed from: f */
    public final C60870cx mo44661f(ExecutorService executorService, List list) {
        return m73871y();
    }

    /* renamed from: g */
    public final void mo44662g(C42102l lVar) {
        this.f110114e.add(lVar);
    }

    /* renamed from: h */
    public final void mo44663h(String str) {
        m73870x();
        Stopwatch a = this.f110113d.mo44575a("auto_latency");
        a.mo44570b();
        a.mo44571c();
        this.f110110a.mo44825n(str);
    }

    /* renamed from: i */
    public final void mo44664i() {
        m73870x();
        this.f110113d.mo44575a("device_latency").mo44571c();
        if (((Boolean) C42131a.f110204b.mo37303b()).booleanValue()) {
            C60856cj.m92911t(this.f110110a.mo44814b(), new C42118l(this), C60826bg.f164896a);
            return;
        }
        C42126t tVar = (C42126t) this.f110115f;
        tVar.f110198j = 0;
        tVar.f110194f.mo19398a(new C42123q(tVar));
    }

    /* renamed from: j */
    public final void mo44665j() {
        m73870x();
        Stopwatch a = this.f110113d.mo44575a("top_suggestions_latency");
        a.mo44570b();
        a.mo44571c();
        C42106p a2 = C42106p.m73813a(this.f110111b);
        if (C42131a.m73925h() || a2.mo44696c()) {
            if (this.f110112c.mo44862b() != null) {
                C42276bb bbVar = C42276bb.EMPTY;
                int ordinal = this.f110112c.mo44862b().ordinal();
                if (ordinal == 0) {
                    this.f110113d.mo44582h(5);
                } else if (ordinal == 1) {
                    this.f110113d.mo44582h(4);
                } else if (ordinal == 2) {
                    this.f110113d.mo44582h(3);
                }
            } else {
                this.f110113d.mo44582h(1);
            }
            this.f110110a.mo44825n(BuildConfig.FLAVOR);
            return;
        }
        this.f110113d.mo44582h(2);
        C42093c cVar = new C42093c();
        cVar.f110046a = 0;
        cVar.f110047b = true;
        cVar.f110048c = BuildConfig.FLAVOR;
        C42094d dVar = new C42094d(cVar);
        m73869w(0);
        for (C42102l g : this.f110114e) {
            g.mo44456g(a2.mo44695b(), dVar);
        }
        if (a2.f110066b.isEmpty() || System.currentTimeMillis() - a2.f110067c >= C42106p.f110063a) {
            this.f110110a.mo44825n(BuildConfig.FLAVOR);
        }
    }

    /* renamed from: k */
    public final void mo44666k(Channel channel, C42101k kVar) {
        C42255ah ahVar = new C42255ah();
        if (channel.mo44621b() == 1) {
            ahVar.mo45202c(C42320cs.EMAIL);
        } else if (channel.mo44621b() == 2) {
            ahVar.mo45202c(C42320cs.PHONE_NUMBER);
        } else {
            if (Log.isLoggable("PopulousDatalayer", 3)) {
                int b = channel.mo44621b();
                Log.d("PopulousDatalayer", "Trying to lookup a field of type: " + b + " but only email and phone numbers are supported.");
            }
            kVar.mo44414a();
            return;
        }
        ahVar.mo45201b(channel.mo44627h());
        C42321ct a = ahVar.mo45200a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        C42598s sVar = this.f110112c;
        C42200be f = C42201bf.m74161f();
        f.mo44896c(true);
        f.mo44894a();
        sVar.mo44864d(arrayList, new C42119m(channel, a, kVar));
    }

    /* renamed from: l */
    public final void mo44667l() {
        this.f110114e.clear();
    }

    /* renamed from: m */
    public final void mo44668m(Channel channel) {
        m73870x();
        this.f110110a.mo44821j(m73868v(channel));
    }

    /* renamed from: n */
    public final void mo44669n(Channel channel) {
        m73870x();
        if (channel instanceof PopulousChannel) {
            this.f110110a.mo44822k(m73868v(channel));
        }
    }

    /* renamed from: o */
    public final void mo44670o(Set set) {
        m73870x();
        Loggable[] loggableArr = new Loggable[set.size()];
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            loggableArr[i] = m73868v((Channel) it.next());
            i++;
        }
        C42075e eVar = this.f110113d;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144449L));
        peopleKitVisualElementPath.mo44564a(this.f110111b.mo44756a().f109973a);
        eVar.mo44577c(1, peopleKitVisualElementPath);
        this.f110110a.mo44823l(loggableArr);
    }

    /* renamed from: p */
    public final void mo44671p(Channel channel) {
        m73870x();
        Loggable v = m73868v(channel);
        this.f110110a.mo44820i(v, channel.mo44635p());
        this.f110110a.mo44824m(v);
        Stopwatch a = this.f110113d.mo44575a("TimeToFirstSelection");
        if (a.f109976c) {
            a.mo44572d();
            C42075e eVar = this.f110113d;
            C71912k kVar = (C71912k) C71913l.f191523f.createBuilder();
            kVar.copyOnWrite();
            C71913l lVar = (C71913l) kVar.instance;
            int i = 4;
            lVar.f191526b = 4;
            lVar.f191525a |= 1;
            C71916o oVar = (C71916o) C71917p.f191532e.createBuilder();
            oVar.copyOnWrite();
            C71917p pVar = (C71917p) oVar.instance;
            pVar.f191535b = 15;
            pVar.f191534a |= 1;
            long a2 = a.mo44569a();
            oVar.copyOnWrite();
            C71917p pVar2 = (C71917p) oVar.instance;
            pVar2.f191534a |= 2;
            pVar2.f191536c = a2;
            int e = this.f110113d.mo44579e();
            oVar.copyOnWrite();
            C71917p pVar3 = (C71917p) oVar.instance;
            int i2 = e - 1;
            if (e != 0) {
                pVar3.f191537d = i2;
                pVar3.f191534a |= 4;
                kVar.copyOnWrite();
                C71913l lVar2 = (C71913l) kVar.instance;
                C71917p pVar4 = (C71917p) oVar.build();
                pVar4.getClass();
                lVar2.f191529e = pVar4;
                lVar2.f191525a |= 8;
                C71919r rVar = (C71919r) C71920s.f191539e.createBuilder();
                int f = this.f110113d.mo44580f();
                rVar.copyOnWrite();
                C71920s sVar = (C71920s) rVar.instance;
                int i3 = f - 1;
                if (f != 0) {
                    sVar.f191542b = i3;
                    sVar.f191541a |= 1;
                    switch (channel.mo44620a()) {
                        case 1:
                        case 3:
                            i = 3;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 4:
                            break;
                        case 5:
                            i = 8;
                            break;
                        case 6:
                        case 7:
                            i = 9;
                            break;
                        default:
                            i = 1;
                            break;
                    }
                    rVar.copyOnWrite();
                    C71920s sVar2 = (C71920s) rVar.instance;
                    sVar2.f191543c = i - 1;
                    sVar2.f191541a |= 2;
                    kVar.copyOnWrite();
                    C71913l lVar3 = (C71913l) kVar.instance;
                    C71920s sVar3 = (C71920s) rVar.build();
                    sVar3.getClass();
                    lVar3.f191527c = sVar3;
                    lVar3.f191525a |= 2;
                    eVar.mo44576b((C71913l) kVar.build());
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: q */
    public final C42136f mo44672q() {
        return new C42136f();
    }

    /* renamed from: r */
    public final void mo44673r(List list, List list2, List list3, C42012e eVar) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        LinkedHashSet<Channel> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(list);
        linkedHashSet.addAll(list2);
        linkedHashSet.addAll(list3);
        for (Channel channel : linkedHashSet) {
            C42255ah ahVar = new C42255ah();
            if (channel.mo44621b() == 1) {
                ahVar.mo45202c(C42320cs.EMAIL);
            } else if (channel.mo44621b() == 2) {
                ahVar.mo45202c(C42320cs.PHONE_NUMBER);
            } else if (Log.isLoggable("PopulousDatalayer", 3)) {
                int b = channel.mo44621b();
                Log.d("PopulousDatalayer", "Trying to lookup a field of type: " + b + " but only email and phone numbers are supported.");
            }
            ahVar.mo45201b(channel.mo44627h());
            C42321ct a = ahVar.mo45200a();
            arrayList.add(a);
            hashMap.put(a, channel);
        }
        C42598s sVar = this.f110112c;
        C42200be f = C42201bf.m74161f();
        f.mo44895b(false);
        f.mo44894a();
        sVar.mo44864d(arrayList, new C42120n(hashMap, list, list2, list3, eVar, linkedHashSet));
    }

    /* renamed from: s */
    public final Channel mo44674s(C41949x xVar) {
        String str;
        PeopleKitConfig peopleKitConfig = this.f110111b;
        C42111e eVar = new C42111e();
        String str2 = xVar.f109497c;
        int a = C41948w.m73464a(xVar.f109496b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        eVar.f110130b = str2;
        eVar.f110131c = C42096f.m73802g(a);
        if ((xVar.f109495a & 4) != 0) {
            C41943r rVar = xVar.f109498d;
            if (rVar == null) {
                rVar = C41943r.f109473l;
            }
            String str3 = rVar.f109476b;
            C41943r rVar2 = xVar.f109498d;
            boolean z = !(rVar2 == null ? C41943r.f109473l : rVar2).f109479e;
            if (rVar2 == null) {
                rVar2 = C41943r.f109473l;
            }
            eVar.mo44728b(str3, z, rVar2.f109479e);
            C41943r rVar3 = xVar.f109498d;
            eVar.f110140l = (rVar3 == null ? C41943r.f109473l : rVar3).f109478d;
            eVar.f110139k = (rVar3 == null ? C41943r.f109473l : rVar3).f109477c;
            eVar.f110129a = 0;
            if (((rVar3 == null ? C41943r.f109473l : rVar3).f109475a & 16) != 0) {
                String str4 = (rVar3 == null ? C41943r.f109473l : rVar3).f109480f;
                if (rVar3 == null) {
                    rVar3 = C41943r.f109473l;
                }
                int a2 = C41948w.m73464a(rVar3.f109481g);
                if (a2 == 0) {
                    a2 = 1;
                }
                eVar.f110149u = str4;
                eVar.f110150v = C42096f.m73802g(a2);
            }
        }
        if ((xVar.f109495a & 8) != 0) {
            C41939n nVar = xVar.f109499e;
            if (nVar == null) {
                nVar = C41939n.f109468b;
            }
            str = nVar.f109470a;
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (TextUtils.isEmpty(str)) {
            C41943r rVar4 = xVar.f109498d;
            if (rVar4 == null) {
                rVar4 = C41943r.f109473l;
            }
            if (!rVar4.f109476b.isEmpty()) {
                C41943r rVar5 = xVar.f109498d;
                if (rVar5 == null) {
                    rVar5 = C41943r.f109473l;
                }
                str = C42096f.m73798c(rVar5.f109476b);
            }
        }
        C41932g gVar = xVar.f109500f;
        if (gVar == null) {
            gVar = C41932g.f109390d;
        }
        if (gVar.f109393b.size() > 0) {
            C41932g gVar2 = xVar.f109500f;
            if (gVar2 == null) {
                gVar2 = C41932g.f109390d;
            }
            C41926ac acVar = (C41926ac) gVar2.f109393b.get(0);
            int a3 = C41934i.m73458a(acVar.f109381c);
            if (a3 == 0) {
                a3 = 1;
            }
            eVar.f110127A = a3;
            int a4 = C41941p.m73462a(acVar.f109380b);
            if (a4 != 0) {
                i = a4;
            }
            eVar.f110128B = i;
        }
        eVar.f110138j = str;
        eVar.f110151w = peopleKitConfig != null ? peopleKitConfig.mo44760e() : null;
        return eVar.mo44727a();
    }

    /* renamed from: t */
    public final void mo44675t(Set set) {
        m73870x();
        Stopwatch a = this.f110113d.mo44575a("TimeToSend");
        if (a.f109976c) {
            a.mo44572d();
            C42075e eVar = this.f110113d;
            C71912k kVar = (C71912k) C71913l.f191523f.createBuilder();
            kVar.copyOnWrite();
            C71913l lVar = (C71913l) kVar.instance;
            lVar.f191526b = 4;
            lVar.f191525a |= 1;
            C71916o oVar = (C71916o) C71917p.f191532e.createBuilder();
            oVar.copyOnWrite();
            C71917p pVar = (C71917p) oVar.instance;
            pVar.f191535b = 14;
            pVar.f191534a |= 1;
            long a2 = a.mo44569a();
            oVar.copyOnWrite();
            C71917p pVar2 = (C71917p) oVar.instance;
            pVar2.f191534a |= 2;
            pVar2.f191536c = a2;
            int e = this.f110113d.mo44579e();
            oVar.copyOnWrite();
            C71917p pVar3 = (C71917p) oVar.instance;
            int i = e - 1;
            if (e != 0) {
                pVar3.f191537d = i;
                pVar3.f191534a |= 4;
                kVar.copyOnWrite();
                C71913l lVar2 = (C71913l) kVar.instance;
                C71917p pVar4 = (C71917p) oVar.build();
                pVar4.getClass();
                lVar2.f191529e = pVar4;
                lVar2.f191525a |= 8;
                C71919r rVar = (C71919r) C71920s.f191539e.createBuilder();
                int f = this.f110113d.mo44580f();
                rVar.copyOnWrite();
                C71920s sVar = (C71920s) rVar.instance;
                int i2 = f - 1;
                if (f != 0) {
                    sVar.f191542b = i2;
                    sVar.f191541a |= 1;
                    rVar.copyOnWrite();
                    C71920s sVar2 = (C71920s) rVar.instance;
                    sVar2.f191543c = 1;
                    sVar2.f191541a |= 2;
                    kVar.copyOnWrite();
                    C71913l lVar3 = (C71913l) kVar.instance;
                    C71920s sVar3 = (C71920s) rVar.build();
                    sVar3.getClass();
                    lVar3.f191527c = sVar3;
                    lVar3.f191525a |= 2;
                    eVar.mo44576b((C71913l) kVar.build());
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        Loggable[] loggableArr = new Loggable[set.size()];
        Iterator it = set.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            loggableArr[i3] = m73868v((Channel) it.next());
            i3++;
        }
        try {
            this.f110110a.mo44827p();
        } catch (C42196ba unused) {
        }
    }

    /* renamed from: u */
    public final void mo44676u() {
        this.f110116g = false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110110a, i);
        parcel.writeParcelable(this.f110111b, i);
        parcel.writeInt(this.f110116g ? 1 : 0);
    }

    public PopulousDataLayer(C42121o oVar) {
        this.f110114e = new HashSet();
        this.f110117h = false;
        this.f110112c = oVar.f110173b;
        AutocompleteSessionBase autocompleteSessionBase = oVar.f110172a;
        this.f110110a = autocompleteSessionBase;
        autocompleteSessionBase.mo44817f(this);
        C42098h hVar = oVar.f110174c;
        if (hVar != null) {
            this.f110115f = hVar;
            ((C42126t) hVar).f110196h.add(this);
        }
        this.f110111b = oVar.f110175d;
        this.f110113d = oVar.f110176e;
        this.f110116g = false;
    }
}
