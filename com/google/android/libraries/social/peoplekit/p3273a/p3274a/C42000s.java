package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.C0678gm;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.bumptech.glide.p287f.C5593j;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.C41960a;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42024a;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42027d;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.C42031h;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.GroupAvatarView;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42089b;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.s */
/* compiled from: PG */
public final class C42000s extends C0640fb {

    /* renamed from: a */
    public final Context f109666a;

    /* renamed from: b */
    public final List f109667b = new ArrayList();

    /* renamed from: c */
    public final C42075e f109668c;

    /* renamed from: d */
    public final PeopleKitConfig f109669d;

    /* renamed from: e */
    public final PeopleKitVisualElementPath f109670e;

    /* renamed from: f */
    public C41960a f109671f;

    /* renamed from: g */
    public List f109672g;

    /* renamed from: h */
    public List f109673h;

    /* renamed from: i */
    public boolean f109674i = false;

    /* renamed from: j */
    public boolean f109675j;

    /* renamed from: k */
    public C42141b f109676k;

    /* renamed from: l */
    private final ExecutorService f109677l;

    /* renamed from: m */
    private final PeopleKitDataLayer f109678m;

    /* renamed from: n */
    private final PeopleKitSelectionModel f109679n;

    /* renamed from: o */
    private final C42089b f109680o;

    /* renamed from: p */
    private final int f109681p;

    /* renamed from: q */
    private boolean f109682q;

    public C42000s(Context context, ExecutorService executorService, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, C42089b bVar, C42075e eVar, PeopleKitConfig peopleKitConfig, PeopleKitVisualElementPath peopleKitVisualElementPath, C42141b bVar2) {
        this.f109666a = context;
        this.f109677l = executorService;
        this.f109678m = peopleKitDataLayer;
        this.f109679n = peopleKitSelectionModel;
        this.f109680o = bVar;
        this.f109668c = eVar;
        this.f109669d = peopleKitConfig;
        this.f109670e = peopleKitVisualElementPath;
        this.f109681p = ((PeopleKitConfigImpl) peopleKitConfig).f110240g;
        C42087a.m73675a(bVar2);
        this.f109676k = bVar2;
        this.f109672g = new ArrayList();
        this.f109673h = new ArrayList();
        this.f109682q = bVar.mo44602e();
        peopleKitSelectionModel.mo44747d(new C41995n());
    }

    /* renamed from: b */
    private final void m73538b(C41967af afVar, String str, boolean z) {
        View c = m73539c(afVar);
        c.findViewById(R.id.peoplekit_listview_main_header_wrapper).setVisibility(0);
        ((TextView) c.findViewById(R.id.peoplekit_listview_main_header)).setText(str);
        View findViewById = c.findViewById(R.id.peoplekit_listview_header_info);
        if (z) {
            findViewById.setOnClickListener(new C41997p(this));
            findViewById.setVisibility(0);
            return;
        }
        findViewById.setVisibility(8);
    }

    /* renamed from: c */
    private static final View m73539c(C41967af afVar) {
        View findViewById = afVar.f109530b.findViewById(R.id.peoplekit_listview_header);
        findViewById.setVisibility(0);
        return findViewById;
    }

    /* renamed from: d */
    private static final void m73540d(C41967af afVar, String str) {
        TextView textView = (TextView) m73539c(afVar).findViewById(R.id.peoplekit_listview_header_letter);
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* renamed from: a */
    public final void mo44467a() {
        this.f109682q = false;
        this.mObservable.mo2879a();
    }

    public final int getItemCount() {
        return this.f109672g.size() + this.f109673h.size() + (this.f109682q ? 1 : 0);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        boolean z;
        CoalescedChannels coalescedChannels;
        Channel channel;
        ColorStateList colorStateList;
        int i2 = i;
        C41967af afVar = ((C41999r) ghVar).f109665a;
        afVar.f109530b.setOnClickListener((View.OnClickListener) null);
        if (C42131a.m73927j() && ((PeopleKitConfigImpl) afVar.f109538j).f110255v) {
            afVar.f109530b.setOnLongClickListener((View.OnLongClickListener) null);
        }
        afVar.f109530b.setClickable(false);
        View findViewById = afVar.f109530b.findViewById(R.id.peoplekit_listview_header);
        findViewById.setVisibility(8);
        findViewById.findViewById(R.id.peoplekit_listview_main_header_wrapper).setVisibility(8);
        findViewById.findViewById(R.id.peoplekit_listview_star).setVisibility(8);
        findViewById.findViewById(R.id.peoplekit_listview_header_letter).setVisibility(8);
        afVar.f109531c.setVisibility(0);
        afVar.f109530b.findViewById(R.id.peoplekit_listview_permissions_row).setVisibility(8);
        afVar.f109533e.setText(BuildConfig.FLAVOR);
        afVar.f109533e.setTranslationY(0.0f);
        afVar.f109533e.setTypeface(Typeface.SANS_SERIF, 0);
        afVar.f109534f.setText(BuildConfig.FLAVOR);
        afVar.f109534f.setAlpha(1.0f);
        afVar.f109534f.setVisibility(0);
        if (((PeopleKitConfigImpl) afVar.f109538j).f110258y && (colorStateList = afVar.f109548t) != null) {
            afVar.f109534f.setTextColor(colorStateList);
        }
        afVar.mo44426i(BuildConfig.FLAVOR);
        ImageView imageView = (ImageView) afVar.f109530b.findViewById(R.id.peoplekit_listview_chevron);
        imageView.setRotation(0.0f);
        imageView.setVisibility(8);
        if (afVar.f109546r.f110294m != 0) {
            Drawable c = C0678gm.m2375e().mo3100c(afVar.f109529a, R.drawable.quantum_gm_ic_expand_more_gm_grey_24);
            C1929b.m5225f(c.mutate(), C1878d.m5128a(afVar.f109529a, afVar.f109546r.f110294m));
            imageView.setImageDrawable(c);
        }
        afVar.f109532d.mo44507c();
        afVar.f109535g.removeAllViews();
        afVar.f109535g.setVisibility(8);
        afVar.f109530b.findViewById(R.id.peoplekit_listview_main_content).getLayoutParams().height = -2;
        afVar.f109543o = null;
        afVar.f109542n = null;
        afVar.f109545q = i2;
        afVar.f109541m = this.f109671f;
        C42141b bVar = this.f109676k;
        C42087a.m73675a(bVar);
        if (!afVar.f109546r.equals(bVar)) {
            afVar.f109546r = bVar;
            C42027d dVar = afVar.f109532d;
            if (!dVar.f109791g.equals(bVar)) {
                dVar.f109791g = bVar;
                dVar.mo44512h();
            }
            afVar.mo44428k();
        }
        if (this.f109675j) {
            afVar.f109544p = true;
        }
        if (this.f109682q) {
            if (i2 == 0) {
                afVar.f109530b.findViewById(R.id.peoplekit_listview_main_row).setVisibility(8);
                afVar.f109530b.findViewById(R.id.peoplekit_listview_permissions_row).setVisibility(0);
                PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144457T));
                peopleKitVisualElementPath.mo44564a(afVar.f109540l.f109973a);
                afVar.f109537i.mo44577c(-1, peopleKitVisualElementPath);
                afVar.f109530b.setOnClickListener(new C41964ac(afVar, peopleKitVisualElementPath));
                return;
            }
            i2--;
        }
        if (i2 < this.f109672g.size()) {
            if (i2 == 0) {
                m73538b(afVar, this.f109666a.getString(R.string.peoplekit_listview_suggestions), true);
                i2 = 0;
            }
            coalescedChannels = (CoalescedChannels) this.f109672g.get(i2);
            z = false;
        } else {
            if (i2 - this.f109672g.size() == 0) {
                m73538b(afVar, this.f109666a.getString(R.string.peoplekit_listview_phone_contacts), false);
            }
            coalescedChannels = (CoalescedChannels) this.f109673h.get(i2 - this.f109672g.size());
            z = true;
        }
        Channel channel2 = (Channel) coalescedChannels.mo44648c().get(0);
        if (((PeopleKitConfigImpl) this.f109669d).f110253t && channel2.mo44611C()) {
            afVar.f109532d.mo44513i(this.f109681p, C1878d.m5128a(afVar.f109529a, R.color.google_white));
            if (afVar.f109543o != null) {
                afVar.mo44427j();
            }
        }
        C42027d dVar2 = afVar.f109532d;
        Channel channel3 = (Channel) coalescedChannels.mo44648c().get(0);
        if (coalescedChannels.mo44646a() == 1) {
            List d = coalescedChannels.mo44649d();
            if (!TextUtils.isEmpty(channel3.mo44638s())) {
                dVar2.mo44510f(channel3.mo44638s(), channel3);
            } else {
                if (((Integer) coalescedChannels.mo44647b().mo56109e(0)).intValue() == 1 && !d.isEmpty()) {
                    channel = (Channel) d.get(0);
                } else if (!d.isEmpty()) {
                    if (d.size() == 1) {
                        channel = (Channel) d.get(0);
                    } else {
                        dVar2.f109789e = 2;
                        dVar2.mo44505a();
                        dVar2.f109786b.setVisibility(8);
                        dVar2.f109787c.setVisibility(0);
                        GroupAvatarView groupAvatarView = dVar2.f109787c;
                        C42024a aVar = new C42024a(d.size() + " channels", dVar2, (Channel) null);
                        if (d.size() > 4) {
                            groupAvatarView.f109761b = d.subList(0, 4);
                        } else {
                            groupAvatarView.f109761b = d;
                        }
                        C42031h hVar = groupAvatarView.f109760a;
                        C42028e eVar = groupAvatarView.f109766g;
                        hVar.f109813e = (C5593j) new C5593j().mo11982o((C5593j) new C5593j().mo11963P(R.color.quantum_grey300));
                        hVar.f109816h = aVar;
                        hVar.f109814f = R.drawable.peoplekit_default_avatar;
                        hVar.f109820l = eVar;
                        List list = groupAvatarView.f109761b;
                        if (list == null || list.isEmpty()) {
                            groupAvatarView.f109765f = 1;
                        } else {
                            int size = groupAvatarView.f109761b.size();
                            if (size == 1) {
                                groupAvatarView.f109765f = 2;
                            } else if (size != 2) {
                                groupAvatarView.f109765f = size != 3 ? 5 : 4;
                            } else {
                                groupAvatarView.f109765f = 3;
                            }
                        }
                        groupAvatarView.mo44502a();
                        dVar2.f109787c.f109764e = dVar2.f109791g;
                    }
                }
                dVar2.mo44509e(channel);
            }
        } else {
            dVar2.mo44509e(channel3);
        }
        if (z) {
            if (channel2.mo44613E()) {
                if (i2 - this.f109672g.size() == 0) {
                    m73539c(afVar).findViewById(R.id.peoplekit_listview_star).setVisibility(0);
                }
            } else if (i2 - this.f109672g.size() == 0) {
                m73540d(afVar, channel2.mo44633n());
            } else {
                if (!((Channel) ((CoalescedChannels) this.f109673h.get((i2 - this.f109672g.size()) - 1)).mo44648c().get(0)).mo44633n().equals(channel2.mo44633n())) {
                    m73540d(afVar, channel2.mo44633n());
                }
            }
        }
        afVar.mo44425h(coalescedChannels);
        if (this.f109667b.contains(coalescedChannels)) {
            afVar.mo44424g(coalescedChannels);
            afVar.mo44420c(true, false);
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C41999r(new C41967af(this.f109666a, this.f109677l, this.f109678m, this.f109679n, new C41996o(this), this.f109668c, this.f109669d, this.f109680o, this.f109670e, this.f109676k));
    }
}
