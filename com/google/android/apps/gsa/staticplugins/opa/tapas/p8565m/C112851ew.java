package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p033v7.widget.C0673gh;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.C9347ar;
import com.google.android.apps.gsa.assist.C9405d;
import com.google.android.apps.gsa.assist.C9410f;
import com.google.android.apps.gsa.assistant.shared.p.l;
import com.google.android.apps.gsa.assistant.shared.p5826p.C73897c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.p7148ui.RoundCornerImageView;
import com.google.android.apps.gsa.shared.p7195y.C91227s;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7183s.C91088a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113255ah;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113362dc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113365df;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113375dp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8577a.C113247a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113322s;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113323t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113324u;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p11002ag.C147575e;
import com.google.android.libraries.p11002ag.C147576f;
import com.google.android.libraries.searchbox.shared.suggestion.C41663ac;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ew */
/* compiled from: PG */
public final class C112851ew implements C113342cm {

    /* renamed from: a */
    public static final C59071e f312789a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.ew");

    /* renamed from: k */
    private static final int f312790k = Color.rgb(173, 173, 173);

    /* renamed from: b */
    public final Context f312791b;

    /* renamed from: c */
    public final C22871g f312792c;

    /* renamed from: d */
    public final C68214a f312793d;

    /* renamed from: e */
    public final C91088a f312794e;

    /* renamed from: f */
    public final l f312795f;

    /* renamed from: g */
    public final InputMethodManager f312796g;

    /* renamed from: h */
    public final C112794ct f312797h;

    /* renamed from: i */
    public final C112694be f312798i;

    /* renamed from: j */
    public final C113375dp f312799j;

    /* renamed from: l */
    private final C113367dh f312800l;

    /* renamed from: m */
    private final C91097g f312801m;

    /* renamed from: n */
    private final C113324u f312802n;

    /* renamed from: o */
    private final C73897c f312803o;

    /* renamed from: p */
    private final C113247a f312804p;

    /* renamed from: q */
    private final C86124t f312805q;

    /* renamed from: r */
    private final int f312806r;

    /* renamed from: s */
    private int f312807s;

    /* renamed from: t */
    private final C91227s f312808t;

    public C112851ew(Context context, C113367dh dhVar, C91097g gVar, C22871g gVar2, C113324u uVar, C68214a aVar, C91088a aVar2, C73897c cVar, l lVar, C91227s sVar, C113247a aVar3, C86124t tVar, C112794ct ctVar, C112694be beVar, C113375dp dpVar) {
        this.f312791b = context;
        this.f312800l = dhVar;
        this.f312801m = gVar;
        this.f312792c = gVar2;
        this.f312802n = uVar;
        this.f312793d = aVar;
        this.f312794e = aVar2;
        this.f312803o = cVar;
        this.f312795f = lVar;
        this.f312796g = (InputMethodManager) context.getSystemService("input_method");
        this.f312808t = sVar;
        this.f312804p = aVar3;
        this.f312805q = tVar;
        this.f312797h = ctVar;
        this.f312798i = beVar;
        this.f312799j = dpVar;
        this.f312806r = context.getResources().getDimensionPixelSize(R.dimen.tapas_suggestion_circle_icon_padding);
    }

    /* renamed from: o */
    private static String m186766o(C113323t tVar) {
        String str = (String) tVar.mo100098a().orElse(null);
        return TextUtils.isEmpty(str) ? tVar.mo100104f() : str;
    }

    /* renamed from: p */
    private final void m186767p(ImageView imageView, String str) {
        String b = this.f312802n.mo100116b(str);
        C113367dh dhVar = this.f312800l;
        C113362dc d = C113363dd.m187554d();
        d.mo99987d(C113365df.m187558c(C113259al.m187318c(b)));
        dhVar.mo100144d(imageView, d.mo99984a());
    }

    /* renamed from: q */
    private static void m186768q(TextView textView, String str) {
        if (str != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    /* renamed from: r */
    private final void m186769r(C113408es esVar, C0673gh ghVar, List list, C113415ez ezVar) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C113321r rVar = (C113321r) it.next();
                C113320q a = C113320q.m187477a(rVar.f313837d);
                if (a == null) {
                    a = C113320q.UNRECOGNIZED;
                }
                if (a == C113320q.TEXT) {
                    arrayList.add(rVar);
                } else {
                    C113320q a2 = C113320q.m187477a(rVar.f313837d);
                    if (a2 == null) {
                        a2 = C113320q.UNRECOGNIZED;
                    }
                    if (a2 == C113320q.CALL) {
                        arrayList2.add(rVar);
                    }
                }
            }
            View view = ghVar.itemView;
            ImageView imageView = (ImageView) view.findViewById(R.id.call_icon);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.message_icon);
            if (!arrayList.isEmpty()) {
                C113367dh dhVar = this.f312800l;
                C113362dc d = C113363dd.m187554d();
                d.mo99987d(C113365df.m187559d(new C113255ah(R.drawable.quantum_ic_message_grey600_24), this.f312806r));
                dhVar.mo100144d(imageView2, d.mo99984a());
                this.f312798i.mo99657h(imageView2, ezVar.mo100206f());
                if (arrayList.size() == 1) {
                    imageView2.setOnClickListener(new C112835eg(this, ezVar, esVar, ghVar, (C113321r) arrayList.get(0)));
                } else {
                    imageView2.setOnClickListener(new C112837ei(this, imageView2, arrayList, ezVar, esVar, ghVar));
                }
            }
            C113367dh dhVar2 = this.f312800l;
            C113362dc d2 = C113363dd.m187554d();
            d2.mo99987d(C113365df.m187559d(new C113255ah(R.drawable.quantum_ic_call_grey600_24), this.f312806r));
            dhVar2.mo100144d(imageView, d2.mo99984a());
            C112694be beVar = this.f312798i;
            if (ezVar.mo100206f() == 10019) {
                beVar.mo99660k(imageView, 85776);
            }
            if (arrayList2.size() == 1) {
                imageView.setOnClickListener(new C112842en(this, ezVar, esVar, ghVar, arrayList2));
            } else {
                imageView.setOnClickListener(new C112844ep(this, imageView, arrayList2, ezVar, esVar, ghVar));
            }
        }
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.on_device_contact_item;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        int i = this.f312807s;
        if (i == 10006 || i == 10019 || i == 10041) {
            return 85781;
        }
        return i != 20001 ? -1 : 85774;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112850ev(view);
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo99715d(C113415ez ezVar) {
        return Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ Optional mo99716e(C0673gh ghVar) {
        return Optional.empty();
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo99717g(C113415ez ezVar, View view) {
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        String str;
        C113408es esVar2 = esVar;
        C113415ez ezVar2 = ezVar;
        C0673gh ghVar2 = ghVar;
        C112850ev evVar = (C112850ev) ghVar2;
        Optional t = ezVar.mo100220t();
        int f = ezVar.mo100206f();
        this.f312807s = f;
        if (f != 10006) {
            String str2 = null;
            if (f == 10019) {
                TextView textView = evVar.f312785b;
                C41663ac acVar = ezVar.mo100209i().f109008b;
                if (acVar == null) {
                    acVar = C41663ac.f108934g;
                }
                if ((acVar.f108936a & 1) != 0) {
                    str = acVar.f108939d;
                } else {
                    Optional D = ezVar.mo100191D();
                    if (D.isPresent()) {
                        C54216ae aeVar = ((C54228aq) D.get()).f142334f;
                        if (aeVar == null) {
                            aeVar = C54216ae.f142285C;
                        }
                        if ((aeVar.f142290a & 8) != 0) {
                            C54216ae aeVar2 = ((C54228aq) D.get()).f142334f;
                            if (aeVar2 == null) {
                                aeVar2 = C54216ae.f142285C;
                            }
                            str2 = aeVar2.f142294e;
                        }
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str = ezVar.mo100199L();
                    } else {
                        str = str2;
                    }
                }
                m186768q(textView, str);
                ImageView imageView = evVar.f312784a;
                C41663ac acVar2 = ezVar.mo100209i().f109008b;
                if (acVar2 == null) {
                    acVar2 = C41663ac.f108934g;
                }
                int i = acVar2.f108937b;
                if (i == 4) {
                    int intValue = ((Integer) acVar2.f108938c).intValue();
                    imageView.setColorFilter(f312790k);
                    C113367dh dhVar = this.f312800l;
                    C113362dc d = C113363dd.m187554d();
                    d.mo99987d(C113365df.m187558c(new C113255ah(intValue)));
                    d.mo99988e(true);
                    dhVar.mo100144d(imageView, d.mo99984a());
                } else {
                    String str3 = i == 3 ? (String) acVar2.f108938c : BuildConfig.FLAVOR;
                    if (TextUtils.isEmpty(str3) || "android.resource://android/drawable/ic_contact_picture".equals(str3)) {
                        C113367dh.m187565e(imageView, ezVar.mo100199L());
                    } else {
                        C113367dh dhVar2 = this.f312800l;
                        C113362dc d2 = C113363dd.m187554d();
                        d2.mo99987d(C113365df.m187558c(C113259al.m187318c(str3)), C113365df.m187558c(C113259al.m187318c("android.resource://android/drawable/ic_contact_picture")));
                        d2.mo99988e(true);
                        dhVar2.mo100144d(imageView, d2.mo99984a());
                    }
                }
                if (!t.isEmpty() && !((List) t.get()).isEmpty()) {
                    m186769r(esVar, ghVar2, (List) t.get(), ezVar2);
                    return;
                }
                return;
            } else if (f != 10041) {
                if (f == 20001 && ezVar.mo100215o().isPresent()) {
                    C113323t tVar = (C113323t) ezVar.mo100215o().get();
                    ImageView imageView2 = evVar.f312784a;
                    String o = m186766o(tVar);
                    if (o != null) {
                        try {
                            C147576f.m240621c().mo124320f(o, Locale.getDefault().getCountry());
                        } catch (C147575e unused) {
                            str2 = o;
                        }
                        C113367dh.m187565e(imageView2, str2);
                    }
                    m186767p(evVar.f312786c, tVar.mo100105g());
                    m186768q(evVar.f312785b, m186766o(tVar));
                    m186768q(evVar.f312787d, tVar.mo100102e());
                    ImageView imageView3 = evVar.f312788e;
                    C113367dh dhVar3 = this.f312800l;
                    C113362dc d3 = C113363dd.m187554d();
                    d3.mo99987d(C113365df.m187559d(new C113255ah(R.drawable.quantum_ic_message_grey600_24), this.f312806r));
                    dhVar3.mo100144d(imageView3, d3.mo99984a());
                    imageView3.setOnClickListener(new C112847es(this, ezVar, esVar, ghVar, tVar, gVar));
                    return;
                }
                return;
            }
        }
        if (!t.isEmpty() && !((List) t.get()).isEmpty()) {
            m186768q(evVar.f312785b, ((C113321r) ((List) t.get()).get(0)).f313834a);
            ImageView imageView4 = evVar.f312784a;
            C113321r rVar = (C113321r) ((List) t.get()).get(0);
            if (!rVar.f313836c.isEmpty()) {
                C113367dh dhVar4 = this.f312800l;
                C113362dc d4 = C113363dd.m187554d();
                d4.mo99987d(C113365df.m187558c(C113259al.m187318c(rVar.f313836c)), C113365df.m187558c(C113259al.m187318c("android.resource://android/drawable/ic_contact_picture")));
                d4.mo99988e(true);
                dhVar4.mo100144d(imageView4, d4.mo99984a());
            } else if (!rVar.f313834a.isEmpty()) {
                C113367dh.m187565e(imageView4, String.valueOf(rVar.f313834a.charAt(0)));
            } else {
                C113367dh dhVar5 = this.f312800l;
                C113362dc d5 = C113363dd.m187554d();
                d5.mo99987d(C113365df.m187558c(C113259al.m187318c("android.resource://android/drawable/ic_contact_picture")));
                d5.mo99988e(true);
                dhVar5.mo100144d(imageView4, d5.mo99984a());
            }
            m186769r(esVar, ghVar2, (List) t.get(), ezVar2);
        }
    }

    /* renamed from: i */
    public final boolean mo99718i() {
        return true;
    }

    /* renamed from: j */
    public final void mo99761j(ImageView imageView, boolean z) {
        imageView.setEnabled(z);
        int a = this.f312803o.mo65405a();
        if (z) {
            imageView.setBackgroundColor(this.f312791b.getResources().getColor(R.color.tapas_icon_background_enabled));
            if (a != 1) {
                imageView.setImageDrawable(this.f312791b.getDrawable(R.drawable.quantum_ic_send_white_24));
                return;
            }
            return;
        }
        imageView.setBackgroundColor(this.f312791b.getResources().getColor(R.color.tapas_icon_background_disabled));
        if (a != 1) {
            imageView.setImageDrawable(this.f312791b.getDrawable(R.drawable.quantum_ic_send_grey600_24));
        }
    }

    /* renamed from: k */
    public final void mo99762k(View view, C112849eu euVar, C113321r rVar) {
        View view2 = view;
        C112849eu euVar2 = euVar;
        C113321r rVar2 = rVar;
        String str = null;
        View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.on_device_contact_item, (ViewGroup) null, false);
        inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.item_icon);
        Drawable drawable = ((ImageView) view2.findViewById(R.id.item_icon)).getDrawable();
        if (drawable != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.item_title);
        CharSequence text = ((TextView) view2.findViewById(R.id.item_title)).getText();
        if (text != null) {
            textView.setText(text.toString());
            textView.setVisibility(0);
        }
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.item_icon_badge);
        Drawable drawable2 = ((ImageView) view2.findViewById(R.id.item_icon_badge)).getDrawable();
        if (rVar2 != null) {
            m186767p(imageView2, rVar2.f313843j);
        } else if (drawable2 != null) {
            imageView2.setVisibility(0);
            imageView2.setImageDrawable(drawable2);
        }
        EditText editText = (EditText) inflate.findViewById(R.id.item_edit_content);
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.send_icon);
        int a = this.f312803o.mo65405a();
        C113367dh dhVar = this.f312800l;
        C113362dc d = C113363dd.m187554d();
        C113365df[] dfVarArr = new C113365df[1];
        dfVarArr[0] = C113365df.m187559d(new C113255ah(a == 1 ? R.drawable.quantum_ic_send_white_24 : R.drawable.quantum_ic_send_grey600_24), this.f312806r);
        d.mo99987d(dfVarArr);
        dhVar.mo100144d(imageView3, d.mo99984a());
        if (this.f312805q.mo79746e(C90063do.f249464dy)) {
            C9410f fVar = this.f312804p.f313603a.f32346g;
            String str2 = (fVar == null || fVar.f32696e.size() <= 0) ? null : ((C9405d) fVar.f32696e.get(0)).f32679e;
            C9410f fVar2 = this.f312804p.f313603a.f32346g;
            if (fVar2 != null && fVar2.f32696e.size() > 0) {
                Iterator it = ((C9405d) fVar2.f32696e.get(0)).f32677c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String a2 = C113247a.m187289a((C9347ar) it.next(), 0);
                        if (a2 != null) {
                            str = a2;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.web_suggestion_message_layout);
                linearLayout.setVisibility(0);
                C90873ag agVar = new C90873ag(this.f312808t.mo85510a(String.format("https://www.google.com/s2/favicons?domain_url=%s&sz=%s", new Object[]{str2, 96}), 18), this.f312792c, "Get Favicon", new C112829ea((RoundCornerImageView) inflate.findViewById(R.id.web_suggestion_message_icon)));
                agVar.mo85224b(TimeoutException.class, C112830eb.f312725a);
                agVar.mo85223a(C112831ec.f312726a);
                TextView textView2 = (TextView) inflate.findViewById(R.id.web_suggestion_message_title);
                if (str == null) {
                    str = "TITLE NOT FOUND";
                }
                textView2.setText(str);
                textView2.setVisibility(0);
                TextView textView3 = (TextView) inflate.findViewById(R.id.web_suggestion_message_url);
                textView3.setText(str2);
                textView3.setVisibility(0);
                RoundCornerImageView roundCornerImageView = (RoundCornerImageView) inflate.findViewById(R.id.web_suggestion_message_dismiss_button);
                if (this.f312803o.mo65405a() == 1) {
                    roundCornerImageView.setImageDrawable(this.f312791b.getDrawable(R.drawable.quantum_ic_close_white_24));
                } else {
                    roundCornerImageView.setImageDrawable(this.f312791b.getDrawable(R.drawable.quantum_ic_close_grey600_24));
                }
                roundCornerImageView.setVisibility(0);
                roundCornerImageView.setOnClickListener(new C112841em(linearLayout));
            }
        }
        mo99761j(imageView3, false);
        imageView3.setOnClickListener(new C112839ek(euVar2, editText));
        editText.getText().clear();
        editText.setVisibility(0);
        editText.post(new C112833ee(this, editText));
        editText.requestFocus();
        this.f312795f.h(false);
        editText.addTextChangedListener(new C112840el(this, imageView3));
        editText.setOnEditorActionListener(new C112832ed(euVar2));
        this.f312799j.mo99374d(inflate, view2, new FrameLayout.LayoutParams(view.getWidth(), -2), 1);
    }

    /* renamed from: l */
    public final void mo99763l(View view, List list, C112848et etVar) {
        ScrollView scrollView = new ScrollView(this.f312791b);
        LinearLayout linearLayout = new LinearLayout(this.f312791b);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        linearLayout.setOrientation(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C113321r rVar = (C113321r) it.next();
            View inflate = LayoutInflater.from(this.f312791b).inflate(R.layout.contact_app_info, linearLayout, false);
            C113367dh dhVar = this.f312800l;
            C113362dc d = C113363dd.m187554d();
            d.mo99987d(C113365df.m187558c(C113259al.m187318c(rVar.f313844k)));
            d.mo99988e(true);
            dhVar.mo100144d((ImageView) inflate.findViewById(R.id.app_icon), d.mo99984a());
            TextView textView = (TextView) inflate.findViewById(R.id.app_title);
            TextView textView2 = (TextView) inflate.findViewById(R.id.app_details);
            if (!rVar.f313842i.isEmpty()) {
                textView.setText(rVar.f313842i);
            }
            if (!rVar.f313835b.isEmpty()) {
                String str = rVar.f313835b;
                String simCountryIso = ((TelephonyManager) this.f312791b.getSystemService("phone")).getSimCountryIso();
                if (TextUtils.isEmpty(simCountryIso) && Locale.getDefault() != null) {
                    simCountryIso = Locale.getDefault().getCountry();
                }
                textView2.setText(PhoneNumberUtils.formatNumber(str, TextUtils.isEmpty(simCountryIso) ? "US" : simCountryIso.toUpperCase(Locale.US)));
            }
            inflate.setOnClickListener(new C112834ef(this, etVar, rVar));
            linearLayout.addView(inflate);
        }
        scrollView.addView(linearLayout);
        this.f312799j.mo99374d(scrollView, view, (FrameLayout.LayoutParams) null, 2);
    }

    /* renamed from: m */
    public final void mo99764m(C113321r rVar) {
        Intent intent;
        C113320q a = C113320q.m187477a(rVar.f313837d);
        if (a == null) {
            a = C113320q.UNRECOGNIZED;
        }
        if (a != C113320q.CALL || !"vnd.android.cursor.item/vnd.com.whatsapp.voip.call".equals(rVar.f313839f)) {
            C113320q a2 = C113320q.m187477a(rVar.f313837d);
            if (a2 == null) {
                a2 = C113320q.UNRECOGNIZED;
            }
            if (a2 == C113320q.CALL) {
                this.f312801m.mo65089a(new Intent("android.intent.action.CALL", Uri.parse("tel:".concat(String.valueOf(rVar.f313835b)))));
                return;
            }
            return;
        }
        if (rVar.f313841h.isEmpty()) {
            ((C59052c) ((C59052c) C113322s.f313847a.mo56225c()).mo56372aa(27859)).mo56386p("No data Id is set for voice intent");
            intent = null;
        } else {
            intent = new Intent("android.intent.action.VIEW").setPackage("com.whatsapp").setDataAndType(new Uri.Builder().scheme("content").authority("com.android.contacts").appendPath("data").appendPath(rVar.f313841h).build(), "vnd.android.cursor.item/vnd.com.whatsapp.voip.call");
        }
        if (intent != null) {
            this.f312801m.mo65089a(intent);
        } else {
            Toast.makeText(this.f312791b, "Fail to make a call", 1).show();
        }
    }

    /* renamed from: n */
    public final void mo99765n(C0673gh ghVar, C113321r rVar) {
        mo99762k(ghVar.itemView, new C112838ej(this, rVar), rVar);
    }
}
