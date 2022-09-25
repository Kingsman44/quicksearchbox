package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.recently.entry.C116077a;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116163af;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116019b;
import com.google.android.apps.gsa.staticplugins.recently.p8679b.C116025a;
import com.google.android.apps.gsa.staticplugins.recently.p8679b.C116031g;
import com.google.android.apps.gsa.staticplugins.recently.p8679b.C116032h;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Group;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1875j.C22834e;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.u */
/* compiled from: PG */
public abstract class C116155u extends C116136b {

    /* renamed from: c */
    public static final C59071e f322083c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.u");

    /* renamed from: d */
    private final C116032h f322084d;

    /* renamed from: e */
    private final C22871g f322085e;

    /* renamed from: f */
    private int f322086f;

    /* renamed from: g */
    private int f322087g;

    public C116155u(Context context, C22871g gVar, C116032h hVar, C116163af afVar) {
        super(context, afVar);
        this.f322084d = hVar;
        this.f322085e = gVar;
    }

    /* renamed from: c */
    public final int mo102410c() {
        return R.layout.recently_normal_entry;
    }

    /* renamed from: e */
    public final void mo102412e(int i, int i2) {
        this.f322086f = i;
        this.f322087g = i2;
    }

    /* renamed from: f */
    public final void mo102413f(View view, C116019b bVar, C116226r rVar, C116214f fVar) {
        super.mo102413f(view, bVar, rVar, fVar);
        Timeline timeline = bVar.f321699a.f321706d;
        C22845p pVar = timeline.f322178a[rVar.f322281b].f322177h[fVar.f322256e];
        if (!(view.getBackground() instanceof C116077a)) {
            mo102523g(view, this.f322086f, this.f322087g);
        }
        C116077a aVar = (C116077a) view.getBackground();
        aVar.f321869a = null;
        aVar.invalidateSelf();
        TextView textView = (TextView) view.findViewById(R.id.page_title);
        String i = mo102529i(pVar);
        String string = this.f322052a.getResources().getString(R.string.no_screenshot_available);
        SpannableString spannableString = new SpannableString(i + "\n\n" + string);
        spannableString.setSpan(new AbsoluteSizeSpan(this.f322052a.getResources().getDimensionPixelSize(R.dimen.page_title_text_size)), 0, i.length(), 17);
        spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), 0, i.length(), 17);
        spannableString.setSpan(new ForegroundColorSpan(this.f322052a.getResources().getColor(R.color.agsa_color_primary_variant)), 0, i.length(), 17);
        textView.setText(spannableString);
        view.findViewById(R.id.no_screenshot_available_icon).setVisibility(8);
        textView.setVisibility((pVar.f62892a & 128) == 0 ? 0 : 4);
        if ((pVar.f62892a & 128) != 0) {
            long j = pVar.f62899h;
            Long valueOf = Long.valueOf(j);
            view.setTag(valueOf);
            C116032h hVar = this.f322084d;
            C60870cx cxVar = (C60870cx) C116025a.m192378a().f321718a.get(valueOf);
            if (cxVar == null) {
                cxVar = hVar.f321730c.mo28201a("loadScreenshot", new C116031g(hVar, j));
                C116025a.m192378a().f321718a.put(valueOf, cxVar);
            }
            new C90873ag(cxVar, this.f322085e, "setupScreenshot", new C116153s(view, j, aVar)).mo85223a(new C116154t(view, textView, j));
        } else {
            view.setTag(0);
        }
        View findViewById = view.findViewById(R.id.screenshot_container);
        Timeline timeline2 = bVar.f321699a.f321706d;
        int i2 = rVar.f322281b;
        Group[] groupArr = timeline2.f322178a;
        String str = groupArr[i2].f322171b;
        int length = groupArr.length;
        Resources resources = this.f322052a.getResources();
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getString(R.string.group_desc, new Object[]{Integer.valueOf(rVar.f322281b + 1), Integer.valueOf(length)}));
        String str2 = pVar.f62896e;
        if ((pVar.f62892a & 8) != 0 && str2.isEmpty()) {
            sb.append(resources.getString(R.string.query_desc, new Object[]{str2}));
            sb.append(". ");
        }
        sb.append(resources.getString(R.string.entry_desc, new Object[]{Integer.valueOf(fVar.f322256e + 1), Integer.valueOf(rVar.f322282c.size())}));
        sb.append(mo102528h(pVar));
        sb.append(". ");
        sb.append(str);
        sb.append(". ");
        int a = C22834e.m42692a(pVar.f62902k);
        if (a != 0 && a == 3) {
            sb.append(R.string.cached_desc);
        }
        findViewById.setContentDescription(sb.toString());
        view.findViewById(R.id.circular_loading_indicator).setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract String mo102528h(C22845p pVar);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo102529i(C22845p pVar);
}
