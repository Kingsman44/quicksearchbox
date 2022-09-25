package com.google.android.apps.search.webglide.defaultviewer;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.C2590aq;
import androidx.media3.exoplayer.p145h.C3087by;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.p299c.p300a.C5837ap;
import com.bumptech.glide.load.p299c.p300a.C5860i;
import com.google.android.apps.search.webglide.p10698a.C142169h;
import com.google.android.apps.search.webglide.p10699b.C142174e;
import com.google.android.apps.search.webglide.p10699b.C142176g;
import com.google.android.apps.search.webglide.p10699b.C142185p;
import com.google.android.apps.search.webglide.p10700c.C142198d;
import com.google.android.apps.search.webglide.p10700c.C142199e;
import com.google.android.apps.search.webglide.p10702e.C142222e;
import com.google.android.apps.search.webglide.p10704f.C142225c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.androidx.p3699d.C47627i;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.search.webglide.defaultviewer.j */
/* compiled from: PG */
public final class C142211j {

    /* renamed from: a */
    public static final C59071e f385794a = C59071e.m91332i("com.google.android.apps.search.webglide.defaultviewer.j");

    /* renamed from: b */
    public final Activity f385795b;

    /* renamed from: c */
    public final C47627i f385796c;

    /* renamed from: d */
    public final WebGlideDefaultFragment f385797d;

    /* renamed from: e */
    public final C142174e f385798e;

    /* renamed from: f */
    public final C47449e f385799f;

    /* renamed from: g */
    public final Context f385800g;

    /* renamed from: h */
    public final C142198d f385801h;

    /* renamed from: i */
    public final C142215n f385802i;

    /* renamed from: j */
    public final C47770dh f385803j;

    /* renamed from: k */
    public final C28306ab f385804k;

    /* renamed from: l */
    public final C28443m f385805l;

    /* renamed from: m */
    public final C142222e f385806m;

    /* renamed from: n */
    public final C142169h f385807n;

    /* renamed from: o */
    public final C46855i f385808o;

    /* renamed from: p */
    public final C39141kp f385809p;

    /* renamed from: q */
    public C142225c f385810q;

    /* renamed from: r */
    public final C142176g f385811r;

    /* renamed from: s */
    public Resources f385812s;

    public C142211j(Activity activity, C47627i iVar, C142174e eVar, WebGlideDefaultFragment webGlideDefaultFragment, C47449e eVar2, Context context, C142199e eVar3, C47770dh dhVar, C28306ab abVar, C28443m mVar, C142215n nVar, C142222e eVar4, C142169h hVar, C46855i iVar2, C39141kp kpVar, C142176g gVar) {
        this.f385795b = activity;
        this.f385796c = iVar;
        this.f385798e = eVar;
        this.f385797d = webGlideDefaultFragment;
        this.f385799f = eVar2;
        this.f385800g = context;
        Context context2 = (Context) eVar3.f385770a.mo17428b();
        context2.getClass();
        this.f385801h = new C142198d(context2);
        this.f385802i = nVar;
        this.f385803j = dhVar;
        this.f385804k = abVar;
        this.f385805l = mVar;
        this.f385806m = eVar4;
        this.f385807n = hVar;
        this.f385808o = iVar2;
        this.f385809p = kpVar;
        this.f385811r = gVar;
        this.f385812s = context.getResources();
    }

    /* renamed from: a */
    public static void m230865a(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b */
    public static void m230866b(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: e */
    private final void m230867e(View view, TextureView textureView, C142185p pVar) {
        String str;
        C3087by byVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.webglide_bottom_navigation_image_next_thumbnail);
        TextView textView = (TextView) view.findViewById(R.id.webglide_bottom_navigation_next_title);
        String str2 = pVar.f385731g;
        String str3 = pVar.f385729e;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            str = this.f385812s.getString(R.string.webglide_next_with_extras, new Object[]{str2, str3});
        } else if (!TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2)) {
            str = this.f385812s.getString(R.string.webglide_next_with_title, new Object[]{str3});
        } else if (!TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            str = this.f385812s.getString(R.string.webglide_next);
        } else {
            str = this.f385812s.getString(R.string.webglide_next_with_publisher, new Object[]{str2});
        }
        SpannableString spannableString = new SpannableString(Html.fromHtml(str.replace("\n", "<br/>")));
        spannableString.setSpan(new StyleSpan(1), 0, this.f385812s.getString(R.string.webglide_next).length(), 33);
        if (!TextUtils.isEmpty(str2)) {
            spannableString.setSpan(new TypefaceSpan("sans-serif-light"), this.f385812s.getString(R.string.webglide_next).length(), str.indexOf("·"), 33);
        }
        textView.setText(spannableString);
        boolean z = this.f385811r.f385692a;
        int i = this.f385800g.getResources().getConfiguration().orientation;
        if (z && (pVar.f385725a & 16) != 0 && i == 1) {
            C142198d dVar = this.f385801h;
            String str4 = pVar.f385730f;
            dVar.mo117050a();
            C2590aq b = C2590aq.m6795b(str4);
            if (str4.startsWith("rawresource")) {
                byVar = dVar.f385768c.mo6760b(b);
            } else {
                byVar = dVar.f385767b.mo6760b(b);
            }
            dVar.f385766a.mo5974B(true);
            dVar.f385766a.mo5973A(0, 0);
            dVar.f385766a.mo6467Z(byVar);
            dVar.f385766a.mo6017x();
            textureView.setVisibility(0);
            imageView.setVisibility(8);
        } else if ((pVar.f385725a & 4) != 0) {
            imageView.setVisibility(0);
            textureView.setVisibility(8);
            this.f385801h.mo117051b();
            C47449e eVar = this.f385799f;
            ((C6007z) ((C6007z) ((C6007z) eVar.mo51286a().mo11873k(pVar.f385728d).mo11970W(new C5860i(), new C5837ap(10))).mo11952E(R.drawable.webglide_ic_error_publisher_thumbnail)).mo11968U(1000)).mo12454r(imageView);
        } else {
            imageView.setVisibility(8);
            textureView.setVisibility(8);
            this.f385801h.mo117051b();
        }
    }

    /* renamed from: f */
    private final void m230868f(boolean z) {
        View view = this.f385797d.getView();
        if (view != null) {
            view.findViewById(R.id.webglide_divider_bw_next_and_previous_btn).setVisibility(true != z ? 8 : 0);
        }
    }

    /* renamed from: c */
    public final void mo117059c(int i, View view) {
        View findViewById = view.findViewById(R.id.webglide_bottom_navigation_previous);
        View findViewById2 = view.findViewById(R.id.webglide_bottom_navigation_next);
        View findViewById3 = view.findViewById(R.id.webglide_bottom_navigation_previous_last_index);
        TextureView textureView = (TextureView) view.findViewById(R.id.webglide_video_preview);
        C62971cq cqVar = C142174e.m230796b(this.f385795b.getIntent(), this.f385798e.f385686a).f385678b;
        if (cqVar.size() == 1) {
            findViewById2.setEnabled(false);
            findViewById.setEnabled(false);
            findViewById.findViewById(R.id.webglide_bottom_navigation_previous_text).setEnabled(false);
            findViewById2.findViewById(R.id.webglide_bottom_navigation_next_title).setEnabled(false);
            findViewById2.setVisibility(0);
            findViewById.setVisibility(0);
            findViewById3.setVisibility(8);
        } else if (i == 0) {
            findViewById2.setEnabled(true);
            findViewById2.findViewById(R.id.webglide_bottom_navigation_next_title).setEnabled(true);
            findViewById.setEnabled(false);
            findViewById.findViewById(R.id.webglide_bottom_navigation_previous_text).setEnabled(false);
            findViewById2.setVisibility(0);
            findViewById.setVisibility(0);
            findViewById3.setVisibility(8);
            m230867e(findViewById2, textureView, (C142185p) cqVar.get(1));
            m230868f(true);
        } else if (i == cqVar.size() - 1) {
            findViewById2.setVisibility(8);
            findViewById.setVisibility(8);
            findViewById3.setVisibility(0);
            mo117060d(false);
            m230868f(false);
        } else {
            findViewById2.setEnabled(true);
            findViewById.setEnabled(true);
            findViewById2.setVisibility(0);
            findViewById.setVisibility(0);
            findViewById.findViewById(R.id.webglide_bottom_navigation_previous_text).setEnabled(true);
            findViewById2.findViewById(R.id.webglide_bottom_navigation_next_title).setEnabled(true);
            findViewById3.setVisibility(8);
            m230867e(findViewById2, textureView, (C142185p) cqVar.get(i + 1));
            m230868f(true);
        }
    }

    /* renamed from: d */
    public final void mo117060d(boolean z) {
        View view = this.f385797d.getView();
        if (view != null) {
            view.findViewById(R.id.webglide_video_preview_container).setVisibility(true != z ? 8 : 0);
        }
    }
}
