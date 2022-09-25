package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.p2206b.C28505a;
import com.google.android.libraries.p11002ag.C147575e;
import com.google.android.libraries.p11002ag.C147576f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32953f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33231i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33233k;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2562a.C33241c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51040ed;
import com.google.assistant.p3897e.p3902c.p3907c.C51042ef;
import com.google.assistant.p3897e.p3902c.p3907c.C51044eh;
import com.google.assistant.p3897e.p3902c.p3907c.C51045ei;
import com.google.assistant.p3897e.p3902c.p3907c.C51049em;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.acn;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58461fx;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.cq */
/* compiled from: PG */
final class C33338cq extends C0640fb {

    /* renamed from: f */
    private static final C59071e f89364f = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.cq");

    /* renamed from: a */
    public final Context f89365a;

    /* renamed from: b */
    public final Fragment f89366b;

    /* renamed from: c */
    public final C32953f f89367c;

    /* renamed from: d */
    public final C33334cm f89368d;

    /* renamed from: e */
    public List f89369e;

    /* renamed from: g */
    private final C32951d f89370g;

    /* renamed from: h */
    private final C147576f f89371h = C147576f.m240621c();

    /* renamed from: i */
    private final C21370a f89372i;

    public C33338cq(Context context, Fragment fragment, C32953f fVar, C32951d dVar, C33334cm cmVar, C21370a aVar, List list) {
        this.f89365a = context;
        this.f89366b = fragment;
        this.f89367c = fVar;
        this.f89370g = dVar;
        this.f89368d = cmVar;
        this.f89372i = aVar;
        this.f89369e = C58597ky.m90211b(list);
    }

    /* renamed from: a */
    private final Drawable m61926a(String str) {
        if (str.isEmpty()) {
            Drawable drawable = this.f89365a.getDrawable(R.drawable.product_logo_avatar_anonymous_color_48);
            drawable.getClass();
            return drawable;
        }
        try {
            this.f89371h.mo124320f(str, Locale.getDefault().getCountry());
            Drawable drawable2 = this.f89365a.getDrawable(R.drawable.product_logo_avatar_anonymous_color_48);
            drawable2.getClass();
            return drawable2;
        } catch (C147575e unused) {
            return C33241c.m61663a(this.f89365a, str, str);
        }
    }

    public final int getItemCount() {
        return this.f89369e.size();
    }

    public final int getItemViewType(int i) {
        if (((C51045ei) this.f89369e.get(i)).f132915b != 4) {
            return ((C51045ei) this.f89369e.get(i)).f132915b == 5 ? R.id.fa_message_carousel_view_type_reply : R.id.fa_message_carousel_view_type_confirmation;
        }
        return R.id.fa_message_carousel_view_type_preview;
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        C51040ed edVar;
        C51058ev evVar;
        C51058ev evVar2;
        int i2;
        String str;
        C51058ev evVar3;
        C51045ei eiVar = (C51045ei) this.f89369e.get(i);
        int i3 = eiVar.f132915b;
        if (i3 == 4) {
            C33336co coVar = (C33336co) ghVar;
            C51042ef efVar = (C51042ef) eiVar.f132916c;
            aco aco = eiVar.f132918e;
            if (aco == null) {
                aco = aco.f134821t;
            }
            ImageComponent imageComponent = coVar.f89349b;
            C51012dc dcVar = efVar.f132902a;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            imageComponent.mo38649b(dcVar, m61926a(C33231i.m61624a(aco)));
            coVar.f89350c.setText(C33231i.m61624a(aco));
            coVar.f89351d.removeAllViews();
            C62971cq<C51049em> cqVar = efVar.f132903b;
            ArrayList<View> arrayList = new ArrayList<>();
            C58461fx fxVar = new C58461fx();
            for (C51049em emVar : cqVar) {
                fxVar.mo54931lF(emVar.f132931c, 1);
            }
            if (fxVar.f155881a.mo55793b("image") > 0) {
                int b = fxVar.f155881a.mo55793b("image");
                TextView textView = (TextView) LayoutInflater.from(this.f89365a).inflate(R.layout.fa_message_preview_card_media_view, (ViewGroup) null);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.quantum_ic_crop_original_grey600_18, 0, 0, 0);
                textView.setText(this.f89365a.getResources().getQuantityString(R.plurals.fa_message_preview_card_num_of_pictures, b, new Object[]{Integer.valueOf(b)}));
                arrayList.add(textView);
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (fxVar.f155881a.mo55793b("video") > 0) {
                int b2 = fxVar.f155881a.mo55793b("video");
                TextView textView2 = (TextView) LayoutInflater.from(this.f89365a).inflate(R.layout.fa_message_preview_card_media_view, (ViewGroup) null);
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.quantum_ic_drive_video_grey600_18, 0, 0, 0);
                textView2.setText(this.f89365a.getResources().getQuantityString(R.plurals.fa_message_preview_card_num_of_videos, b2, new Object[]{Integer.valueOf(b2)}));
                arrayList.add(textView2);
                i2++;
            }
            if (fxVar.f155881a.mo55793b("audio") > 0) {
                int b3 = fxVar.f155881a.mo55793b("audio");
                TextView textView3 = (TextView) LayoutInflater.from(this.f89365a).inflate(R.layout.fa_message_preview_card_media_view, (ViewGroup) null);
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.quantum_ic_mic_grey600_18, 0, 0, 0);
                textView3.setText(this.f89365a.getResources().getQuantityString(R.plurals.fa_message_preview_card_num_of_audio_messages, b3, new Object[]{Integer.valueOf(b3)}));
                arrayList.add(textView3);
                i2++;
            }
            if (i2 > 0) {
                i2++;
            }
            String join = TextUtils.join(System.lineSeparator(), (Iterable) Collection.EL.stream(cqVar).filter(C33328cg.f89329a).map(C33329ch.f89330a).collect(C58370cn.f155946a));
            int i4 = 6 - i2;
            if (!join.isEmpty()) {
                TextView textView4 = (TextView) LayoutInflater.from(this.f89365a).inflate(R.layout.fa_message_preview_card_text_view, (ViewGroup) null);
                textView4.setText(join);
                textView4.setMaxLines(i4);
                arrayList.add(0, textView4);
            }
            for (View addView : arrayList) {
                coVar.f89351d.addView(addView);
            }
            if (C33231i.m61625b(aco)) {
                coVar.f89352e.setVisibility(0);
                TextView textView5 = coVar.f89352e;
                acn acn = aco.f134826d;
                if (acn == null) {
                    acn = acn.f134817c;
                }
                textView5.setText(acn.f134820b);
                coVar.f89353f.setVisibility(0);
                coVar.f89353f.setText("  •  ");
            }
            TextView textView6 = coVar.f89354g;
            Context context = this.f89365a;
            C21370a aVar = this.f89372i;
            long j = aco.f134829g;
            if (C33233k.m61638d(aVar, j)) {
                str = DateUtils.formatDateTime(context, j, 1);
            } else {
                str = DateUtils.formatDateTime(context, j, 98327);
            }
            textView6.setText(str);
            try {
                C51098gh ghVar2 = eiVar.f132919f;
                if (ghVar2 == null) {
                    ghVar2 = C51098gh.f133009e;
                }
                if (ghVar2.f133012b == 1) {
                    evVar3 = (C51058ev) ghVar2.f133013c;
                } else {
                    evVar3 = C51058ev.f132941o;
                }
                coVar.f89355h.setImageDrawable(this.f89365a.getPackageManager().getApplicationIcon(evVar3.f132944b));
                coVar.f89355h.setOnClickListener(new C33325cd(this, eiVar));
                coVar.f89355h.setVisibility(0);
            } catch (PackageManager.NameNotFoundException e) {
                C59104x d = f89364f.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TngMsgCarouselAdapter");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(51112)).mo56386p("#bindPreviewCard: Failed to render provider button");
                coVar.f89355h.setVisibility(8);
            }
            coVar.f89348a.setClickable(true);
            coVar.f89348a.setOnClickListener(new C33326ce(this, eiVar));
            if (aco.f134833k) {
                coVar.f89356i.setVisibility(0);
                coVar.f89356i.setEnabled(true);
                coVar.f89356i.setOnClickListener(new C33327cf(this, coVar, eiVar));
                return;
            }
            coVar.f89356i.setVisibility(8);
        } else if (i3 == 5) {
            C33337cp cpVar = (C33337cp) ghVar;
            cpVar.f89363g = false;
            C51044eh ehVar = (C51044eh) eiVar.f132916c;
            aco aco2 = eiVar.f132918e;
            if (aco2 == null) {
                aco2 = aco.f134821t;
            }
            aco aco3 = aco2;
            ImageComponent imageComponent2 = cpVar.f89357a;
            C51012dc dcVar2 = ehVar.f132909b;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            imageComponent2.mo38649b(dcVar2, m61926a(C33231i.m61624a(aco3)));
            cpVar.f89358b.setText(C33231i.m61624a(aco3));
            cpVar.f89359c.setEnabled(true);
            cpVar.f89359c.setText(ehVar.f132910c);
            cpVar.f89359c.addTextChangedListener(new C33333cl(this, cpVar));
            try {
                C51098gh ghVar3 = eiVar.f132919f;
                if (ghVar3 == null) {
                    ghVar3 = C51098gh.f133009e;
                }
                if (ghVar3.f133012b == 1) {
                    evVar2 = (C51058ev) ghVar3.f133013c;
                } else {
                    evVar2 = C51058ev.f132941o;
                }
                cpVar.f89360d.setImageDrawable(this.f89365a.getPackageManager().getApplicationIcon(evVar2.f132944b));
                cpVar.f89360d.setOnClickListener(new C33330ci(this, eiVar));
                cpVar.f89360d.setVisibility(0);
            } catch (PackageManager.NameNotFoundException e2) {
                C59104x d2 = f89364f.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "TngMsgCarouselAdapter");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(51113)).mo56386p("#bindReplyCard: Failed to render provider button");
                cpVar.f89360d.setVisibility(8);
            }
            cpVar.f89361e.setEnabled(true);
            cpVar.f89361e.setOnClickListener(new C33331cj(this, cpVar, eiVar));
            cpVar.f89362f.setEnabled(!ehVar.f132910c.isEmpty());
            cpVar.f89362f.setOnClickListener(new C33332ck(this, cpVar, aco3, eiVar));
        } else {
            C33335cn cnVar = (C33335cn) ghVar;
            if (i3 == 6) {
                edVar = (C51040ed) eiVar.f132916c;
            } else {
                edVar = C51040ed.f132896c;
            }
            aco aco4 = eiVar.f132918e;
            if (aco4 == null) {
                aco4 = aco.f134821t;
            }
            cnVar.f89343b.setText(this.f89365a.getResources().getString(R.string.fa_message_reply_card_sent_to_message, new Object[]{C33231i.m61624a(aco4)}));
            TextView textView7 = cnVar.f89344c;
            C51049em emVar2 = edVar.f132899b;
            if (emVar2 == null) {
                emVar2 = C51049em.f132927d;
            }
            textView7.setText(emVar2.f132930b);
            try {
                C51098gh ghVar4 = eiVar.f132919f;
                if (ghVar4 == null) {
                    ghVar4 = C51098gh.f133009e;
                }
                if (ghVar4.f133012b == 1) {
                    evVar = (C51058ev) ghVar4.f133013c;
                } else {
                    evVar = C51058ev.f132941o;
                }
                String str2 = evVar.f132944b;
                Drawable applicationIcon = this.f89365a.getPackageManager().getApplicationIcon(str2);
                String obj = this.f89365a.getPackageManager().getApplicationLabel(this.f89365a.getPackageManager().getApplicationInfo(str2, 0)).toString();
                cnVar.f89346e.setImageDrawable(applicationIcon);
                cnVar.f89347f.setText(this.f89365a.getResources().getString(R.string.fa_message_carousel_card_provider_button, new Object[]{obj}));
                cnVar.f89345d.setOnClickListener(new C33324cc(this, eiVar));
                cnVar.f89345d.setVisibility(0);
            } catch (PackageManager.NameNotFoundException e3) {
                C59104x d3 = f89364f.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "TngMsgCarouselAdapter");
                ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e3)).mo56372aa(51111)).mo56386p("#bindConfirmationCard: Failed to render provider button");
                cnVar.f89345d.setVisibility(8);
            }
            cnVar.f89342a.setClickable(false);
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        Drawable background;
        if (i == R.id.fa_message_carousel_view_type_preview) {
            i2 = R.layout.fa_message_preview_card;
        } else if (i == R.id.fa_message_carousel_view_type_reply) {
            i2 = R.layout.fa_message_reply_card;
            i = R.id.fa_message_carousel_view_type_reply;
        } else {
            i2 = R.layout.fa_message_confirmation_card;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f89365a).inflate(i2, viewGroup, false);
        int dimensionPixelSize = this.f89365a.getResources().getDimensionPixelSize(R.dimen.fa_message_carousel_field_card_max_width);
        C0653fo foVar = ((RecyclerView) viewGroup).mLayout;
        if (foVar != null) {
            dimensionPixelSize = Math.min(dimensionPixelSize, (foVar.getWidth() - foVar.getPaddingLeft()) - foVar.getPaddingRight());
        }
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, -2));
        if (this.f89370g.mo38383m() && (background = linearLayout.getBackground()) != null) {
            background.setTint(C28505a.m53283a(R.dimen.gm3_sys_elevation_level2, this.f89365a));
        }
        if (i == R.id.fa_message_carousel_view_type_preview) {
            return new C33336co(linearLayout);
        }
        if (i == R.id.fa_message_carousel_view_type_reply) {
            return new C33337cp(linearLayout);
        }
        return new C33335cn(linearLayout);
    }
}
