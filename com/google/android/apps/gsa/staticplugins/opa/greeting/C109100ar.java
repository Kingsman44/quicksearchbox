package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.accounts.Account;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.core.content.C1878d;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.d.j;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.searchplate.widget.StreamingTextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.staticplugins.opa.C108779dm;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106391p;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109399b;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i;
import com.google.android.apps.gsa.staticplugins.opa.util.C113868cw;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;
import com.google.android.apps.gsa.staticplugins.opa.widget.impl.C114250c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3775ac.p3779d.C48461a;
import com.google.assistant.p3775ac.p3779d.C48462b;
import com.google.assistant.p3775ac.p3779d.C48468h;
import com.google.assistant.p3775ac.p3779d.C48470j;
import com.google.assistant.p4008y.p4009a.C53554an;
import com.google.assistant.p4008y.p4009a.C53568ba;
import com.google.assistant.p4008y.p4009a.C53569bb;
import com.google.assistant.p4008y.p4009a.C53585br;
import com.google.assistant.p4008y.p4009a.C53592by;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p427am.p428a.p429a.p430a.p431a.C8606b;
import dagger.C68214a;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.ar */
/* compiled from: PG */
public final class C109100ar {

    /* renamed from: a */
    public static final C59071e f303734a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.greeting.ar");

    /* renamed from: ac */
    private static final Interpolator f303735ac = C91107f.m148859b(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: A */
    public final C68214a f303736A;

    /* renamed from: B */
    public Animator f303737B;

    /* renamed from: C */
    public Animator f303738C;

    /* renamed from: D */
    final C109103au f303739D;

    /* renamed from: E */
    public Animator f303740E;

    /* renamed from: F */
    public Animator f303741F;

    /* renamed from: G */
    public final C68214a f303742G;

    /* renamed from: H */
    public final C68214a f303743H;

    /* renamed from: I */
    public boolean f303744I = false;

    /* renamed from: J */
    public boolean f303745J = false;

    /* renamed from: K */
    LottieAnimationView f303746K;

    /* renamed from: L */
    public boolean f303747L;

    /* renamed from: M */
    public boolean f303748M;

    /* renamed from: N */
    public final C68214a f303749N;

    /* renamed from: O */
    public final String f303750O;

    /* renamed from: P */
    public final LayoutInflater f303751P;

    /* renamed from: Q */
    public final LinearLayout f303752Q;

    /* renamed from: R */
    final LinearLayout f303753R;

    /* renamed from: S */
    final LinearLayout f303754S;

    /* renamed from: T */
    final LinearLayout f303755T;

    /* renamed from: U */
    final LinearLayout f303756U;

    /* renamed from: V */
    public final C68214a f303757V;

    /* renamed from: W */
    public final C114540i f303758W;

    /* renamed from: X */
    public final C87568k f303759X;

    /* renamed from: Y */
    public final C89994f f303760Y;

    /* renamed from: Z */
    public boolean f303761Z;

    /* renamed from: aa */
    public Optional f303762aa = Optional.empty();

    /* renamed from: ab */
    public final C108779dm f303763ab;

    /* renamed from: ad */
    private final C22871g f303764ad;

    /* renamed from: ae */
    private final String f303765ae;

    /* renamed from: af */
    private final C113868cw f303766af;

    /* renamed from: ag */
    private final C68214a f303767ag;

    /* renamed from: ah */
    private final C114250c f303768ah;

    /* renamed from: b */
    public final C68214a f303769b;

    /* renamed from: c */
    public final LinearLayout f303770c;

    /* renamed from: d */
    final RecyclerView f303771d;

    /* renamed from: e */
    public final LinearLayout f303772e;

    /* renamed from: f */
    public final LinearLayout f303773f;

    /* renamed from: g */
    public final ImageView f303774g;

    /* renamed from: h */
    final TextView f303775h;

    /* renamed from: i */
    final TextView f303776i;

    /* renamed from: j */
    public final TextView f303777j;

    /* renamed from: k */
    public final TextView f303778k;

    /* renamed from: l */
    final TextView f303779l;

    /* renamed from: m */
    final TextView f303780m;

    /* renamed from: n */
    final TextView f303781n;

    /* renamed from: o */
    public final TextView f303782o;

    /* renamed from: p */
    final RelativeLayout f303783p;

    /* renamed from: q */
    final VideoView f303784q;

    /* renamed from: r */
    final ImageButton f303785r;

    /* renamed from: s */
    public final StreamingTextView f303786s;

    /* renamed from: t */
    public final ImageView f303787t;

    /* renamed from: u */
    public final C113984c f303788u;

    /* renamed from: v */
    public final C91097g f303789v;

    /* renamed from: w */
    public final Context f303790w;

    /* renamed from: x */
    public final C86124t f303791x;

    /* renamed from: y */
    public final C22871g f303792y;

    /* renamed from: z */
    public final C22871g f303793z;

    public C109100ar(C113984c cVar, C108779dm dmVar, C91097g gVar, C108423id idVar, String str, String str2, String str3, C68214a aVar, Context context, C86124t tVar, C68214a aVar2, C109104av avVar, C22871g gVar2, C22871g gVar3, C22871g gVar4, C68214a aVar3, C68214a aVar4, C68214a aVar5, C113868cw cwVar, C68214a aVar6, C114540i iVar, C87568k kVar, C89994f fVar, C114250c cVar2, C68214a aVar7) {
        char c;
        VideoView videoView;
        int i;
        C60870cx cxVar;
        C113984c cVar3 = cVar;
        C108423id idVar2 = idVar;
        Context context2 = context;
        C86124t tVar2 = tVar;
        C109104av avVar2 = avVar;
        C22871g gVar5 = gVar2;
        C22871g gVar6 = gVar3;
        C22871g gVar7 = gVar4;
        C114540i iVar2 = iVar;
        this.f303788u = cVar3;
        this.f303763ab = dmVar;
        this.f303789v = gVar;
        this.f303790w = context2;
        this.f303791x = tVar2;
        this.f303736A = aVar2;
        this.f303792y = gVar5;
        this.f303793z = gVar6;
        this.f303764ad = gVar7;
        this.f303748M = false;
        this.f303769b = aVar;
        this.f303742G = aVar3;
        this.f303743H = aVar4;
        this.f303749N = aVar5;
        this.f303750O = str;
        this.f303765ae = str2;
        this.f303766af = cwVar;
        this.f303757V = aVar6;
        this.f303758W = iVar2;
        this.f303759X = kVar;
        this.f303760Y = fVar;
        this.f303768ah = cVar2;
        this.f303767ag = aVar7;
        LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(context2, 2132148450));
        this.f303751P = from;
        LinearLayout linearLayout = (LinearLayout) from.inflate(R.layout.greeting_view, (ViewGroup) null);
        this.f303770c = linearLayout;
        RecyclerView recyclerView = (RecyclerView) linearLayout.findViewById(R.id.greeting_suggestion_container);
        this.f303771d = recyclerView;
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.greeting_text_container);
        this.f303772e = linearLayout2;
        RecyclerView recyclerView2 = recyclerView;
        LinearLayout linearLayout3 = (LinearLayout) linearLayout.findViewById(R.id.query_suggestion_text_container);
        this.f303773f = linearLayout3;
        TextView textView = (TextView) linearLayout2.findViewById(R.id.greeting_text_message_1);
        this.f303775h = textView;
        TextView textView2 = (TextView) linearLayout2.findViewById(R.id.greeting_text_message_2);
        this.f303776i = textView2;
        TextView textView3 = textView2;
        this.f303777j = (TextView) linearLayout2.findViewById(R.id.query_suggestion_text_for_upgraded_user_first_line);
        this.f303778k = (TextView) linearLayout2.findViewById(R.id.query_suggestion_text_for_upgraded_user_second_line);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.greeting_opa_icon);
        this.f303774g = imageView;
        ImageView imageView2 = imageView;
        ImageView imageView3 = (ImageView) linearLayout.findViewById(R.id.promo_hero_image);
        this.f303787t = imageView3;
        ImageView imageView4 = imageView3;
        this.f303779l = (TextView) linearLayout3.findViewById(R.id.query_suggestion_text_1);
        this.f303780m = (TextView) linearLayout3.findViewById(R.id.greeting_disclaimer_text);
        this.f303781n = (TextView) linearLayout3.findViewById(R.id.simon_disclosure_text);
        this.f303752Q = (LinearLayout) linearLayout3.findViewById(R.id.query_suggestion_list);
        this.f303753R = (LinearLayout) linearLayout3.findViewById(R.id.query_suggestion_with_icon_full_container);
        this.f303754S = (LinearLayout) linearLayout3.findViewById(R.id.query_suggestion_title_and_text);
        this.f303756U = (LinearLayout) linearLayout3.findViewById(R.id.query_suggestion_icon);
        LinearLayout linearLayout4 = (LinearLayout) linearLayout.findViewById(R.id.greeting_optin_button_view);
        this.f303755T = linearLayout4;
        LinearLayout linearLayout5 = linearLayout4;
        this.f303782o = (TextView) linearLayout3.findViewById(R.id.opa_greeting_mic_hint_text);
        RelativeLayout relativeLayout = (RelativeLayout) linearLayout2.findViewById(R.id.greeting_video_container);
        this.f303783p = relativeLayout;
        LinearLayout linearLayout6 = linearLayout3;
        VideoView videoView2 = (VideoView) relativeLayout.findViewById(R.id.greeting_videoview);
        this.f303784q = videoView2;
        videoView2.setClipToOutline(true);
        ImageButton imageButton = (ImageButton) relativeLayout.findViewById(R.id.greeting_video_play);
        this.f303785r = imageButton;
        VideoView videoView3 = videoView2;
        StreamingTextView streamingTextView = (StreamingTextView) linearLayout.findViewById(R.id.greeting_transcription_text);
        this.f303786s = streamingTextView;
        streamingTextView.setMovementMethod(new ScrollingMovementMethod());
        streamingTextView.f241132b = true;
        streamingTextView.f241131a = C1878d.m5128a(context2, R.color.transcription_text_pending);
        streamingTextView.setVisibility(8);
        textView.setText(mo97587c().getText(R.string.opa_first_time_greeting_message_3));
        C86124t tVar3 = (C86124t) avVar2.f303820a.mo17428b();
        tVar3.getClass();
        C109399b bVar = (C109399b) avVar2.f303821b.mo17428b();
        bVar.getClass();
        C106391p pVar = (C106391p) avVar2.f303822c.mo17428b();
        pVar.getClass();
        C73841bf bfVar = (C73841bf) avVar2.f303823d.mo17428b();
        bfVar.getClass();
        LinearLayout linearLayout7 = linearLayout6;
        ImageButton imageButton2 = imageButton;
        TextView textView4 = textView;
        TextView textView5 = textView3;
        ImageView imageView5 = imageView4;
        RelativeLayout relativeLayout2 = relativeLayout;
        C109103au auVar = new C109103au(str, str2, tVar3, bVar, pVar, bfVar);
        this.f303739D = auVar;
        C113984c cVar4 = C113984c.UNKNOWN;
        int i2 = 69720;
        switch (cVar.ordinal()) {
            case 4:
                String x = tVar2.mo79746e(C90014bt.f247439hF) ? tVar2.mo79758x(C90014bt.f247441hH) : tVar2.mo79758x(C90014bt.f247683ll);
                C28292j jVar = new C28292j(101828);
                jVar.mo33795i(5);
                RelativeLayout relativeLayout3 = relativeLayout2;
                C28295m.m52919e(relativeLayout3, jVar);
                if (!tVar2.mo79746e(C90014bt.f247438hE)) {
                    mo97602r();
                } else {
                    relativeLayout3.setVisibility(8);
                }
                if (x.startsWith("https://www.gstatic.com/opa-android/") || x.startsWith("https://www.gstatic.com/assistant_nbu_growth/")) {
                    videoView = videoView3;
                    videoView.setVideoURI(Uri.parse(x));
                } else {
                    videoView = videoView3;
                }
                imageButton2.setOnClickListener(new C109109f(this));
                videoView.setOnTouchListener(new C109119p(this));
                videoView.setOnPreparedListener(new C109120q(this));
                videoView.setOnCompletionListener(new C109121r(this));
                if (!tVar2.mo79746e(C90014bt.f247438hE)) {
                    i2 = 66889;
                    break;
                } else {
                    m181607y();
                    break;
                }
                break;
            case 5:
            case 8:
                m181607y();
                if (tVar2.mo79746e(C90037cp.f248531cF)) {
                    mo97598n();
                    break;
                }
                break;
            case 6:
                ((C89859i) aVar5.mo27525b()).mo83702b(C89849ae.OPA_CHALKBOARD_SUGGESTIONS_FETCH_REQUEST);
                gVar5.mo28211k(C90877ak.m148471e(auVar.mo97607a(cVar3, 1), tVar2.mo79743a(C90037cp.f248614j), TimeUnit.MILLISECONDS, gVar6), "TbybGreetingContainer suggestionFuture", new C109091ai(this));
                imageView2.setVisibility(8);
                textView4.setVisibility(4);
                textView5.setVisibility(4);
                ((FrameLayout.LayoutParams) linearLayout2.getLayoutParams()).height = (int) context.getResources().getDimension(R.dimen.greeting_query_suggestion_plate_height_for_upgraded_user);
                break;
            case 7:
                m181607y();
                i2 = 97415;
                break;
            case 9:
                linearLayout2.setVisibility(8);
                linearLayout7.setVisibility(0);
                C53592by byVar = (C53592by) C53593bz.f140658j.createBuilder();
                byVar.copyOnWrite();
                C53593bz bzVar = (C53593bz) byVar.instance;
                str3.getClass();
                bzVar.f140660a |= 1;
                bzVar.f140661b = str3;
                mo97600p((C53593bz) byVar.build(), false);
                i2 = 103976;
                break;
            case 10:
                if (tVar2.mo79746e(C90014bt.f247438hE)) {
                    linearLayout2.setVisibility(4);
                } else {
                    linearLayout2.setVisibility(8);
                }
                if (!TextUtils.isEmpty(tVar2.mo79758x(C90037cp.f248515bq))) {
                    ImageView imageView6 = imageView5;
                    ((C91189au) aVar7.mo27525b()).mo85421i(tVar2.mo79758x(C90037cp.f248515bq), imageView6);
                    i = 0;
                    imageView6.setVisibility(0);
                } else {
                    i = 0;
                }
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView2.getLayoutParams();
                layoutParams.bottomMargin = i;
                imageView2.setLayoutParams(layoutParams);
                linearLayout7.setVisibility(i);
                C53592by byVar2 = (C53592by) C53593bz.f140658j.createBuilder();
                String x2 = tVar2.mo79758x(C90037cp.f248521bw);
                byVar2.copyOnWrite();
                C53593bz bzVar2 = (C53593bz) byVar2.instance;
                x2.getClass();
                bzVar2.f140660a |= 1;
                bzVar2.f140661b = x2;
                mo97600p((C53593bz) byVar2.build(), true);
                if (TextUtils.isEmpty(tVar2.mo79758x(C90037cp.f248515bq))) {
                    ((ViewGroup.MarginLayoutParams) linearLayout5.getLayoutParams()).setMargins(0, (int) mo97587c().getDimension(R.dimen.greeting_promo_image_button_margin_top), 0, 0);
                }
                LinearLayout linearLayout8 = linearLayout5;
                Button button = (Button) linearLayout8.findViewById(R.id.greeting_optin_button);
                ImageView imageView7 = (ImageView) linearLayout8.findViewById(R.id.greeting_optin_button_imageview);
                button.setText(tVar2.mo79758x(C90037cp.f248518bt));
                linearLayout8.getLayoutParams().width = -2;
                linearLayout8.getLayoutParams().height = (int) context.getResources().getDimension(R.dimen.greeting_promo_image_button_view_height);
                linearLayout8.setBackground(context.getResources().getDrawable(R.drawable.greeting_rounded_button_bg, (Resources.Theme) null));
                linearLayout8.setOrientation(0);
                button.getLayoutParams().width = -2;
                button.getLayoutParams().height = -1;
                button.setBackgroundResource(0);
                button.setPadding(context.getResources().getDimensionPixelSize(R.dimen.greeting_promo_suggestion_chip_padding_left), 0, context.getResources().getDimensionPixelSize(R.dimen.greeting_promo_suggestion_chip_padding_right), 0);
                ((C91189au) aVar7.mo27525b()).mo85421i(tVar2.mo79758x(C90037cp.f248516br), imageView7);
                imageView7.setVisibility(0);
                gVar6.mo28211k(iVar2.mo101392b("opa_nest_growth_promo_impression_count", 0), "Update Nest Promo Impression Count", new C109128y(this));
                String x3 = tVar2.mo79758x(C90037cp.f248517bs);
                if (!TextUtils.isEmpty(x3)) {
                    try {
                        Uri parse = Uri.parse(x3);
                        if (!tVar2.mo79746e(C90037cp.f248575cx)) {
                            cxVar = C60856cj.m92900i(Optional.m71637of(parse));
                        } else {
                            cxVar = gVar7.mo28201a("Create encrypted nest promo uri", new C109111h(this, parse));
                        }
                    } catch (IllegalArgumentException | NullPointerException e) {
                        C59104x c2 = f303734a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "TbybGreetingContainer");
                        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(24509)).mo56386p("Invalid or null or bad url entered");
                        cxVar = C60856cj.m92900i(Optional.empty());
                    }
                    this.f303792y.mo28211k(cxVar, "TbybGreetingContainernestPromoUriFuture", new C109097ao(this));
                }
                mo97596l();
                i2 = 113745;
                break;
            default:
                RecyclerView recyclerView3 = recyclerView2;
                recyclerView3.setVisibility(0);
                C108423id idVar3 = idVar;
                c = 1;
                idVar3.mo96869o(recyclerView3);
                recyclerView3.setAdapter(idVar3);
                RecyclerView recyclerView4 = recyclerView3;
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
                linearLayoutManager.setStackFromEnd(true);
                recyclerView4.setLayoutManager(linearLayoutManager);
                this.f303740E = C114034q.m188805a(recyclerView4, new C109098ap(recyclerView4));
                this.f303741F = C114034q.m188806b(recyclerView4, new C109099aq(recyclerView4, this));
                i2 = 66887;
                break;
        }
        c = 1;
        LinearLayout linearLayout9 = this.f303770c;
        C28292j jVar2 = new C28292j(i2);
        jVar2.mo33795i(5);
        C28295m.m52919e(linearLayout9, jVar2);
        C113984c cVar5 = this.f303788u;
        if (!(cVar5 == C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_NEW_USERS || cVar5 == C113984c.OVERAPP_DISCOVERY_QUERY_SUGGESTION || cVar5 == C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_ACTIVATED_USERS || this.f303791x.mo79746e(C90014bt.f247438hE))) {
            mo97595k();
        }
        LinearLayout linearLayout10 = this.f303770c;
        ObjectAnimator b = mo97586b(linearLayout10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout10, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat.setDuration(200);
        ofFloat.setStartDelay(50);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = b;
        animatorArr[c] = ofFloat;
        animatorSet.playTogether(animatorArr);
        Interpolator interpolator = f303735ac;
        animatorSet.setInterpolator(interpolator);
        animatorSet.addListener(new C109084ab(linearLayout10));
        this.f303737B = animatorSet;
        LinearLayout linearLayout11 = this.f303770c;
        ObjectAnimator a = mo97585a(linearLayout11);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout11, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat2.setDuration(200);
        ofFloat2.setStartDelay(30);
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[2];
        animatorArr2[0] = a;
        animatorArr2[c] = ofFloat2;
        animatorSet2.playTogether(animatorArr2);
        animatorSet2.setInterpolator(interpolator);
        animatorSet2.addListener(new C109085ac(linearLayout11));
        this.f303738C = animatorSet2;
        LinearLayout linearLayout12 = this.f303770c;
        C114034q.m188805a(linearLayout12, new C109098ap(linearLayout12));
        LinearLayout linearLayout13 = this.f303770c;
        C114034q.m188806b(linearLayout13, new C109099aq(linearLayout13, this));
    }

    /* renamed from: u */
    static boolean m181605u(C53593bz bzVar) {
        C53585br brVar = bzVar.f140668i;
        if (brVar == null) {
            brVar = C53585br.f140639d;
        }
        if (brVar.f140642b) {
            return true;
        }
        if ((bzVar.f140660a & 32) != 0) {
            C53554an anVar = bzVar.f140666g;
            if (anVar == null) {
                anVar = C53554an.f140545b;
            }
            if (Collection.EL.stream(anVar.f140547a).anyMatch(C109116m.f303865a)) {
                return true;
            }
        }
        if ((bzVar.f140660a & 64) != 0) {
            C53569bb bbVar = bzVar.f140667h;
            if (bbVar == null) {
                bbVar = C53569bb.f140594i;
            }
            if ((bbVar.f140596a & 4) != 0) {
                C113984c cVar = C113984c.UNKNOWN;
                int a = C48470j.m85229a(bbVar.f140599d);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 1;
                if (i == 7 || i == 10 || i == 11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: x */
    private final void m181606x(C53593bz bzVar, boolean z) {
        TextView textView;
        float f;
        int i;
        this.f303770c.setGravity(17);
        this.f303773f.setGravity(17);
        if (z) {
            this.f303779l.setText(this.f303791x.mo79758x(C90037cp.f248522bx));
            this.f303779l.setTypeface(Typeface.create("google-sans-medium", 0));
            this.f303779l.setTextColor(C1878d.m5128a(this.f303790w, R.color.google_grey900));
            this.f303779l.setTextAlignment(4);
            if (TextUtils.isEmpty(this.f303791x.mo79758x(C90037cp.f248515bq))) {
                this.f303779l.setTextSize(0, this.f303790w.getResources().getDimension(R.dimen.greeting_promo_suggestion_title_textsize_without_hero_image));
                this.f303779l.setLineSpacing((float) this.f303790w.getResources().getDimensionPixelSize(R.dimen.greeting_promo_suggestion_title_height_without_hero_image), 1.0f);
            } else {
                this.f303779l.setTextSize(0, this.f303790w.getResources().getDimension(R.dimen.greeting_promo_suggestion_title_textsize));
                this.f303779l.setLineSpacing((float) this.f303790w.getResources().getDimensionPixelSize(R.dimen.greeting_promo_suggestion_title_height), 1.0f);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f303779l.getLayoutParams();
            int dimension = (int) mo97587c().getDimension(R.dimen.greeting_promo_title_text_margin_bottom);
            if (TextUtils.isEmpty(this.f303791x.mo79758x(C90037cp.f248515bq))) {
                dimension = (int) mo97587c().getDimension(R.dimen.greeting_promo_title_text_margin_bottom_without_hero_image);
                i = (int) mo97587c().getDimension(R.dimen.greeting_promo_title_text_margin_top_without_hero_image);
            } else {
                i = 0;
            }
            marginLayoutParams.setMargins((int) mo97587c().getDimension(R.dimen.greeting_promo_title_text_margin_left), i, (int) mo97587c().getDimension(R.dimen.greeting_promo_title_text_margin_right), dimension);
        } else {
            this.f303779l.setText(mo97587c().getString(R.string.opa_first_time_greeting_query_suggestion_message_try_saying));
        }
        C58976aa aaVar = C58975e.f156826a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            spannableStringBuilder.append(bzVar.f140661b);
        } else {
            spannableStringBuilder.append(mo97587c().getString(R.string.opa_first_time_greeting_query_suggestion_quote, new Object[]{bzVar.f140661b}));
        }
        spannableStringBuilder.setSpan(mo97588d(z), 0, spannableStringBuilder.length(), 18);
        if (this.f303791x.mo79746e(C90037cp.f248529cD) || this.f303791x.mo79746e(C90037cp.f248528cC)) {
            this.f303753R.setVisibility(0);
            TextView textView2 = (TextView) this.f303751P.inflate(R.layout.greeting_suggestion_with_icon_text_view, this.f303753R, false);
            ImageView imageView = (ImageView) this.f303751P.inflate(R.layout.greeting_suggestion_icon_image_view, this.f303753R, false);
            this.f303756U.addView(imageView);
            this.f303753R.setBackground(this.f303790w.getResources().getDrawable(R.drawable.border_for_ips_with_icon));
            if ((4 & bzVar.f140660a) == 0 || bzVar.f140663d.isEmpty() || !URLUtil.isValidUrl(bzVar.f140663d)) {
                ((C91189au) this.f303767ag.mo27525b()).mo85421i("https://www.gstatic.com/assistant/static/images/warmer_welcome/recap/search_round_color_48dp.png", imageView);
            } else {
                ((C91189au) this.f303767ag.mo27525b()).mo85421i(bzVar.f140663d, imageView);
            }
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (!this.f303791x.mo79746e(C90037cp.f248528cC) || (bzVar.f140660a & 8) == 0) {
                this.f303753R.addView(textView2);
                ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).setMargins((int) mo97587c().getDimension(R.dimen.greeting_query_suggestion_with_icon_text_margin_left), (int) mo97587c().getDimension(R.dimen.greeting_query_suggestion_with_icon_text_margin_top), (int) mo97587c().getDimension(R.dimen.greeting_query_suggestion_with_icon_text_margin_right), (int) mo97587c().getDimension(R.dimen.greeting_query_suggestion_with_icon_text_margin_bottom));
            } else {
                this.f303754S.setVisibility(0);
                TextView textView3 = (TextView) this.f303751P.inflate(R.layout.greeting_suggestion_with_icon_and_title_text_view, this.f303754S, false);
                this.f303754S.addView(textView3);
                this.f303754S.addView(textView2);
                textView3.setText(bzVar.f140664e);
                ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).setMargins((int) mo97587c().getDimension(R.dimen.greeting_query_suggestion_with_icon_and_title_text_margin_left), (int) mo97587c().getDimension(R.dimen.greeting_query_suggestion_with_icon_and_title_text_margin_top), (int) mo97587c().getDimension(R.dimen.greeting_query_suggestion_with_icon_and_title_text_margin_right), (int) mo97587c().getDimension(R.dimen.greeting_query_suggestion_with_icon_and_title_text_margin_bottom));
            }
            textView = textView2;
        } else {
            this.f303752Q.setVisibility(0);
            textView = (TextView) this.f303751P.inflate(R.layout.greeting_suggestion_text_view, this.f303752Q, false);
            this.f303752Q.addView(textView);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (this.f303791x.mo79746e(C90037cp.f248531cF)) {
                f = mo97587c().getDimension(R.dimen.greeting_query_suggestion_margin_bottom_with_mic_hint);
            } else {
                f = mo97587c().getDimension(R.dimen.greeting_query_suggestion_margin_bottom);
            }
            int i2 = (int) f;
            if (z) {
                marginLayoutParams2.setMargins((int) mo97587c().getDimension(R.dimen.greeting_promo_sub_title_text_margin_left), 0, (int) mo97587c().getDimension(R.dimen.greeting_promo_sub_title_text_margin_right), 0);
            } else {
                marginLayoutParams2.setMargins(0, 0, 0, i2);
            }
        }
        textView.setText(spannableStringBuilder);
        if (z) {
            textView.setTypeface(Typeface.create("google-sans", 0));
            textView.setTextColor(C1878d.m5128a(this.f303790w, R.color.google_grey900));
            textView.setTextSize(0, this.f303790w.getResources().getDimension(R.dimen.greeting_promo_suggestion_sub_title_textsize));
            textView.setLineSpacing((float) this.f303790w.getResources().getDimensionPixelSize(R.dimen.greeting_promo_suggestion_sub_title_height), 1.0f);
        }
        textView.requestLayout();
        if (this.f303791x.mo79746e(C90037cp.f248551cZ) || this.f303791x.mo79746e(C90037cp.f248542cQ)) {
            textView.setOnClickListener(new C109122s(this, textView, bzVar));
        } else if (!this.f303791x.mo79746e(C90037cp.f248539cN) && !z) {
            this.f303770c.setOnClickListener(new C109123t(this, textView, bzVar));
        }
        mo97596l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0173  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m181607y() {
        /*
            r13 = this;
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r0 = r13.f303788u
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.OVERAPP_DISCOVERY_QUERY_SUGGESTION
            if (r0 != r1) goto L_0x0014
            dagger.a r0 = r13.f303749N
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_OVERAPP_INPUT_PLATE_QUERY_SUGGESTION_SHOWN
            r0.mo83702b(r1)
            goto L_0x0021
        L_0x0014:
            dagger.a r0 = r13.f303749N
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_FRE_INPUT_PLATE_QUERY_SUGGESTION_SHOWN
            r0.mo83702b(r1)
        L_0x0021:
            com.google.android.apps.gsa.search.core.i.t r0 = r13.f303791x
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247438hE
            boolean r0 = r0.mo79746e(r1)
            r1 = 4
            if (r0 == 0) goto L_0x0032
            android.widget.LinearLayout r0 = r13.f303772e
            r0.setVisibility(r1)
            goto L_0x0039
        L_0x0032:
            android.widget.LinearLayout r0 = r13.f303772e
            r2 = 8
            r0.setVisibility(r2)
        L_0x0039:
            android.widget.LinearLayout r0 = r13.f303773f
            r2 = 0
            r0.setVisibility(r2)
            com.google.android.apps.gsa.search.core.i.t r0 = r13.f303791x
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248584db
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x0077
            com.airbnb.lottie.LottieAnimationView r0 = r13.f303746K
            if (r0 != 0) goto L_0x0074
            android.widget.LinearLayout r0 = r13.f303770c
            r3 = 2131432112(0x7f0b12b0, float:1.8485972E38)
            android.view.View r0 = r0.findViewById(r3)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x0074
            android.view.View r0 = r0.inflate()
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            r13.f303746K = r0
            com.google.android.apps.gsa.staticplugins.opa.greeting.al r3 = new com.google.android.apps.gsa.staticplugins.opa.greeting.al
            r3.<init>(r13)
            r0.mo9689a(r3)
            com.airbnb.lottie.LottieAnimationView r0 = r13.f303746K
            r0.setVisibility(r2)
            com.airbnb.lottie.LottieAnimationView r0 = r13.f303746K
            r0.mo9695f()
        L_0x0074:
            r13.mo97596l()
        L_0x0077:
            dagger.a r0 = r13.f303749N
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHALKBOARD_SUGGESTIONS_FETCH_REQUEST
            r0.mo83702b(r3)
            com.google.android.apps.gsa.staticplugins.opa.greeting.au r0 = r13.f303739D
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r3 = r13.f303788u
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r4 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_NEW_USERS
            r5 = 1
            if (r3 != r4) goto L_0x0093
            java.lang.String r4 = r13.f303765ae
            if (r4 == 0) goto L_0x0093
        L_0x0091:
            r4 = 1
            goto L_0x00b4
        L_0x0093:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r4 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.OVERAPP_DISCOVERY_QUERY_SUGGESTION
            if (r3 != r4) goto L_0x00a4
            com.google.android.apps.gsa.search.core.i.t r4 = r13.f303791x
            com.google.android.apps.gsa.shared.m.f r6 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248484bL
            long r6 = r4.mo79743a(r6)
            int r4 = com.google.common.p4575r.C60757n.m92740a(r6)
            goto L_0x00b4
        L_0x00a4:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r4 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_ACTIVATED_USERS
            if (r3 != r4) goto L_0x0091
            com.google.android.apps.gsa.search.core.i.t r4 = r13.f303791x
            com.google.android.apps.gsa.shared.m.f r6 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248485bM
            long r6 = r4.mo79743a(r6)
            int r4 = com.google.common.p4575r.C60757n.m92740a(r6)
        L_0x00b4:
            com.google.common.util.concurrent.cx r0 = r0.mo97607a(r3, r4)
            com.google.android.apps.gsa.search.core.i.t r3 = r13.f303791x
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248614j
            long r3 = r3.mo79743a(r4)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.gsa.k.g r7 = r13.f303793z
            com.google.common.util.concurrent.cx r3 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148471e(r0, r3, r6, r7)
            com.google.android.apps.gsa.search.core.i.t r0 = r13.f303791x
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248589dg
            boolean r0 = r0.mo79746e(r4)
            if (r0 == 0) goto L_0x00f2
            com.google.android.apps.gsa.shared.m.b.f r0 = r13.f303760Y
            boolean r0 = r0.mo83823l()
            if (r0 == 0) goto L_0x00f2
            dagger.a r0 = r13.f303757V
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.speech.microdetection.a r0 = (com.google.android.apps.gsa.speech.microdetection.C92486a) r0
            boolean r0 = r0.mo87249w()
            if (r0 != 0) goto L_0x00f2
            com.google.android.apps.gsa.shared.m.b.f r0 = r13.f303760Y
            boolean r0 = r0.mo83879aP()
            if (r0 == 0) goto L_0x00f2
            r6 = 1
            goto L_0x00f3
        L_0x00f2:
            r6 = 0
        L_0x00f3:
            com.google.android.apps.gsa.search.core.i.t r0 = r13.f303791x
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248576cy
            boolean r0 = r0.mo79746e(r4)
            if (r0 == 0) goto L_0x012a
            dagger.a r0 = r13.f303769b
            java.lang.Object r0 = r0.mo27525b()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r4 = "opa_add_shortcut_screen_seen_count"
            int r0 = r0.getInt(r4, r2)
            long r7 = (long) r0
            com.google.android.apps.gsa.search.core.i.t r0 = r13.f303791x
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248572cu
            long r9 = r0.mo79743a(r4)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x012a
            com.google.android.apps.gsa.staticplugins.opa.util.cw r0 = r13.f303766af
            boolean r0 = r0.mo100727a()
            if (r0 != 0) goto L_0x012a
            com.google.android.apps.gsa.staticplugins.opa.widget.impl.c r0 = r13.f303768ah
            boolean r0 = r0.mo101288a()
            if (r0 != 0) goto L_0x012a
            r8 = 1
            goto L_0x012b
        L_0x012a:
            r8 = 0
        L_0x012b:
            if (r6 == 0) goto L_0x013a
            com.google.android.apps.gsa.staticplugins.opa.z.a.i r0 = r13.f303758W
            java.lang.String r4 = "opa_voice_match_button_interaction_count"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            com.google.common.util.concurrent.cx r0 = r0.mo101392b(r4, r7)
            goto L_0x0142
        L_0x013a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0142:
            r4 = r0
            if (r6 == 0) goto L_0x0152
            com.google.android.apps.gsa.staticplugins.opa.z.a.i r0 = r13.f303758W
            java.lang.String r7 = "opa_voice_match_button_impression_count"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            com.google.common.util.concurrent.cx r0 = r0.mo101392b(r7, r9)
            goto L_0x015a
        L_0x0152:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x015a:
            r7 = r0
            com.google.android.apps.gsa.search.core.i.t r0 = r13.f303791x
            com.google.android.apps.gsa.shared.m.f r9 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248590dh
            long r9 = r0.mo79743a(r9)
            int r10 = (int) r9
            if (r8 == 0) goto L_0x0173
            com.google.android.apps.gsa.staticplugins.opa.z.a.i r0 = r13.f303758W
            java.lang.String r9 = "opa_entry_point_button_impression_count"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            com.google.common.util.concurrent.cx r0 = r0.mo101392b(r9, r11)
            goto L_0x017b
        L_0x0173:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x017b:
            r9 = r0
            com.google.common.util.concurrent.cx[] r0 = new com.google.common.util.concurrent.C60870cx[r1]
            r0[r2] = r3
            r0[r5] = r4
            r1 = 2
            r0[r1] = r7
            r1 = 3
            r0[r1] = r9
            com.google.common.util.concurrent.cf r11 = com.google.common.util.concurrent.C60856cj.m92895d(r0)
            com.google.android.apps.gsa.staticplugins.opa.greeting.n r12 = new com.google.android.apps.gsa.staticplugins.opa.greeting.n
            r0 = r12
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r7
            r5 = r9
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.google.android.apps.gsa.staticplugins.opa.greeting.o r0 = new com.google.android.apps.gsa.staticplugins.opa.greeting.o
            r0.<init>(r13)
            com.google.common.util.concurrent.cx r0 = r11.mo57334a(r12, r0)
            com.google.android.libraries.gsa.k.g r1 = r13.f303792y
            com.google.android.apps.gsa.staticplugins.opa.greeting.ak r2 = new com.google.android.apps.gsa.staticplugins.opa.greeting.ak
            r2.<init>(r13)
            java.lang.String r3 = "TbybGreetingContainer showSuggestionAndPromoChipFuture"
            r1.mo28211k(r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.greeting.C109100ar.m181607y():void");
    }

    /* renamed from: a */
    public final ObjectAnimator mo97585a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{0.0f, mo97587c().getDimension(R.dimen.suggestion_carousel_slide_down)});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(f303735ac);
        return ofFloat;
    }

    /* renamed from: b */
    public final ObjectAnimator mo97586b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{mo97587c().getDimension(R.dimen.suggestion_carousel_slide_up), 0.0f});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(f303735ac);
        return ofFloat;
    }

    /* renamed from: c */
    public final Resources mo97587c() {
        return ((C73841bf) this.f303736A.mo27525b()).mo65322a();
    }

    /* renamed from: d */
    public final ForegroundColorSpan mo97588d(boolean z) {
        if (this.f303791x.mo79746e(C90037cp.f248539cN) || z) {
            return new ForegroundColorSpan(C1878d.m5128a(this.f303790w, R.color.google_grey900));
        }
        return new ForegroundColorSpan(C1878d.m5128a(this.f303790w, R.color.google_blue700));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Optional mo97589e(C8606b bVar) {
        String x = this.f303791x.mo79758x(C90037cp.f248523by);
        if (x.length() == 0) {
            return Optional.empty();
        }
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C59326i.f157516d.mo56836k(x))));
            byte[] doFinal = instance.doFinal(bVar.toByteArray());
            return Optional.m71637of(C59326i.f157517e.mo56826f().mo56837l(doFinal, doFinal.length));
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new IllegalStateException("Encryption error", e);
        }
    }

    /* renamed from: f */
    public final void mo97590f(View.OnClickListener onClickListener, int i) {
        LinearLayout linearLayout = this.f303755T;
        C28292j jVar = new C28292j(i);
        jVar.mo33795i(5);
        C28295m.m52919e(linearLayout, jVar);
        this.f303755T.setOnClickListener(new C89943l(onClickListener));
        TextView textView = (TextView) this.f303752Q.findViewById(R.id.query_suggestion_text);
        float dimension = mo97587c().getDimension(R.dimen.greeting_promo_button_margin_top);
        textView.requestLayout();
        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMargins(0, 0, 0, (int) dimension);
    }

    /* renamed from: g */
    public final void mo97591g(View view, C53593bz bzVar) {
        if (this.f303788u == C113984c.OVERAPP_DISCOVERY_QUERY_SUGGESTION) {
            C28292j jVar = new C28292j(97416);
            jVar.mo33795i(5);
            jVar.mo33795i(18);
            C28295m.m52919e(view, jVar);
        } else {
            C113984c cVar = this.f303788u;
            if (cVar == C113984c.NEST_PROMO_SUGGESTION) {
                C28292j jVar2 = new C28292j(113744);
                jVar2.mo33795i(5);
                C28295m.m52919e(view, jVar2);
            } else if (cVar == C113984c.APP_ACTIONS_SUGGESTION) {
                C28292j jVar3 = new C28292j(103977);
                jVar3.mo33795i(5);
                C28295m.m52919e(view, jVar3);
            } else {
                C28292j jVar4 = new C28292j(88122);
                jVar4.mo33795i(5);
                jVar4.mo33795i(18);
                C28295m.m52919e(view, jVar4);
            }
        }
        C28292j a = C28295m.m52915a(view);
        if (a != null && (bzVar.f140660a & 64) != 0) {
            C53569bb bbVar = bzVar.f140667h;
            if (bbVar == null) {
                bbVar = C53569bb.f140594i;
            }
            C48461a a2 = j.a(bbVar);
            int ordinal = this.f303788u.ordinal();
            if (ordinal == 5) {
                C48468h hVar = C48468h.NEW_USER_INPUT_PLATE;
                a2.copyOnWrite();
                C48462b bVar = (C48462b) a2.instance;
                C48462b bVar2 = C48462b.f125188k;
                bVar.f125199i = hVar.f125214h;
                bVar.f125191a |= 64;
            } else if (ordinal == 7) {
                C48468h hVar2 = C48468h.OVERAPP_SUGGESTION_INPUT_PLATE;
                a2.copyOnWrite();
                C48462b bVar3 = (C48462b) a2.instance;
                C48462b bVar4 = C48462b.f125188k;
                bVar3.f125199i = hVar2.f125214h;
                bVar3.f125191a |= 64;
            } else if (ordinal == 8) {
                C48468h hVar3 = C48468h.ACTIVATED_USER_INPUT_PLATE;
                a2.copyOnWrite();
                C48462b bVar5 = (C48462b) a2.instance;
                C48462b bVar6 = C48462b.f125188k;
                bVar5.f125199i = hVar3.f125214h;
                bVar5.f125191a |= 64;
            }
            Account a3 = ((C86054o) this.f303742G.mo27525b()).mo79668a();
            if (a3 != null) {
                String languageTag = ((ae) this.f303743H.mo27525b()).d(a3.name).toLanguageTag();
                a2.copyOnWrite();
                C48462b bVar7 = (C48462b) a2.instance;
                C48462b bVar8 = C48462b.f125188k;
                languageTag.getClass();
                bVar7.f125191a |= 32;
                bVar7.f125196f = languageTag;
            } else {
                String locale = Locale.getDefault().toString();
                a2.copyOnWrite();
                C48462b bVar9 = (C48462b) a2.instance;
                C48462b bVar10 = C48462b.f125188k;
                locale.getClass();
                bVar9.f125191a |= 32;
                bVar9.f125196f = locale;
            }
            this.f303762aa = Optional.m71637of((C48462b) a2.build());
            a.f76974b.mo58885m(C48462b.f125189l, (C48462b) this.f303762aa.get());
        }
    }

    /* renamed from: h */
    public final void mo97592h(boolean z) {
        if (this.f303788u != C113984c.TRY_BEFORE_YOU_BUY_SUGGESTION) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (z) {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f303776i.setText(mo97587c().getText(R.string.opa_first_time_greeting_message_2));
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            this.f303776i.setText(mo97587c().getText(R.string.opa_first_time_greeting_message_2_mic_closed));
        }
    }

    /* renamed from: i */
    public final void mo97593i() {
        Animator animator;
        Animator animator2;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f303788u == C113984c.TRY_BEFORE_YOU_BUY_SUGGESTION && (animator = this.f303740E) != null && (animator2 = this.f303741F) != null) {
            C114034q.m188811g(this.f303771d, animator, animator2);
        }
    }

    /* renamed from: j */
    public final void mo97594j(C89849ae aeVar) {
        if (this.f303750O != null) {
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            String str = this.f303750O;
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            str.getClass();
            cbVar.f160062a |= 256;
            cbVar.f160132m = str;
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            fVar.f246203c = (C59687cb) ajVar.build();
            ((C89859i) this.f303749N.mo27525b()).mo74236a(fVar.mo83699a());
            return;
        }
        ((C89859i) this.f303749N.mo27525b()).mo83702b(aeVar);
    }

    /* renamed from: k */
    public final void mo97595k() {
        C89949q.m146521e(C28285c.m52874a(this.f303770c, 67674), false);
    }

    /* renamed from: l */
    public final void mo97596l() {
        this.f303770c.getViewTreeObserver().addOnGlobalLayoutListener(new C109086ad(this));
    }

    /* renamed from: m */
    public final void mo97597m() {
        C58976aa aaVar = C58975e.f156826a;
        this.f303776i.setVisibility(0);
    }

    /* renamed from: n */
    public final void mo97598n() {
        C58976aa aaVar = C58975e.f156826a;
        this.f303782o.setVisibility(0);
    }

    /* renamed from: o */
    public final void mo97599o() {
        C58976aa aaVar = C58975e.f156826a;
        String[] stringArray = mo97587c().getStringArray(R.array.opa_first_time_greeting_query_suggestion_word_array);
        String[] stringArray2 = mo97587c().getStringArray(R.array.opa_first_time_greeting_query_suggestion_message_array);
        String[] stringArray3 = mo97587c().getStringArray(R.array.opa_first_time_greeting_query_suggestion_user_intent_array);
        String[] stringArray4 = mo97587c().getStringArray(R.array.opa_first_time_greeting_query_suggestion_icon_url_array);
        int nextInt = new Random().nextInt(stringArray.length);
        C53592by byVar = (C53592by) C53593bz.f140658j.createBuilder();
        String str = stringArray[nextInt];
        byVar.copyOnWrite();
        C53593bz bzVar = (C53593bz) byVar.instance;
        str.getClass();
        bzVar.f140660a |= 2;
        bzVar.f140662c = str;
        String str2 = stringArray2[nextInt];
        byVar.copyOnWrite();
        C53593bz bzVar2 = (C53593bz) byVar.instance;
        str2.getClass();
        bzVar2.f140660a |= 1;
        bzVar2.f140661b = str2;
        C53568ba baVar = (C53568ba) C53569bb.f140594i.createBuilder();
        String str3 = stringArray2[nextInt];
        baVar.copyOnWrite();
        C53569bb bbVar = (C53569bb) baVar.instance;
        str3.getClass();
        bbVar.f140596a |= 1;
        bbVar.f140597b = str3;
        baVar.copyOnWrite();
        C53569bb bbVar2 = (C53569bb) baVar.instance;
        bbVar2.f140599d = 5;
        bbVar2.f140596a |= 4;
        String str4 = stringArray3[nextInt];
        baVar.copyOnWrite();
        C53569bb bbVar3 = (C53569bb) baVar.instance;
        str4.getClass();
        bbVar3.f140596a |= 2;
        bbVar3.f140598c = str4;
        C53569bb bbVar4 = (C53569bb) baVar.build();
        byVar.copyOnWrite();
        C53593bz bzVar3 = (C53593bz) byVar.instance;
        bbVar4.getClass();
        bzVar3.f140667h = bbVar4;
        bzVar3.f140660a |= 64;
        String str5 = stringArray4[nextInt];
        byVar.copyOnWrite();
        C53593bz bzVar4 = (C53593bz) byVar.instance;
        str5.getClass();
        bzVar4.f140660a |= 4;
        bzVar4.f140663d = str5;
        C53593bz bzVar5 = (C53593bz) byVar.build();
        m181606x(bzVar5, false);
        TextView textView = (TextView) this.f303752Q.findViewById(R.id.query_suggestion_text);
        if (this.f303791x.mo79746e(C90037cp.f248529cD)) {
            textView = (TextView) this.f303753R.findViewById(R.id.query_suggestion_with_icon_text);
        }
        mo97591g(textView, bzVar5);
    }

    /* renamed from: q */
    public final void mo97601q(C53593bz bzVar) {
        String str;
        C53585br brVar = bzVar.f140668i;
        if (brVar == null) {
            brVar = C53585br.f140639d;
        }
        if ((brVar.f140641a & 2) != 0) {
            C53585br brVar2 = bzVar.f140668i;
            if (brVar2 == null) {
                brVar2 = C53585br.f140639d;
            }
            str = brVar2.f140643c;
        } else {
            str = this.f303791x.mo79758x(C90037cp.f248593dk);
        }
        if (!str.isEmpty()) {
            this.f303781n.setVisibility(0);
            this.f303781n.setOnClickListener(new C109110g(this, str));
        }
    }

    /* renamed from: r */
    public final void mo97602r() {
        this.f303775h.setText(mo97587c().getText(R.string.opa_first_time_greeting_video_message));
        this.f303772e.setVisibility(0);
        this.f303776i.setVisibility(8);
        this.f303773f.setVisibility(8);
        this.f303783p.setVisibility(0);
        C89949q.m146521e(C28285c.m52874a(this.f303783p, 67674), false);
    }

    /* renamed from: s */
    public final void mo97603s() {
        if (this.f303784q.isPlaying()) {
            this.f303784q.stopPlayback();
        }
        this.f303783p.setVisibility(8);
        Intent intent = new Intent(this.f303790w, TbybGreetingVideoActivity.class);
        if (this.f303791x.mo79746e(C90014bt.f247439hF)) {
            Set<String> stringSet = ((SharedPreferences) this.f303769b.mo27525b()).getStringSet("watched_nbu_onboarding_video_url_set", new HashSet());
            C58485gu c = this.f303791x.mo79745c(C90014bt.f247440hG);
            Optional findFirst = Collection.EL.stream(c).filter(new C109124u(stringSet)).findFirst();
            if (findFirst.isPresent()) {
                String str = (String) findFirst.get();
                intent.putExtra("fullscreenVideoUrl", str);
                if (Collection.EL.stream(c).anyMatch(new C109126w(str, stringSet))) {
                    intent.putExtra("nextVideoIndex", 1);
                }
                this.f303789v.mo65090b(intent, new C109090ah(this, stringSet, str));
                return;
            }
            C59104x c2 = f303734a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "TbybGreetingContainer");
            ((C59052c) ((C59052c) c2).mo56372aa(24530)).mo56389s("Error in getting the available video urls in list: %s. None of available NBU onboarding video urls exists while trying to play the video.", c);
            this.f303763ab.mo97161a();
            return;
        }
        intent.putExtra("fullscreenVideoUrl", this.f303791x.mo79758x(C90014bt.f247682lk));
        this.f303789v.mo65090b(intent, new C109087ae(this));
    }

    /* renamed from: t */
    public final void mo97604t() {
        synchronized (this.f303784q) {
            if (!this.f303744I) {
                if (this.f303745J) {
                    this.f303785r.setVisibility(8);
                    this.f303784q.start();
                } else {
                    this.f303763ab.mo97161a();
                }
                this.f303744I = true;
            }
        }
    }

    /* renamed from: v */
    public final void mo97605v() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f303788u == C113984c.TRY_BEFORE_YOU_BUY_VIDEO && this.f303784q.isPlaying()) {
            this.f303784q.stopPlayback();
        }
        C114034q.m188812h(this.f303737B);
        if (this.f303747L) {
            this.f303770c.isShown();
            C114034q.m188812h(this.f303738C);
            this.f303770c.setVisibility(8);
        }
        this.f303747L = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo97606w(View view, CharSequence charSequence) {
        if (this.f303747L && !this.f303748M && !this.f303761Z) {
            this.f303761Z = true;
            C58976aa aaVar = C58975e.f156826a;
            C89949q.m146521e(C28285c.m52882i(view, 5, (Integer) null), false);
            C108779dm dmVar = this.f303763ab;
            Bundle g = dmVar.f302503a.mo97535g();
            g.putInt("android.opa.extra.TRIGGERED_BY", 75);
            dmVar.f302503a.mo97549v(charSequence, QueryTriggerType.USER, g, (String) null);
            mo97594j(C89849ae.OPA_FRE_INPUT_PLATE_QUERY_SUGGESTION_CLICKED);
        }
    }

    /* renamed from: p */
    public final void mo97600p(C53593bz bzVar, boolean z) {
        boolean z2 = true;
        if ((bzVar.f140660a & 1) != 0) {
            this.f303770c.setGravity(17);
            C109103au auVar = this.f303739D;
            C113984c cVar = this.f303788u;
            C53569bb bbVar = bzVar.f140667h;
            if (bbVar == null) {
                bbVar = C53569bb.f140594i;
            }
            int a = C48470j.m85229a(bbVar.f140599d);
            if (a == 0 || a != 19) {
                z2 = false;
            }
            auVar.mo97608b(cVar, z2);
            m181606x(bzVar, z);
            TextView textView = (TextView) this.f303752Q.findViewById(R.id.query_suggestion_text);
            if (this.f303791x.mo79746e(C90037cp.f248529cD)) {
                textView = (TextView) this.f303753R.findViewById(R.id.query_suggestion_with_icon_text);
            }
            mo97591g(textView, bzVar);
            if (m181605u(bzVar)) {
                mo97601q(bzVar);
            }
            C53569bb bbVar2 = bzVar.f140667h;
            if (bbVar2 == null) {
                bbVar2 = C53569bb.f140594i;
            }
            int a2 = C48470j.m85229a(bbVar2.f140599d);
            if (a2 != 0 && a2 == 19) {
                ((C89859i) this.f303749N.mo27525b()).mo83702b(C89849ae.OVERAPP_PLATE_AFTER_NUDGE_REQUESTED);
                ((C89859i) this.f303749N.mo27525b()).mo83702b(C89849ae.OVERAPP_PLATE_AFTER_NUDGE_DISPLAYED);
                return;
            }
            return;
        }
        ((C89859i) this.f303749N.mo27525b()).mo83702b(C89849ae.OPA_CHALKBOARD_SUGGESTIONS_FETCH_EMPTY);
        mo97599o();
    }
}
