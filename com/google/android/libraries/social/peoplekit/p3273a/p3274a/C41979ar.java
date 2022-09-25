package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.social.peoplekit.C41960a;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42013f;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42014g;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3280b.C42081a;
import com.google.android.libraries.social.peoplekit.common.p3280b.C42085e;
import com.google.android.libraries.social.peoplekit.common.p3280b.C42086f;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42089b;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.ar */
/* compiled from: PG */
public final class C41979ar extends C0640fb implements C42081a {

    /* renamed from: a */
    public final Context f109576a;

    /* renamed from: b */
    public final PeopleKitDataLayer f109577b;

    /* renamed from: c */
    public final PeopleKitSelectionModel f109578c;

    /* renamed from: d */
    public final C42075e f109579d;

    /* renamed from: e */
    public final PeopleKitConfig f109580e;

    /* renamed from: f */
    public final C41960a f109581f;

    /* renamed from: g */
    public final PeopleKitVisualElementPath f109582g;

    /* renamed from: h */
    public boolean f109583h;

    /* renamed from: i */
    public boolean f109584i = false;

    /* renamed from: j */
    public boolean f109585j;

    /* renamed from: k */
    public C42141b f109586k;

    /* renamed from: l */
    public final C42081a f109587l;

    /* renamed from: m */
    public final C42086f f109588m;

    /* renamed from: n */
    public C42013f f109589n;

    /* renamed from: o */
    public C42014g f109590o;

    /* renamed from: p */
    private ViewGroup f109591p;

    /* renamed from: q */
    private final int f109592q;

    /* renamed from: r */
    private List f109593r;

    /* renamed from: s */
    private List f109594s;

    /* renamed from: t */
    private final C42089b f109595t;

    /* renamed from: u */
    private boolean f109596u;

    /* renamed from: v */
    private final boolean f109597v;

    public C41979ar(Context context, ExecutorService executorService, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, C42075e eVar, PeopleKitConfig peopleKitConfig, C41960a aVar, PeopleKitVisualElementPath peopleKitVisualElementPath, C42089b bVar, C42141b bVar2, C42081a aVar2) {
        this.f109576a = context;
        this.f109593r = new ArrayList();
        this.f109594s = new ArrayList();
        this.f109577b = peopleKitDataLayer;
        this.f109578c = peopleKitSelectionModel;
        this.f109579d = eVar;
        this.f109580e = peopleKitConfig;
        this.f109581f = aVar;
        this.f109582g = peopleKitVisualElementPath;
        this.f109592q = ((PeopleKitConfigImpl) peopleKitConfig).f110240g;
        C42087a.m73675a(bVar2);
        this.f109586k = bVar2;
        this.f109587l = aVar2;
        C42085e eVar2 = new C42085e();
        eVar2.f110007a = this.f109586k;
        eVar2.f110008b = context;
        eVar2.f110009c = executorService;
        eVar2.f110010d = peopleKitDataLayer;
        eVar2.f110011e = eVar;
        eVar2.f110012f = peopleKitVisualElementPath;
        eVar2.f110013g = this;
        this.f109588m = eVar2.mo44594a();
        this.f109595t = bVar;
        this.f109596u = bVar.mo44602e();
        this.f109597v = ((AccessibilityManager) context.getSystemService("accessibility")).isTouchExplorationEnabled();
    }

    /* renamed from: a */
    public final void mo44437a() {
        if (this.f109591p != null) {
            ((InputMethodManager) this.f109576a.getSystemService("input_method")).hideSoftInputFromWindow(this.f109591p.getWindowToken(), 0);
        }
    }

    /* renamed from: b */
    public final void mo44438b(List list) {
        if (!C42131a.m73927j() || !((PeopleKitConfigImpl) this.f109580e).f110255v) {
            this.f109593r = list;
        } else {
            this.f109584i = false;
            if (list == null) {
                this.f109593r = null;
                this.f109594s = null;
            } else {
                this.f109593r = new ArrayList();
                this.f109594s = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Channel channel = (Channel) it.next();
                    if (channel.mo44610B()) {
                        this.f109594s.add(channel);
                    } else {
                        this.f109593r.add(channel);
                    }
                }
            }
        }
        this.mObservable.mo2879a();
    }

    /* renamed from: c */
    public final void mo44439c() {
        this.f109596u = false;
        this.mObservable.mo2879a();
    }

    public final int getItemCount() {
        int i = 0;
        if (this.f109593r == null) {
            return 0;
        }
        if (C42131a.m73927j() && ((PeopleKitConfigImpl) this.f109580e).f110255v && !this.f109594s.isEmpty()) {
            i = this.f109584i ? this.f109594s.size() : 1;
        }
        return this.f109593r.size() + (this.f109596u ? 1 : 0) + i;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r1v3, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0301  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(android.support.p033v7.widget.C0673gh r20, int r21) {
        /*
            r19 = this;
            r6 = r19
            r7 = r21
            r0 = r20
            com.google.android.libraries.social.peoplekit.a.a.aq r0 = (com.google.android.libraries.social.peoplekit.p3273a.p3274a.C41978aq) r0
            com.google.android.libraries.social.peoplekit.a.a.au r14 = r0.f109575a
            com.google.android.libraries.social.peoplekit.configs.b r0 = r6.f109586k
            com.google.android.libraries.social.peoplekit.common.p3281c.C42087a.m73675a(r0)
            com.google.android.libraries.social.peoplekit.configs.b r1 = r14.f109611k
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x001c
            r14.f109611k = r0
            r14.mo44445d()
        L_0x001c:
            android.view.View r0 = r14.f109602b
            r1 = 2131434396(0x7f0b1b9c, float:1.8490605E38)
            android.view.View r0 = r0.findViewById(r1)
            r2 = 8
            r0.setVisibility(r2)
            r3 = 2131434398(0x7f0b1b9e, float:1.8490609E38)
            android.view.View r0 = r0.findViewById(r3)
            r0.setVisibility(r2)
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.d r0 = r14.f109603c
            r0.mo44507c()
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.d r0 = r14.f109603c
            android.view.View r0 = r0.f109785a
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r4)
            android.widget.TextView r0 = r14.f109604d
            java.lang.String r4 = ""
            r0.setText(r4)
            android.widget.TextView r0 = r14.f109605e
            r0.setText(r4)
            r14.mo44444c(r4)
            r15 = 0
            r14.mo44443b(r15)
            android.view.View r0 = r14.f109602b
            r4 = 2131434401(0x7f0b1ba1, float:1.8490615E38)
            android.view.View r0 = r0.findViewById(r4)
            r0.setVisibility(r15)
            android.view.View r0 = r14.f109602b
            r5 = 2131434399(0x7f0b1b9f, float:1.849061E38)
            android.view.View r0 = r0.findViewById(r5)
            r0.setVisibility(r2)
            android.view.View r0 = r14.f109602b
            r8 = 2131434417(0x7f0b1bb1, float:1.8490647E38)
            android.view.View r0 = r0.findViewById(r8)
            r0.setVisibility(r2)
            android.view.View r0 = r14.f109602b
            r8 = 2131434419(0x7f0b1bb3, float:1.8490651E38)
            android.view.View r0 = r0.findViewById(r8)
            r0.setVisibility(r2)
            android.view.View r0 = r14.f109602b
            r8 = 2131434403(0x7f0b1ba3, float:1.8490619E38)
            android.view.View r0 = r0.findViewById(r8)
            r0.setVisibility(r2)
            android.view.View r0 = r14.f109602b
            r13 = 2131434426(0x7f0b1bba, float:1.8490666E38)
            android.view.View r0 = r0.findViewById(r13)
            r0.setVisibility(r2)
            android.view.View r0 = r14.f109602b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r9 = -2
            r0.height = r9
            android.view.View r0 = r14.f109602b
            r9 = 0
            r0.setOnClickListener(r9)
            boolean r0 = com.google.android.libraries.social.peoplekit.common.p3283e.C42131a.m73927j()
            if (r0 == 0) goto L_0x00bf
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r0 = r14.f109608h
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r0 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r0
            boolean r0 = r0.f110255v
            if (r0 == 0) goto L_0x00bf
            android.view.View r0 = r14.f109602b
            r0.setOnLongClickListener(r9)
        L_0x00bf:
            r14.mo44446g(r15)
            boolean r0 = r6.f109596u
            r10 = -1
            if (r0 == 0) goto L_0x010a
            java.util.List r0 = r6.f109593r
            int r0 = r0.size()
            if (r7 == r0) goto L_0x00d0
            goto L_0x010a
        L_0x00d0:
            android.view.View r0 = r14.f109602b
            android.view.View r0 = r0.findViewById(r4)
            r0.setVisibility(r2)
            android.view.View r0 = r14.f109602b
            android.view.View r0 = r0.findViewById(r5)
            r0.setVisibility(r15)
            com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath r0 = new com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath
            r0.<init>()
            com.google.android.libraries.social.e.a.a r1 = new com.google.android.libraries.social.e.a.a
            com.google.android.libraries.social.a.d.d r2 = com.google.p4140ba.p4150c.p4151a.C54941a.f144457T
            r1.<init>(r2)
            com.google.android.libraries.social.a.d.b r2 = r0.f109973a
            r2.mo44369a(r1)
            com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath r1 = r14.f109609i
            com.google.android.libraries.social.a.d.b r1 = r1.f109973a
            r0.mo44564a(r1)
            com.google.android.libraries.social.peoplekit.common.analytics.e r1 = r14.f109607g
            r1.mo44577c(r10, r0)
            android.view.View r1 = r14.f109602b
            com.google.android.libraries.social.peoplekit.a.a.as r2 = new com.google.android.libraries.social.peoplekit.a.a.as
            r2.<init>(r14, r0)
            r1.setOnClickListener(r2)
            return
        L_0x010a:
            boolean r0 = com.google.android.libraries.social.peoplekit.common.p3283e.C42131a.m73927j()
            if (r0 == 0) goto L_0x016a
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r0 = r6.f109580e
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r0 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r0
            boolean r0 = r0.f110255v
            if (r0 == 0) goto L_0x016a
            java.util.List r0 = r6.f109594s
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x016a
            boolean r0 = r6.f109584i
            if (r0 != 0) goto L_0x016a
            boolean r0 = r6.f109596u
            java.util.List r5 = r6.f109593r
            int r5 = r5.size()
            int r5 = r5 + r0
            if (r7 == r5) goto L_0x0130
            goto L_0x016a
        L_0x0130:
            android.view.View r0 = r14.f109602b
            android.view.View r0 = r0.findViewById(r4)
            r0.setVisibility(r2)
            android.view.View r0 = r14.f109602b
            android.view.View r0 = r0.findViewById(r8)
            r0.setVisibility(r15)
            com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath r0 = new com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath
            r0.<init>()
            com.google.android.libraries.social.e.a.a r1 = new com.google.android.libraries.social.e.a.a
            com.google.android.libraries.social.a.d.d r2 = com.google.p4140ba.p4150c.p4151a.C54941a.f144456S
            r1.<init>(r2)
            com.google.android.libraries.social.a.d.b r2 = r0.f109973a
            r2.mo44369a(r1)
            com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath r1 = r14.f109609i
            com.google.android.libraries.social.a.d.b r1 = r1.f109973a
            r0.mo44564a(r1)
            com.google.android.libraries.social.peoplekit.common.analytics.e r1 = r14.f109607g
            r1.mo44577c(r10, r0)
            android.view.View r0 = r14.f109602b
            com.google.android.libraries.social.peoplekit.a.a.at r1 = new com.google.android.libraries.social.peoplekit.a.a.at
            r1.<init>(r14)
            r0.setOnClickListener(r1)
            return
        L_0x016a:
            java.util.List r0 = r6.f109593r
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x017c
            java.util.List r0 = r6.f109593r
            java.lang.Object r0 = r0.get(r7)
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r0 = (com.google.android.libraries.social.peoplekit.common.dataservice.Channel) r0
        L_0x017a:
            r5 = r0
            goto L_0x0196
        L_0x017c:
            java.util.List r0 = r6.f109593r
            int r0 = r0.size()
            int r0 = r7 - r0
            java.util.List r2 = r6.f109594s
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x0195
            java.util.List r2 = r6.f109594s
            java.lang.Object r0 = r2.get(r0)
            com.google.android.libraries.social.peoplekit.common.dataservice.Channel r0 = (com.google.android.libraries.social.peoplekit.common.dataservice.Channel) r0
            goto L_0x017a
        L_0x0195:
            r5 = r9
        L_0x0196:
            com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer r0 = r6.f109577b
            r0.mo44669n(r5)
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r0 = r6.f109580e
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r0 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r0
            java.lang.String r2 = r0.f110234a
            java.lang.String r0 = r0.f110238e
            boolean r16 = com.google.android.libraries.social.peoplekit.common.dataservice.C42096f.m73800e(r5, r2, r0)
            boolean r0 = r5 instanceof com.google.android.libraries.social.peoplekit.common.dataservice.ManualChannel
            r4 = 1
            if (r0 != 0) goto L_0x029b
            boolean r2 = r5.mo44614F()
            if (r2 == 0) goto L_0x01b4
            goto L_0x029b
        L_0x01b4:
            android.content.Context r2 = r6.f109576a
            java.lang.String r17 = r5.mo44631l(r2)
            boolean r2 = r6.f109585j
            if (r2 == 0) goto L_0x01c5
            android.content.Context r2 = r6.f109576a
            java.lang.String r2 = com.google.android.libraries.social.peoplekit.common.dataservice.C42096f.m73804i(r5, r2)
            goto L_0x01cb
        L_0x01c5:
            android.content.Context r2 = r6.f109576a
            java.lang.String r2 = r5.mo44630k(r2)
        L_0x01cb:
            r18 = r2
            com.google.android.libraries.social.peoplekit.common.dataservice.AutocompleteMatchInfo r11 = r5.mo44625f()
            int r2 = r5.mo44622c()
            if (r2 != r4) goto L_0x01dd
            com.google.android.libraries.social.peoplekit.common.dataservice.AutocompleteMatchInfo r2 = r5.mo44624e()
            r12 = r2
            goto L_0x01de
        L_0x01dd:
            r12 = r9
        L_0x01de:
            r8 = r14
            r9 = r17
            r10 = r18
            r2 = 2131434426(0x7f0b1bba, float:1.8490666E38)
            r13 = r5
            r8.mo44442a(r9, r10, r11, r12, r13)
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r8 = r6.f109580e
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r8 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r8
            boolean r8 = r8.f110253t
            if (r8 == 0) goto L_0x0208
            boolean r8 = r5.mo44611C()
            if (r8 == 0) goto L_0x0208
            int r8 = r6.f109592q
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.d r9 = r14.f109603c
            android.content.Context r10 = r14.f109601a
            r11 = 2131102044(0x7f06095c, float:1.7816515E38)
            int r10 = androidx.core.content.C1878d.m5128a(r10, r11)
            r9.mo44513i(r8, r10)
        L_0x0208:
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.d r8 = r14.f109603c
            r8.mo44509e(r5)
            boolean r8 = com.google.android.libraries.social.peoplekit.common.p3283e.C42131a.m73927j()
            if (r8 == 0) goto L_0x024c
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r8 = r6.f109580e
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r8 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r8
            boolean r8 = r8.f110255v
            if (r8 == 0) goto L_0x024c
            boolean r8 = r6.f109584i
            if (r8 == 0) goto L_0x024c
            java.util.List r8 = r6.f109593r
            int r8 = r8.size()
            if (r7 != r8) goto L_0x024c
            android.content.Context r8 = r6.f109576a
            r9 = 2132091018(0x7f15208a, float:1.9822392E38)
            java.lang.String r8 = r8.getString(r9)
            android.view.View r9 = r14.f109602b
            android.view.View r1 = r9.findViewById(r1)
            r1.setVisibility(r15)
            android.view.View r3 = r1.findViewById(r3)
            r3.setVisibility(r15)
            r3 = 2131434397(0x7f0b1b9d, float:1.8490607E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r8)
        L_0x024c:
            boolean r1 = com.google.android.libraries.social.peoplekit.common.p3283e.C42131a.m73927j()
            if (r1 == 0) goto L_0x0299
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r1 = r6.f109580e
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r1 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r1
            boolean r1 = r1.f110255v
            if (r1 == 0) goto L_0x0299
            if (r16 != 0) goto L_0x0299
            java.util.List r0 = r6.f109593r
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x0294
            int r0 = r5.mo44621b()
            if (r0 == 0) goto L_0x0294
            java.lang.String r0 = r5.mo44627h()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0294
            android.view.View r8 = r14.f109602b
            com.google.android.libraries.social.peoplekit.a.a.al r9 = new com.google.android.libraries.social.peoplekit.a.a.al
            r0 = r9
            r1 = r19
            r13 = 2131434426(0x7f0b1bba, float:1.8490666E38)
            r2 = r14
            r3 = r5
            r12 = 1
            r4 = r18
            r11 = r5
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r8.setOnLongClickListener(r9)
            r3 = r11
            r0 = 0
            r1 = 1
            r2 = 2131434426(0x7f0b1bba, float:1.8490666E38)
            goto L_0x02ff
        L_0x0294:
            r3 = r5
            r0 = 0
        L_0x0296:
            r1 = 1
            goto L_0x02ff
        L_0x0299:
            r3 = r5
            goto L_0x0296
        L_0x029b:
            r11 = r5
            r12 = 1
            android.content.Context r1 = r6.f109576a
            r2 = 2131103564(0x7f060f4c, float:1.7819598E38)
            int r1 = androidx.core.content.C1878d.m5128a(r1, r2)
            com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.d r2 = r14.f109603c
            r2.mo44506b(r1, r15)
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r1 = r6.f109580e
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r1 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r1
            boolean r1 = r1.f110252s
            if (r1 != 0) goto L_0x02cb
            if (r16 == 0) goto L_0x02cb
            r9 = 0
            android.content.Context r1 = r6.f109576a
            java.lang.String r10 = r11.mo44630k(r1)
            r1 = 0
            r2 = 0
            r8 = r14
            r3 = r11
            r11 = r1
            r1 = 1
            r12 = r2
            r2 = 2131434426(0x7f0b1bba, float:1.8490666E38)
            r13 = r3
            r8.mo44442a(r9, r10, r11, r12, r13)
            goto L_0x02ff
        L_0x02cb:
            r3 = r11
            r1 = 1
            r2 = 2131434426(0x7f0b1bba, float:1.8490666E38)
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 == 0) goto L_0x02f1
            android.content.Context r4 = r6.f109576a
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2132091016(0x7f152088, float:1.9822388E38)
            java.lang.String r9 = r4.getString(r5)
            android.content.Context r4 = r6.f109576a
            java.lang.String r10 = r3.mo44630k(r4)
            r11 = 0
            r12 = 0
            r8 = r14
            r13 = r3
            r8.mo44442a(r9, r10, r11, r12, r13)
            goto L_0x02ff
        L_0x02f1:
            r9 = 0
            android.content.Context r4 = r6.f109576a
            java.lang.String r10 = r3.mo44630k(r4)
            r11 = 0
            r12 = 0
            r8 = r14
            r13 = r3
            r8.mo44442a(r9, r10, r11, r12, r13)
        L_0x02ff:
            if (r16 == 0) goto L_0x0311
            android.content.Context r4 = r6.f109576a
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2132091022(0x7f15208e, float:1.98224E38)
            java.lang.String r4 = r4.getString(r5)
            r14.mo44444c(r4)
        L_0x0311:
            boolean r4 = com.google.android.libraries.social.peoplekit.common.p3283e.C42131a.m73927j()
            if (r4 == 0) goto L_0x0354
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r4 = r6.f109580e
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r4 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r4
            boolean r4 = r4.f110255v
            if (r4 == 0) goto L_0x0354
            if (r0 != 0) goto L_0x0354
            java.util.List r0 = r6.f109593r
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x032a
            goto L_0x0354
        L_0x032a:
            android.content.Context r0 = r6.f109576a
            java.lang.String r0 = r3.mo44631l(r0)
            android.view.View r4 = r14.f109602b
            android.view.View r2 = r4.findViewById(r2)
            r2.setVisibility(r15)
            android.content.Context r4 = r6.f109576a
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r15] = r0
            r0 = 2132091041(0x7f1520a1, float:1.982244E38)
            java.lang.String r0 = r4.getString(r0, r1)
            r2.setContentDescription(r0)
            android.view.View r0 = r14.f109602b
            com.google.android.libraries.social.peoplekit.a.a.am r1 = new com.google.android.libraries.social.peoplekit.a.a.am
            r1.<init>(r6, r3)
            r0.setOnClickListener(r1)
            return
        L_0x0354:
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig r0 = r6.f109580e
            com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl r0 = (com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl) r0
            boolean r0 = r0.f110252s
            if (r0 != 0) goto L_0x0390
            if (r16 == 0) goto L_0x0390
            r14.mo44443b(r1)
            android.view.View r0 = r14.f109602b
            r0.setClickable(r15)
            boolean r0 = r6.f109597v
            if (r0 == 0) goto L_0x0385
            android.view.View r0 = r14.f109602b
            androidx.core.j.c r1 = new androidx.core.j.c
            android.view.View$AccessibilityDelegate r2 = androidx.core.p098j.C2061c.DEFAULT_DELEGATE
            r1.<init>(r2)
            androidx.core.p098j.C2043bi.m5526T(r0, r1)
            android.content.Context r0 = r6.f109576a
            r1 = 2132091020(0x7f15208c, float:1.9822396E38)
            java.lang.String r0 = r0.getString(r1)
            android.widget.TextView r1 = r14.f109606f
            r1.setContentDescription(r0)
            return
        L_0x0385:
            android.view.View r0 = r14.f109602b
            com.google.android.libraries.social.peoplekit.a.a.ah r1 = new com.google.android.libraries.social.peoplekit.a.a.ah
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            return
        L_0x0390:
            com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel r0 = r6.f109578c
            boolean r0 = r0.mo44751g(r3)
            if (r0 == 0) goto L_0x03da
            android.content.Context r0 = r6.f109576a
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2132090991(0x7f15206f, float:1.9822338E38)
            java.lang.String r0 = r0.getString(r2)
            r14.mo44444c(r0)
            r14.mo44443b(r1)
            android.view.View r0 = r14.f109602b
            r0.setClickable(r15)
            boolean r0 = r6.f109597v
            if (r0 == 0) goto L_0x03cf
            android.view.View r0 = r14.f109602b
            androidx.core.j.c r1 = new androidx.core.j.c
            android.view.View$AccessibilityDelegate r2 = androidx.core.p098j.C2061c.DEFAULT_DELEGATE
            r1.<init>(r2)
            androidx.core.p098j.C2043bi.m5526T(r0, r1)
            android.content.Context r0 = r6.f109576a
            r1 = 2132091017(0x7f152089, float:1.982239E38)
            java.lang.String r0 = r0.getString(r1)
            android.widget.TextView r1 = r14.f109606f
            r1.setContentDescription(r0)
            return
        L_0x03cf:
            android.view.View r0 = r14.f109602b
            com.google.android.libraries.social.peoplekit.a.a.ai r1 = new com.google.android.libraries.social.peoplekit.a.a.ai
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            return
        L_0x03da:
            android.view.View r0 = r14.f109602b
            com.google.android.libraries.social.peoplekit.a.a.aj r1 = new com.google.android.libraries.social.peoplekit.a.a.aj
            r1.<init>(r6, r3, r14)
            r0.setOnClickListener(r1)
            boolean r0 = r6.f109597v
            if (r0 == 0) goto L_0x03f2
            android.view.View r0 = r14.f109602b
            com.google.android.libraries.social.peoplekit.a.a.ak r1 = new com.google.android.libraries.social.peoplekit.a.a.ak
            r1.<init>(r6)
            androidx.core.p098j.C2043bi.m5526T(r0, r1)
        L_0x03f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.peoplekit.p3273a.p3274a.C41979ar.onBindViewHolder(android.support.v7.widget.gh, int):void");
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (C42131a.m73927j() && ((PeopleKitConfigImpl) this.f109580e).f110255v) {
            this.f109591p = viewGroup;
        }
        return new C41978aq(new C41982au(this.f109576a, viewGroup, new C41968ag(this), this.f109579d, this.f109595t, this.f109582g, this.f109580e, this.f109586k, this.f109578c));
    }
}
