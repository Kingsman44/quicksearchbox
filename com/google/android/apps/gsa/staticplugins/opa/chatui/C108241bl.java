package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.searchplate.widget.AudioProgressRenderer;
import com.google.android.apps.gsa.searchplate.widget.StreamingTextView;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.ThinkingIndicator;
import com.google.android.apps.gsa.staticplugins.opa.soundsearch.AudioWaveformView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.bl */
/* compiled from: PG */
public final class C108241bl extends C0673gh {

    /* renamed from: A */
    public final LinearLayout f301051A;

    /* renamed from: B */
    final ImageView f301052B;

    /* renamed from: C */
    final SelectedAccountDisc f301053C;

    /* renamed from: D */
    final ImageView f301054D;

    /* renamed from: E */
    final ViewGroup f301055E;

    /* renamed from: F */
    final ViewGroup f301056F;

    /* renamed from: G */
    final ViewGroup f301057G;

    /* renamed from: H */
    final ImageView f301058H;

    /* renamed from: I */
    final ImageView f301059I;

    /* renamed from: J */
    final ViewGroup f301060J;

    /* renamed from: K */
    final LinearLayout f301061K;

    /* renamed from: L */
    final TextView f301062L;

    /* renamed from: M */
    final ViewGroup f301063M;

    /* renamed from: N */
    final ViewGroup f301064N;

    /* renamed from: O */
    final ViewGroup f301065O;

    /* renamed from: P */
    final WebView f301066P;

    /* renamed from: Q */
    final FrameLayout f301067Q;

    /* renamed from: R */
    public final ViewGroup f301068R;

    /* renamed from: S */
    public C108232bc f301069S;

    /* renamed from: T */
    public C108321ej f301070T;

    /* renamed from: U */
    public C108324em f301071U;

    /* renamed from: V */
    public View.OnLayoutChangeListener f301072V;

    /* renamed from: W */
    private WeakReference f301073W;

    /* renamed from: a */
    final ViewGroup f301074a;

    /* renamed from: b */
    final LogoView f301075b;

    /* renamed from: c */
    final FrameLayout f301076c;

    /* renamed from: d */
    public final TextView f301077d;

    /* renamed from: e */
    final TextView f301078e;

    /* renamed from: f */
    final ThinkingIndicator f301079f;

    /* renamed from: g */
    public final StreamingTextView f301080g;

    /* renamed from: h */
    public final TouchInterceptingFrameLayout f301081h;

    /* renamed from: i */
    final WebImageView f301082i;

    /* renamed from: j */
    final FrameLayout f301083j;

    /* renamed from: k */
    final ViewGroup f301084k;

    /* renamed from: l */
    final RecyclerView f301085l;

    /* renamed from: m */
    final WebImageView f301086m;

    /* renamed from: n */
    final TextView f301087n;

    /* renamed from: o */
    final TextView f301088o;

    /* renamed from: p */
    final TextView f301089p;

    /* renamed from: q */
    final ViewGroup f301090q;

    /* renamed from: r */
    final ImageView f301091r;

    /* renamed from: s */
    final ViewGroup f301092s;

    /* renamed from: t */
    final AudioWaveformView f301093t;

    /* renamed from: u */
    final TextView f301094u;

    /* renamed from: v */
    final WebImageView f301095v;

    /* renamed from: w */
    final RelativeLayout f301096w;

    /* renamed from: x */
    final LinearLayout f301097x;

    /* renamed from: y */
    final TextView f301098y;

    /* renamed from: z */
    final LinearLayout f301099z;

    public C108241bl(View view) {
        super(view);
        this.f301074a = (ViewGroup) view.findViewById(R.id.chatui_content);
        this.f301055E = (ViewGroup) view.findViewById(R.id.chatui_user_container);
        this.f301056F = (ViewGroup) view.findViewById(R.id.chatui_streaming_text_container);
        this.f301077d = (TextView) view.findViewById(R.id.chatui_text);
        this.f301078e = (TextView) view.findViewById(R.id.chatui_long_text);
        this.f301079f = (ThinkingIndicator) view.findViewById(R.id.thinking_indicator);
        this.f301080g = (StreamingTextView) view.findViewById(R.id.chatui_streaming_text);
        this.f301081h = (TouchInterceptingFrameLayout) view.findViewById(R.id.chatui_card_container);
        this.f301082i = (WebImageView) view.findViewById(R.id.chatui_sticker);
        this.f301083j = (FrameLayout) view.findViewById(R.id.chatui_loading_spinner_container);
        this.f301084k = (ViewGroup) view.findViewById(R.id.chatui_suggestion_recyclerview);
        this.f301065O = (ViewGroup) view.findViewById(R.id.chatui_rich_suggestion_container);
        this.f301085l = (RecyclerView) view.findViewById(R.id.message_carousel_container);
        LogoView logoView = (LogoView) view.findViewById(R.id.chatui_logo);
        this.f301075b = logoView;
        this.f301076c = (FrameLayout) view.findViewById(R.id.chatui_logo_container);
        if (!(logoView == null || logoView.f63000g.f63060j == 10)) {
            logoView.mo28225e(10, true);
        }
        this.f301086m = (WebImageView) view.findViewById(R.id.chatui_third_party_logo);
        this.f301087n = (TextView) view.findViewById(R.id.chatui_background_text);
        this.f301088o = (TextView) view.findViewById(R.id.chatui_divider);
        this.f301089p = (TextView) view.findViewById(R.id.chatui_history_text);
        this.f301090q = (ViewGroup) view.findViewById(R.id.chatui_metadata);
        this.f301091r = (ImageView) view.findViewById(R.id.chatui_screenshot);
        this.f301060J = (ViewGroup) view.findViewById(R.id.photo_grid_container);
        this.f301063M = (ViewGroup) view.findViewById(R.id.sharing_fab_container);
        this.f301064N = (ViewGroup) view.findViewById(R.id.share_mini_card_container);
        this.f301092s = (ViewGroup) view.findViewById(R.id.chatui_hero_bubble_container);
        AudioProgressRenderer audioProgressRenderer = (AudioProgressRenderer) view.findViewById(R.id.audio_progress_renderer);
        this.f301093t = (AudioWaveformView) view.findViewById(R.id.audio_waveform_view);
        this.f301094u = (TextView) view.findViewById(R.id.divider_text);
        this.f301095v = (WebImageView) view.findViewById(R.id.divider_logo_view);
        this.f301096w = (RelativeLayout) view.findViewById(R.id.message_notification_history_card_container);
        this.f301097x = (LinearLayout) view.findViewById(R.id.message_notification_read_receipt_card_container);
        this.f301098y = (TextView) view.findViewById(R.id.lockhart_greeting_text);
        this.f301099z = (LinearLayout) view.findViewById(R.id.webview_placeholder_container);
        this.f301051A = (LinearLayout) view.findViewById(R.id.chatui_xuikit_card_placeholder);
        this.f301052B = (ImageView) view.findViewById(R.id.chatui_user_bubble_profile_icon);
        this.f301053C = (SelectedAccountDisc) view.findViewById(R.id.selected_account_disc);
        this.f301054D = (ImageView) view.findViewById(R.id.chatui_user_bubble_assistant_logo);
        this.f301057G = (ViewGroup) view.findViewById(R.id.chatui_user_bubble_edit_hint);
        this.f301058H = (ImageView) view.findViewById(R.id.chatui_google_bubble_profile_icon);
        this.f301059I = (ImageView) view.findViewById(R.id.chatui_google_bubble_logo);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.chatui_voice_match_promo_container);
        this.f301061K = (LinearLayout) view.findViewById(R.id.chatui_voice_match_promo_outer_container);
        ImageView imageView = (ImageView) view.findViewById(R.id.chatui_voice_match_promo_icon);
        this.f301062L = (TextView) view.findViewById(R.id.chatui_voice_match_promo_text);
        this.f301068R = (ViewGroup) view.findViewById(R.id.chatui_fragment_holder);
        this.f301066P = (WebView) view.findViewById(R.id.assistant_ad_webview);
        this.f301067Q = (FrameLayout) view.findViewById(R.id.assistant_ad_webview_container);
    }

    /* renamed from: a */
    public static String m179898a(int i) {
        if (i == -3) {
            return "INITIAL_POSITION_PLACEHOLDER";
        }
        if (i == -2) {
            return "LAST_POSITION_PLACEHOLDER";
        }
        if (i == 35) {
            return "AD_WEBVIEW";
        }
        switch (i) {
            case 0:
                return "UserBubble";
            case 1:
                return "GoogleBubble";
            case 2:
                return "AnswerCard";
            case 3:
                return "ContextualCard";
            case 4:
                return "Suggestions";
            case 5:
                return "HeroBubble";
            case 6:
                return "BACKGROUND_TEXT_ITEM";
            case 7:
                return "STICKER_ITEM";
            case 8:
                return "HISTORY";
            case 9:
                return "IMAGE_USER_BUBBLE";
            case 10:
                return "AUDIO_PROGRESS";
            case 11:
                return "DISMISS_MESSAGE";
            case 12:
                return "MESSAGE_CAROUSEL";
            case 13:
                return "HISTORY_DIVIDER";
            case 14:
                return "LENS_UI_ITEM";
            case 15:
                return "MESSAGE_NOTIFICATION_CARD";
            case 16:
                return "MESSAGE_NOTIFICATION_READ_RECEIPT_CARD";
            case 17:
                return "LOCKHART_GREETING";
            case 18:
                return "WEBVIEW_PLACEHOLDER";
            case 19:
                return "XUIKIT_CARD";
            case 20:
                return "PHOTO_GRID";
            case 21:
                return "VOICE_MATCH_PROMO_ITEM";
            case 22:
                return "XUIKIT_CARD_PLACEHOLDER";
            case 23:
                return "DRL_HISTORY_BUBBLE";
            case 24:
                return "DRL_HISTORY_BACKGROUND_TEXT_ITEM";
            case 25:
                return "DRL_CHATTY_USER_BUBBLE";
            case 26:
                return "DRL_CHATTY_GOOGLE_BUBBLE";
            case 27:
                return "IRIS_FULL_HEIGHT_GOOGLE_BUBBLE";
            case 28:
                return "SHARING_FAB_BUBBLE";
            case 29:
                return "SHARING_MINI_CARD";
            case 30:
                return "LOADING_CARD";
            case 31:
                return "BACK_BUTTON_WEBVIEW_HISTORY";
            default:
                return "Unknown ViewType=" + i;
        }
    }

    /* renamed from: b */
    public final WeakReference mo96686b() {
        if (this.f301073W == null) {
            this.f301073W = new WeakReference(this);
        }
        return this.f301073W;
    }

    /* renamed from: c */
    public final void mo96687c() {
        this.itemView.setAlpha(1.0f);
        this.itemView.setTranslationY(0.0f);
        C108232bc bcVar = this.f301069S;
        if (bcVar != null) {
            bcVar.mo95833k(this);
        }
        mo96688d((C108232bc) null);
        this.f301070T = null;
        this.f301071U = null;
        this.f301072V = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo96689e(float f) {
        FrameLayout frameLayout = this.f301076c;
        if (frameLayout != null) {
            frameLayout.post(new C108239bj(this, f));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m179898a(this.mItemViewType));
        sb.append(" #");
        sb.append(getBindingAdapterPosition());
        C108232bc bcVar = this.f301069S;
        if (bcVar != null && bcVar.mo96602l() == 2) {
            sb.append("[H]");
        }
        sb.append("(");
        sb.append(Integer.toHexString(this.itemView.hashCode()));
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: d */
    public final void mo96688d(C108232bc bcVar) {
        TextView textView;
        TextView textView2;
        CharSequence charSequence;
        this.f301069S = bcVar;
        TextView textView3 = this.f301088o;
        if (textView3 != null) {
            if (bcVar == null || (charSequence = bcVar.f301036r) == null) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(charSequence);
                this.f301088o.setVisibility(0);
            }
        }
        C108232bc bcVar2 = this.f301069S;
        if (bcVar2 != null) {
            bcVar2.mo96609s(bcVar2.f301031m);
        }
        if (!(this.f301069S == null || (textView2 = this.f301077d) == null)) {
            textView2.setAccessibilityDelegate(new C108240bk(this.f301069S.f301032n));
        }
        if (this.f301069S != null && (textView = this.f301078e) != null) {
            textView.setAccessibilityDelegate(new C108240bk(this.f301069S.f301032n));
        }
    }
}
