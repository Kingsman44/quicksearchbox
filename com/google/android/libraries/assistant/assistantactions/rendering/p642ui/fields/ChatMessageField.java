package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

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
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50940al;
import com.google.assistant.p3897e.p3902c.p3907c.C50942an;
import com.google.assistant.p3897e.p3902c.p3907c.C50945aq;
import com.google.assistant.p3897e.p3902c.p3907c.C50946ar;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51141hx;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.protobuf.C63042fg;
import java.text.SimpleDateFormat;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChatMessageField */
/* compiled from: PG */
public class ChatMessageField extends C11407n {

    /* renamed from: a */
    public static final /* synthetic */ int f36924a = 0;

    /* renamed from: b */
    private static final int[] f36925b = {R.attr.state_chatMessageAudioReady};

    /* renamed from: c */
    private static final int[] f36926c = {R.attr.state_chatMessageSeen};

    /* renamed from: d */
    private TextView f36927d;

    /* renamed from: e */
    private Button f36928e;

    /* renamed from: f */
    private ImageComponent f36929f;

    /* renamed from: g */
    private TextView f36930g;

    /* renamed from: h */
    private LinearLayout f36931h;

    /* renamed from: i */
    private RelativeLayout f36932i;

    /* renamed from: t */
    private TextView f36933t;

    /* renamed from: u */
    private RelativeLayout f36934u;

    /* renamed from: v */
    private ConstraintLayout f36935v;

    /* renamed from: w */
    private Space f36936w;

    /* renamed from: x */
    private boolean f36937x = false;

    /* renamed from: y */
    private int f36938y = 1;

    public ChatMessageField(Context context) {
        super(context);
    }

    /* renamed from: c */
    private static ViewGroup.MarginLayoutParams m26991c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.rightMargin, marginLayoutParams.topMargin, marginLayoutParams.leftMargin, marginLayoutParams.bottomMargin);
        return marginLayoutParams;
    }

    /* renamed from: b */
    public final void mo19809b() {
        C50946ar arVar;
        super.mo19809b();
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 27) {
                arVar = (C50946ar) euVar.f136278f;
            } else {
                arVar = C50946ar.f132618i;
            }
            int a = C50945aq.m85986a(arVar.f132626g);
            if (a != 0 && a == 3) {
                this.f36937x = true;
                refreshDrawableState();
            }
            int i = arVar.f132621b;
            if (i == 3) {
                this.f36927d.setText((String) arVar.f132622c);
            } else if (i == 2) {
                this.f36927d.setText(((C50942an) arVar.f132622c).f132615a);
                this.f36927d.setPadding(getResources().getDimensionPixelSize(R.dimen.fluid_action_chat_message_field_audio_text_padding_left), this.f36927d.getPaddingTop(), this.f36927d.getPaddingRight(), this.f36927d.getPaddingBottom());
                this.f36928e.setVisibility(0);
                this.f36928e.setOnClickListener(new C11412s(this));
                mo19825a();
            }
            if ((arVar.f132620a & 1) != 0 && !arVar.f132627h) {
                C51141hx hxVar = arVar.f132623d;
                if (hxVar == null) {
                    hxVar = C51141hx.f133119h;
                }
                if ((hxVar.f133121a & 32) != 0) {
                    TextView textView = this.f36930g;
                    C51141hx hxVar2 = arVar.f132623d;
                    if (hxVar2 == null) {
                        hxVar2 = C51141hx.f133119h;
                    }
                    textView.setText(hxVar2.f133127g);
                    this.f36930g.setVisibility(0);
                }
                C51141hx hxVar3 = arVar.f132623d;
                if (((hxVar3 == null ? C51141hx.f133119h : hxVar3).f133121a & 16) != 0) {
                    ImageComponent imageComponent = this.f36929f;
                    if (hxVar3 == null) {
                        hxVar3 = C51141hx.f133119h;
                    }
                    C51012dc dcVar = hxVar3.f133126f;
                    if (dcVar == null) {
                        dcVar = C51012dc.f132813k;
                    }
                    imageComponent.mo19786b(dcVar, (Drawable) null);
                    this.f36929f.setVisibility(0);
                }
            }
            if (arVar.f132627h) {
                C51141hx hxVar4 = arVar.f132623d;
                if (hxVar4 == null) {
                    hxVar4 = C51141hx.f133119h;
                }
                if ((hxVar4.f133121a & 16) != 0) {
                    LinearLayout linearLayout = this.f36931h;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36929f.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
                    marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin + marginLayoutParams.width + marginLayoutParams.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                    linearLayout.setLayoutParams(marginLayoutParams2);
                }
                RelativeLayout relativeLayout = this.f36934u;
                relativeLayout.setPadding(relativeLayout.getPaddingLeft(), getResources().getDimensionPixelSize(R.dimen.fluid_action_chat_message_field_chained_padding_top), this.f36934u.getPaddingRight(), this.f36934u.getPaddingBottom());
            }
            if ((arVar.f132620a & 8) != 0) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a");
                C63042fg fgVar = arVar.f132624e;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                this.f36933t.setText(simpleDateFormat.format(Long.valueOf(Duration.ofSeconds(fgVar.f170154a).toMillis())));
                this.f36933t.setVisibility(0);
            }
            int a2 = C50940al.m85985a(arVar.f132625f);
            if (a2 != 0 && a2 == 2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f36931h.getLayoutParams();
                layoutParams.addRule(0, R.id.sender_avatar);
                layoutParams.removeRule(1);
                this.f36931h.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f36934u.getLayoutParams();
                layoutParams2.gravity = 5;
                this.f36934u.setLayoutParams(layoutParams2);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f36929f.getLayoutParams();
                layoutParams3.addRule(11);
                this.f36929f.setLayoutParams(layoutParams3);
                C0146c cVar2 = new C0146c();
                cVar2.mo192d(this.f36935v);
                cVar2.mo193e(this.f36930g.getId(), 7, 0, 7);
                cVar2.mo193e(this.f36930g.getId(), 1, this.f36936w.getId(), 2);
                cVar2.mo195g(this.f36930g.getId());
                cVar2.mo191c(this.f36930g.getId(), 6);
                cVar2.mo191c(this.f36930g.getId(), 2);
                cVar2.mo193e(this.f36936w.getId(), 1, this.f36933t.getId(), 2);
                cVar2.mo191c(this.f36936w.getId(), 2);
                cVar2.mo193e(this.f36933t.getId(), 6, 0, 6);
                cVar2.mo191c(this.f36933t.getId(), 7);
                ConstraintLayout constraintLayout = this.f36935v;
                cVar2.mo190b(constraintLayout);
                constraintLayout.f335c = null;
                ConstraintLayout constraintLayout2 = this.f36935v;
                constraintLayout2.setLayoutParams(m26991c(constraintLayout2));
                LinearLayout linearLayout2 = this.f36931h;
                linearLayout2.setLayoutParams(m26991c(linearLayout2));
                ImageComponent imageComponent2 = this.f36929f;
                imageComponent2.setLayoutParams(m26991c(imageComponent2));
                RelativeLayout relativeLayout2 = this.f36932i;
                relativeLayout2.setLayoutParams(m26991c(relativeLayout2));
            }
        }
    }

    /* renamed from: m */
    public final void mo19821m(C11295c cVar) {
        this.f37153l = cVar;
        mo19809b();
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        int i2 = this.f36938y;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                mergeDrawableStates(onCreateDrawableState, f36925b);
            }
            if (this.f36937x) {
                mergeDrawableStates(onCreateDrawableState, f36926c);
            }
            return onCreateDrawableState;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36927d = (TextView) findViewById(R.id.message_text);
        this.f36928e = (Button) findViewById(R.id.audio_play_button);
        this.f36929f = (ImageComponent) findViewById(R.id.sender_avatar);
        this.f36930g = (TextView) findViewById(R.id.sender_title);
        this.f36931h = (LinearLayout) findViewById(R.id.title_message_wrapper);
        this.f36932i = (RelativeLayout) findViewById(R.id.message);
        this.f36933t = (TextView) findViewById(R.id.timestamp);
        this.f36934u = (RelativeLayout) findViewById(R.id.chat_message_field_wrapper);
        this.f36935v = (ConstraintLayout) findViewById(R.id.title_timestamp_wrapper);
        this.f36936w = (Space) findViewById(R.id.title_timestamp_space);
    }

    public ChatMessageField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo19825a() {
        int i = this.f36938y;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                this.f36928e.setContentDescription(getResources().getString(R.string.fluid_action_playback_audio));
            }
            refreshDrawableState();
            return;
        }
        throw null;
    }

    public ChatMessageField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ChatMessageField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
