package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.C0146c;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50940al;
import com.google.assistant.p3897e.p3902c.p3907c.C50942an;
import com.google.assistant.p3897e.p3902c.p3907c.C50945aq;
import com.google.assistant.p3897e.p3902c.p3907c.C50946ar;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51141hx;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63042fg;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ChatMessageField */
/* compiled from: PG */
public final class ChatMessageField extends LinearLayout implements C33177b {

    /* renamed from: a */
    public static final C59071e f89022a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ChatMessageField");

    /* renamed from: e */
    private static final int[] f89023e = {R.attr.state_faChatMessageAudioReady};

    /* renamed from: f */
    private static final int[] f89024f = {R.attr.state_faChatMessageSeen};

    /* renamed from: b */
    public C51941eu f89025b;

    /* renamed from: c */
    public C33182g f89026c;

    /* renamed from: d */
    public C32942a f89027d;

    /* renamed from: g */
    private TextView f89028g = null;

    /* renamed from: h */
    private Button f89029h = null;

    /* renamed from: i */
    private ImageComponent f89030i = null;

    /* renamed from: j */
    private TextView f89031j = null;

    /* renamed from: k */
    private LinearLayout f89032k = null;

    /* renamed from: l */
    private RelativeLayout f89033l = null;

    /* renamed from: m */
    private TextView f89034m = null;

    /* renamed from: n */
    private RelativeLayout f89035n = null;

    /* renamed from: o */
    private ConstraintLayout f89036o = null;

    /* renamed from: p */
    private Space f89037p = null;

    /* renamed from: q */
    private boolean f89038q = false;

    /* renamed from: r */
    private final int f89039r = 1;

    public ChatMessageField(Context context) {
        super(context);
    }

    /* renamed from: h */
    private static ViewGroup.MarginLayoutParams m61722h(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.rightMargin, marginLayoutParams.topMargin, marginLayoutParams.leftMargin, marginLayoutParams.bottomMargin);
        return marginLayoutParams;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        C50946ar arVar;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C51941eu euVar = this.f89025b;
        if (euVar == null || this.f89026c == null || this.f89035n == null || this.f89030i == null || this.f89032k == null || this.f89036o == null || this.f89031j == null || this.f89037p == null || this.f89034m == null || this.f89033l == null || this.f89029h == null || this.f89028g == null) {
            ((C59052c) ((C59052c) f89022a.mo56226d()).mo56372aa(51015)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89025b = euVar2;
            this.f89026c.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89025b;
        if (euVar3.f136277e == 27) {
            arVar = (C50946ar) euVar3.f136278f;
        } else {
            arVar = C50946ar.f132618i;
        }
        int a = C50945aq.m85986a(arVar.f132626g);
        if (a != 0 && a == 3) {
            this.f89038q = true;
            refreshDrawableState();
        }
        int i = arVar.f132621b;
        if (i == 3) {
            this.f89028g.setText((String) arVar.f132622c);
        } else if (i == 2) {
            TextView textView = this.f89028g;
            if (textView != null) {
                textView.setText(((C50942an) arVar.f132622c).f132615a);
                this.f89028g.setPadding(getResources().getDimensionPixelSize(R.dimen.fa_chat_message_field_audio_text_padding_left), this.f89028g.getPaddingTop(), this.f89028g.getPaddingRight(), this.f89028g.getPaddingBottom());
            }
            this.f89029h.setVisibility(0);
            this.f89029h.setOnClickListener(new C33384r(this));
            mo38685a();
        }
        if ((arVar.f132620a & 1) != 0 && !arVar.f132627h) {
            C51141hx hxVar = arVar.f132623d;
            if (hxVar == null) {
                hxVar = C51141hx.f133119h;
            }
            if ((hxVar.f133121a & 32) != 0) {
                TextView textView2 = this.f89031j;
                C51141hx hxVar2 = arVar.f132623d;
                if (hxVar2 == null) {
                    hxVar2 = C51141hx.f133119h;
                }
                textView2.setText(hxVar2.f133127g);
                this.f89031j.setVisibility(0);
            }
            C51141hx hxVar3 = arVar.f132623d;
            if (((hxVar3 == null ? C51141hx.f133119h : hxVar3).f133121a & 16) != 0) {
                ImageComponent imageComponent = this.f89030i;
                if (hxVar3 == null) {
                    hxVar3 = C51141hx.f133119h;
                }
                C51012dc dcVar = hxVar3.f133126f;
                if (dcVar == null) {
                    dcVar = C51012dc.f132813k;
                }
                imageComponent.mo38649b(dcVar, (Drawable) null);
                this.f89030i.setVisibility(0);
            }
        }
        if (arVar.f132627h) {
            C51141hx hxVar4 = arVar.f132623d;
            if (hxVar4 == null) {
                hxVar4 = C51141hx.f133119h;
            }
            if ((hxVar4.f133121a & 16) != 0) {
                LinearLayout linearLayout = this.f89032k;
                ImageComponent imageComponent2 = this.f89030i;
                if (imageComponent2 == null) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageComponent2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
                    marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin + marginLayoutParams2.width + marginLayoutParams2.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                    marginLayoutParams = marginLayoutParams3;
                }
                linearLayout.setLayoutParams(marginLayoutParams);
            }
            RelativeLayout relativeLayout = this.f89035n;
            relativeLayout.setPadding(relativeLayout.getPaddingLeft(), getResources().getDimensionPixelSize(R.dimen.fa_chat_message_field_chained_padding_top), this.f89035n.getPaddingRight(), this.f89035n.getPaddingBottom());
        }
        if ((arVar.f132620a & 8) != 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", Locale.getDefault());
            C63042fg fgVar = arVar.f132624e;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            this.f89034m.setText(simpleDateFormat.format(Long.valueOf(Duration.ofSeconds(fgVar.f170154a).toMillis())));
            this.f89034m.setVisibility(0);
        }
        int a2 = C50940al.m85985a(arVar.f132625f);
        if (a2 != 0 && a2 == 2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f89032k.getLayoutParams();
            layoutParams.addRule(0, this.f89030i.getId());
            layoutParams.removeRule(1);
            this.f89032k.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f89035n.getLayoutParams();
            layoutParams2.gravity = 5;
            this.f89035n.setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f89030i.getLayoutParams();
            layoutParams3.addRule(11);
            this.f89030i.setLayoutParams(layoutParams3);
            C0146c cVar = new C0146c();
            cVar.mo192d(this.f89036o);
            cVar.mo193e(this.f89031j.getId(), 7, 0, 7);
            cVar.mo193e(this.f89031j.getId(), 1, this.f89037p.getId(), 2);
            cVar.mo195g(this.f89031j.getId());
            cVar.mo191c(this.f89031j.getId(), 6);
            cVar.mo191c(this.f89031j.getId(), 2);
            cVar.mo193e(this.f89037p.getId(), 1, this.f89034m.getId(), 2);
            cVar.mo191c(this.f89037p.getId(), 2);
            cVar.mo193e(this.f89034m.getId(), 6, 0, 6);
            cVar.mo191c(this.f89034m.getId(), 7);
            ConstraintLayout constraintLayout = this.f89036o;
            cVar.mo190b(constraintLayout);
            constraintLayout.f335c = null;
            ConstraintLayout constraintLayout2 = this.f89036o;
            constraintLayout2.setLayoutParams(m61722h(constraintLayout2));
            LinearLayout linearLayout2 = this.f89032k;
            linearLayout2.setLayoutParams(m61722h(linearLayout2));
            ImageComponent imageComponent3 = this.f89030i;
            imageComponent3.setLayoutParams(m61722h(imageComponent3));
            RelativeLayout relativeLayout2 = this.f89033l;
            relativeLayout2.setLayoutParams(m61722h(relativeLayout2));
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        int i2 = this.f89039r;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                mergeDrawableStates(onCreateDrawableState, f89023e);
            }
            if (this.f89038q) {
                mergeDrawableStates(onCreateDrawableState, f89024f);
            }
            return onCreateDrawableState;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f89035n = (RelativeLayout) findViewById(R.id.fa_chat_message_field_container);
        this.f89030i = (ImageComponent) findViewById(R.id.fa_chat_message_field_sender_avatar_image);
        this.f89032k = (LinearLayout) findViewById(R.id.fa_chat_message_field_title_message_container);
        this.f89036o = (ConstraintLayout) findViewById(R.id.fa_chat_message_field_title);
        this.f89031j = (TextView) findViewById(R.id.fa_chat_message_field_sender_name);
        this.f89037p = (Space) findViewById(R.id.fa_chat_message_field_title_space);
        this.f89034m = (TextView) findViewById(R.id.fa_chat_message_field_timestamp);
        this.f89033l = (RelativeLayout) findViewById(R.id.fa_chat_message_field_message);
        this.f89029h = (Button) findViewById(R.id.fa_chat_message_field_audio_play_button);
        this.f89028g = (TextView) findViewById(R.id.fa_chat_message_field_message_text);
    }

    public ChatMessageField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo38685a() {
        Button button = this.f89029h;
        if (button != null) {
            int i = this.f89039r;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    button.setContentDescription(getResources().getString(R.string.fa_playback_audio));
                }
                refreshDrawableState();
                return;
            }
            throw null;
        }
    }

    public ChatMessageField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ChatMessageField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
