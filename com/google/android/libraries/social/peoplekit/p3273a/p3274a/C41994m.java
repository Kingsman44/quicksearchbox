package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.content.Context;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.C41960a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42092b;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42094d;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42102l;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3280b.C42081a;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42089b;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.common.p4522b.C58557jl;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p5602o.p5607c.p5608a.p5609a.C71909h;
import p5602o.p5607c.p5608a.p5609a.C71910i;
import p5602o.p5607c.p5608a.p5609a.C71912k;
import p5602o.p5607c.p5608a.p5609a.C71913l;
import p5602o.p5607c.p5608a.p5609a.C71919r;
import p5602o.p5607c.p5608a.p5609a.C71920s;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.m */
/* compiled from: PG */
public final class C41994m implements C42102l {

    /* renamed from: a */
    public final RecyclerView f109650a;

    /* renamed from: b */
    public final C41979ar f109651b;

    /* renamed from: c */
    public final C42075e f109652c;

    /* renamed from: d */
    public final C41960a f109653d;

    /* renamed from: e */
    public EditText f109654e;

    /* renamed from: f */
    public String f109655f;

    /* renamed from: g */
    private final Context f109656g;

    /* renamed from: h */
    private final PeopleKitSelectionModel f109657h;

    /* renamed from: i */
    private final PeopleKitDataLayer f109658i;

    /* renamed from: j */
    private final PeopleKitConfig f109659j;

    /* renamed from: k */
    private final List f109660k = new ArrayList();

    /* renamed from: l */
    private final PeopleKitVisualElementPath f109661l;

    /* renamed from: m */
    private Channel f109662m;

    public C41994m(Context context, ExecutorService executorService, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, C42075e eVar, PeopleKitConfig peopleKitConfig, C41960a aVar, PeopleKitVisualElementPath peopleKitVisualElementPath, C42089b bVar, C42141b bVar2, C42081a aVar2) {
        Context context2 = context;
        C42075e eVar2 = eVar;
        C42089b bVar3 = bVar;
        this.f109656g = context2;
        this.f109658i = peopleKitDataLayer;
        this.f109652c = eVar2;
        this.f109657h = peopleKitSelectionModel;
        PeopleKitConfig peopleKitConfig2 = peopleKitConfig;
        this.f109659j = peopleKitConfig2;
        C41960a aVar3 = aVar;
        this.f109653d = aVar3;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144466g));
        peopleKitVisualElementPath2.mo44564a(peopleKitVisualElementPath.f109973a);
        this.f109661l = peopleKitVisualElementPath2;
        eVar2.mo44577c(-1, peopleKitVisualElementPath2);
        RecyclerView recyclerView = new RecyclerView(context2);
        this.f109650a = recyclerView;
        recyclerView.getScrollingChildHelper().mo5279a(false);
        recyclerView.setLayoutParams(new C0654fp(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(context2));
        C41979ar arVar = r1;
        RecyclerView recyclerView2 = recyclerView;
        C41979ar arVar2 = new C41979ar(context, executorService, peopleKitDataLayer, peopleKitSelectionModel, eVar2, peopleKitConfig2, aVar3, peopleKitVisualElementPath2, bVar, bVar2, aVar2);
        this.f109651b = arVar;
        recyclerView2.setAdapter(arVar);
        C2043bi.m5526T(recyclerView2, new C41987f(this));
        recyclerView2.setLayoutManager(new C41988g(context2));
        PeopleKitDataLayer peopleKitDataLayer2 = peopleKitDataLayer;
        C42089b bVar4 = bVar;
        bVar4.mo44599a(new C41989h(this, peopleKitDataLayer2, bVar4));
        peopleKitSelectionModel.mo44747d(new C41990i(this));
        peopleKitDataLayer2.mo44662g(this);
    }

    /* renamed from: h */
    private final void m73526h() {
        Context context = this.f109656g;
        String str = null;
        if (TextUtils.isEmpty((CharSequence) null)) {
            if (((PeopleKitConfigImpl) this.f109659j).f110248o) {
                str = this.f109656g.getString(R.string.peoplekit_invalid_input);
            } else {
                str = this.f109656g.getString(R.string.peoplekit_listview_invalid_input_no_phone_number);
            }
        }
        Toast.makeText(context, str, 0).show();
        C42075e eVar = this.f109652c;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144439B));
        peopleKitVisualElementPath.mo44564a(this.f109661l.f109973a);
        eVar.mo44577c(-1, peopleKitVisualElementPath);
    }

    /* renamed from: a */
    public final boolean mo44460a() {
        return ((PeopleKitConfigImpl) this.f109659j).f110251r && this.f109660k.size() == 1;
    }

    /* renamed from: b */
    public final void mo44461b() {
        if (!((PeopleKitConfigImpl) this.f109659j).f110251r && this.f109660k.isEmpty()) {
            m73526h();
        }
        PeopleKitConfigImpl peopleKitConfigImpl = (PeopleKitConfigImpl) this.f109659j;
        if (!peopleKitConfigImpl.f110252s && C42096f.m73800e(this.f109662m, peopleKitConfigImpl.f110234a, peopleKitConfigImpl.f110238e)) {
            Context context = this.f109656g;
            Toast.makeText(context, context.getString(R.string.peoplekit_listview_no_self_select), 0).show();
        } else if (!mo44460a() || (this.f109662m.mo44621b() != 0 && (((PeopleKitConfigImpl) this.f109659j).f110248o || this.f109662m.mo44621b() != 2))) {
            if (!this.f109660k.isEmpty()) {
                Channel channel = (Channel) this.f109660k.get(0);
                if (this.f109657h.mo44751g(channel)) {
                    Context context2 = this.f109656g;
                    Toast.makeText(context2, context2.getResources().getString(R.string.peoplekit_listview_already_selected), 0).show();
                } else {
                    mo44464f(channel, false);
                    C42075e eVar = this.f109652c;
                    PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                    peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144441D));
                    peopleKitVisualElementPath.mo44564a(this.f109661l.f109973a);
                    eVar.mo44577c(4, peopleKitVisualElementPath);
                }
            }
            if (!((PeopleKitConfigImpl) this.f109659j).f110251r) {
                this.f109660k.isEmpty();
            }
        } else {
            m73526h();
        }
    }

    /* renamed from: c */
    public final void mo44462c(CharSequence charSequence, EditText editText) {
        this.f109660k.clear();
        if (TextUtils.isEmpty(charSequence)) {
            this.f109651b.mo44438b((List) null);
            return;
        }
        Stopwatch a = this.f109652c.mo44575a("ACQueryToRender");
        a.mo44570b();
        a.mo44571c();
        this.f109662m = this.f109658i.mo44658c(charSequence.toString(), this.f109656g);
        if (((PeopleKitConfigImpl) this.f109659j).f110251r) {
            this.f109660k.add(this.f109662m);
        }
        this.f109654e = editText;
        this.f109658i.mo44663h(charSequence.toString());
    }

    /* renamed from: d */
    public final void mo44453d(List list, C42094d dVar) {
        if (!this.f109660k.isEmpty() && ((PeopleKitConfigImpl) this.f109659j).f110251r && C58557jl.m90131l(this.f109660k) == this.f109662m) {
            List list2 = this.f109660k;
            list2.remove(list2.size() - 1);
        }
        this.f109660k.addAll(list);
        if (((PeopleKitConfigImpl) this.f109659j).f110251r) {
            boolean z = true;
            for (Channel channel : this.f109660k) {
                if (this.f109662m != null && (C42092b.m73792d(channel.mo44627h(), this.f109662m.mo44627h()) || C42092b.m73793e(channel.mo44627h(), this.f109662m.mo44627h(), this.f109656g))) {
                    z = false;
                }
            }
            if (z) {
                this.f109660k.add(this.f109662m);
            }
        }
        EditText editText = this.f109654e;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            this.f109651b.mo44438b(this.f109660k);
            C42075e eVar = this.f109652c;
            C71912k kVar = (C71912k) C71913l.f191523f.createBuilder();
            kVar.copyOnWrite();
            C71913l lVar = (C71913l) kVar.instance;
            lVar.f191526b = 3;
            lVar.f191525a |= 1;
            C71909h hVar = (C71909h) C71910i.f191517d.createBuilder();
            hVar.copyOnWrite();
            C71910i iVar = (C71910i) hVar.instance;
            iVar.f191520b = 2;
            iVar.f191519a |= 1;
            int i = dVar.f110053d;
            hVar.copyOnWrite();
            C71910i iVar2 = (C71910i) hVar.instance;
            iVar2.f191519a |= 2;
            iVar2.f191521c = (long) i;
            kVar.copyOnWrite();
            C71913l lVar2 = (C71913l) kVar.instance;
            C71910i iVar3 = (C71910i) hVar.build();
            iVar3.getClass();
            lVar2.f191528d = iVar3;
            lVar2.f191525a |= 4;
            C71919r rVar = (C71919r) C71920s.f191539e.createBuilder();
            int f = this.f109652c.mo44580f();
            rVar.copyOnWrite();
            C71920s sVar = (C71920s) rVar.instance;
            int i2 = f - 1;
            if (f != 0) {
                sVar.f191542b = i2;
                sVar.f191541a = 1 | sVar.f191541a;
                rVar.copyOnWrite();
                C71920s sVar2 = (C71920s) rVar.instance;
                sVar2.f191543c = 2;
                sVar2.f191541a |= 2;
                int i3 = dVar.f110050a;
                rVar.copyOnWrite();
                C71920s sVar3 = (C71920s) rVar.instance;
                sVar3.f191541a |= 4;
                sVar3.f191544d = i3;
                kVar.copyOnWrite();
                C71913l lVar3 = (C71913l) kVar.instance;
                C71920s sVar4 = (C71920s) rVar.build();
                sVar4.getClass();
                lVar3.f191527c = sVar4;
                lVar3.f191525a |= 2;
                eVar.mo44576b((C71913l) kVar.build());
                Stopwatch stopwatch = new Stopwatch();
                stopwatch.mo44571c();
                this.f109650a.post(new C41993l(this, stopwatch, dVar));
                return;
            }
            throw null;
        }
    }

    /* renamed from: e */
    public final void mo44463e(Channel channel) {
        if (this.f109657h.mo44751g(channel) || !C42131a.m73926i()) {
            this.f109653d.mo44409a(channel.mo44626g(this.f109656g));
        }
    }

    /* renamed from: f */
    public final void mo44464f(Channel channel, boolean z) {
        this.f109657h.mo44752h(channel, (CoalescedChannels) null);
        if (((PeopleKitConfigImpl) this.f109659j).f110244k) {
            this.f109658i.mo44666k(channel, new C41992k(this, channel));
        } else {
            mo44463e(channel);
        }
    }

    /* renamed from: g */
    public final void mo44456g(List list, C42094d dVar) {
    }

    /* renamed from: s */
    public final void mo44457s(List list) {
    }
}
