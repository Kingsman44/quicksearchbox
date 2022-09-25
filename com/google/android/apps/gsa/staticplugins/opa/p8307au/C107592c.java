package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.logger.p7065j.C89935f;
import com.google.android.apps.gsa.shared.logger.p7065j.C89938i;
import com.google.android.apps.gsa.shared.p7066m.C90024cc;
import com.google.android.apps.gsa.staticplugins.opa.p8307au.p8309b.C107589a;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51074fk;
import com.google.assistant.p3897e.p3902c.p3907c.C51075fl;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.p3926e.C51844be;
import com.google.assistant.p3897e.p3921j.p3926e.C51885cs;
import com.google.assistant.p3897e.p3921j.p3926e.C52033ie;
import com.google.assistant.p3897e.p3921j.p3926e.C52036ih;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.aiu;
import com.google.common.p4552o.aiv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p4985f.p4997c.p4999b.p5000a.C64815b;
import com.google.protos.p4985f.p4997c.p4999b.p5000a.C64816c;
import com.google.protos.p4985f.p4997c.p4999b.p5000a.C64818e;
import dagger.C68214a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.c */
/* compiled from: PG */
public final class C107592c extends C107609t {

    /* renamed from: a */
    private static final C59071e f299313a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.au.c");

    /* renamed from: b */
    private final Context f299314b;

    /* renamed from: c */
    private final C68214a f299315c;

    /* renamed from: d */
    private final C68214a f299316d;

    /* renamed from: e */
    private final Map f299317e;

    /* renamed from: f */
    private final Map f299318f;

    /* renamed from: g */
    private final C86124t f299319g;

    public C107592c(Context context, C68214a aVar, C68214a aVar2, C86124t tVar) {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("ic_citadel_answers", Integer.valueOf(R.drawable.ic_citadel_answers_white));
        gzVar.mo55429h("ic_citadel_fun", Integer.valueOf(R.drawable.ic_citadel_fun_white));
        gzVar.mo55429h("ic_citadel_game", Integer.valueOf(R.drawable.ic_citadel_game_white));
        gzVar.mo55429h("ic_citadel_news", Integer.valueOf(R.drawable.ic_citadel_news_white));
        gzVar.mo55429h("ic_citadel_sports", Integer.valueOf(R.drawable.ic_citadel_cricket_white));
        gzVar.mo55429h("ic_citadel_weather", Integer.valueOf(R.drawable.ic_citadel_weather_white));
        gzVar.mo55429h("ic_citadel_warning", Integer.valueOf(R.drawable.ic_citadel_warning_red));
        gzVar.mo55429h("ic_citadel_music", Integer.valueOf(R.drawable.ic_citadel_music_white));
        gzVar.mo55429h("ic_citadel_help", Integer.valueOf(R.drawable.ic_citadel_help_white));
        gzVar.mo55429h("ic_citadel_tutorial", Integer.valueOf(R.drawable.ic_citadel_tutorial_white));
        gzVar.mo55429h("ic_citadel_video_tutorials", Integer.valueOf(R.drawable.ic_citadel_video_tutorials_white));
        this.f299317e = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("ic_citadel_answers", Integer.valueOf(R.drawable.rich_input_coin_background_dark_grey));
        Integer valueOf = Integer.valueOf(R.drawable.rich_input_coin_background_green);
        gzVar2.mo55429h("ic_citadel_fun", valueOf);
        gzVar2.mo55429h("ic_citadel_game", valueOf);
        gzVar2.mo55429h("ic_citadel_news", Integer.valueOf(R.drawable.rich_input_coin_background_blue));
        Integer valueOf2 = Integer.valueOf(R.drawable.rich_input_coin_background_red);
        gzVar2.mo55429h("ic_citadel_sports", valueOf2);
        gzVar2.mo55429h("ic_citadel_weather", Integer.valueOf(R.drawable.rich_input_coin_background_yellow));
        gzVar2.mo55429h("ic_citadel_warning", Integer.valueOf(R.drawable.rich_input_coin_background_pale_red));
        gzVar2.mo55429h("ic_citadel_music", valueOf2);
        Integer valueOf3 = Integer.valueOf(R.drawable.rich_input_coin_background_light_blue);
        gzVar2.mo55429h("ic_citadel_help", valueOf3);
        gzVar2.mo55429h("ic_citadel_tutorial", valueOf3);
        gzVar2.mo55429h("ic_citadel_video_tutorials", valueOf3);
        this.f299318f = gzVar2.mo55427f(false);
        this.f299314b = context;
        this.f299315c = aVar;
        this.f299316d = aVar2;
        this.f299319g = tVar;
    }

    /* renamed from: c */
    private static C51809dy m178467c(String str, String str2, String str3, MessageLite messageLite) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = str2;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = str3;
        C63088z byteString = messageLite.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        dvVar.mo53733c((C52232kc) kbVar.build());
        C51807dw dwVar = (C51807dw) dvVar.build();
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = str;
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: d */
    private static C64818e m178468d(String str) {
        C64818e eVar = C64818e.f175640b;
        try {
            return (C64818e) C62942bv.parseFrom((C62942bv) C64818e.f175640b, Base64.decode(str, 0), C62921ba.m95368a());
        } catch (C62974ct e) {
            C59104x c = f299313a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CitadelSuggBuilder");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25510)).mo56386p("Exception parsing categories configuration from encoded proto");
            return eVar;
        }
    }

    /* renamed from: e */
    private final List m178469e(C64818e eVar) {
        int i = 4;
        C58480gp gpVar = new C58480gp(4);
        ArrayList arrayList = new ArrayList(eVar.f175642a);
        if (true == this.f299319g.mo79746e(C90024cc.f248133d)) {
            i = 8;
        }
        int i2 = 0;
        while (i2 < arrayList.size() && i2 < i) {
            C58833ax a = mo96060a((C64816c) arrayList.get(i2));
            if (a.mo56113h()) {
                gpVar.mo55395g((C107608s) a.mo56107c());
            } else {
                C59104x c = f299313a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "CitadelSuggBuilder");
                ((C59052c) ((C59052c) c).mo56372aa(25511)).mo56389s("Failed creating rich input item from category info: %s", arrayList.get(i2));
            }
            i2++;
        }
        return gpVar.mo55394f();
    }

    /* renamed from: f */
    private final Locale m178470f() {
        return ((ae) this.f299315c.mo27525b()).d(C58837ba.m90858g(((C86054o) this.f299316d.mo27525b()).mo79659F()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58833ax mo96060a(C64816c cVar) {
        String str;
        String str2 = cVar.f175635b;
        String str3 = cVar.f175634a;
        View inflate = LayoutInflater.from(this.f299314b).inflate(R.layout.rich_input_content_coin, (ViewGroup) null);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.opa_richinput_icon_layout);
        Context context = this.f299314b;
        Integer num = (Integer) this.f299318f.get(str3);
        frameLayout.setBackground(context.getDrawable(Integer.valueOf(num != null ? num.intValue() : R.drawable.rich_input_coin_background).intValue()));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.opa_rich_input_generic_icon);
        Integer num2 = (Integer) this.f299317e.get(str3);
        imageView.setImageResource(Integer.valueOf(num2 != null ? num2.intValue() : R.drawable.ic_citadel_answers_white).intValue());
        ((TextView) inflate.findViewById(R.id.opa_richinput_content_text)).setText(str2);
        aiu aiu = (aiu) aiv.f158845c.createBuilder();
        aiu.copyOnWrite();
        aiv aiv = (aiv) aiu.instance;
        str2.getClass();
        aiv.f158848a |= 2;
        aiv.f158849b = str2;
        aiv aiv2 = (aiv) aiu.build();
        int a = C64815b.m96465a(cVar.f175636c);
        int i = 84096;
        if (a != 0 && a == 3) {
            i = 85883;
        }
        C89935f fVar = new C89935f();
        fVar.f246424c = aiv2;
        C89938i iVar = new C89938i(i, fVar.mo83781a());
        iVar.mo33795i(5);
        C107607r f = C107608s.m178492f();
        f.mo96047b(inflate);
        C107581a aVar = (C107581a) f;
        aVar.f299302b = iVar;
        int i2 = cVar.f175636c;
        int a2 = C64815b.m96465a(i2);
        if (a2 != 0 && a2 == 3) {
            Locale f2 = m178470f();
            if (f2 == null) {
                return C58836b.f156633a;
            }
            try {
                URL url = new URL(Uri.parse(cVar.f175637d).buildUpon().appendQueryParameter("hl", f2.toLanguageTag()).build().toString());
                String str4 = cVar.f175635b;
                C51844be beVar = (C51844be) C51885cs.f136078y.createBuilder();
                String url2 = url.toString();
                beVar.copyOnWrite();
                C51885cs csVar = (C51885cs) beVar.instance;
                url2.getClass();
                csVar.f136083b = 1;
                csVar.f136084c = url2;
                beVar.copyOnWrite();
                C51885cs csVar2 = (C51885cs) beVar.instance;
                csVar2.f136086e = 1;
                csVar2.f136082a |= 16;
                beVar.copyOnWrite();
                C51885cs csVar3 = (C51885cs) beVar.instance;
                csVar3.f136082a |= 2048;
                csVar3.f136091j = true;
                beVar.copyOnWrite();
                C51885cs csVar4 = (C51885cs) beVar.instance;
                csVar4.f136082a |= 1024;
                csVar4.f136090i = "https://www.gstatic.com/assistant/interactivecanvas/api/dev/interactive_canvas.min.js";
                beVar.copyOnWrite();
                C51885cs csVar5 = (C51885cs) beVar.instance;
                csVar5.f136082a |= 16384;
                csVar5.f136093l = false;
                C51809dy c = m178467c("ui.SHOW_HTML_IMMERSIVE", "show_html_immersive_args", "assistant.api.client_op.ui.ShowHtmlImmersiveArgs", (C51885cs) beVar.build());
                C52033ie ieVar = (C52033ie) C52036ih.f136574g.createBuilder();
                ieVar.copyOnWrite();
                C52036ih ihVar = (C52036ih) ieVar.instance;
                str4.getClass();
                ihVar.f136576a |= 1;
                ihVar.f136577b = str4;
                C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
                C51074fk fkVar = (C51074fk) C51075fl.f132982e.createBuilder();
                try {
                    str = new Uri.Builder().scheme("android.resource").authority(this.f299314b.getResources().getResourcePackageName(R.drawable.opa_logo)).appendPath(this.f299314b.getResources().getResourceTypeName(R.drawable.opa_logo)).appendPath(this.f299314b.getResources().getResourceEntryName(R.drawable.opa_logo)).build().toString();
                } catch (NullPointerException unused) {
                    str = "https://www.gstatic.com/images/branding/product/1x/assistant_48dp.png";
                }
                fkVar.copyOnWrite();
                C51075fl flVar = (C51075fl) fkVar.instance;
                str.getClass();
                flVar.f132984a = 1 | flVar.f132984a;
                flVar.f132985b = str;
                fkVar.copyOnWrite();
                C51075fl flVar2 = (C51075fl) fkVar.instance;
                str4.getClass();
                flVar2.f132984a |= 2;
                flVar2.f132986c = str4;
                ggVar.copyOnWrite();
                C51098gh ghVar = (C51098gh) ggVar.instance;
                C51075fl flVar3 = (C51075fl) fkVar.build();
                flVar3.getClass();
                ghVar.f133013c = flVar3;
                ghVar.f133012b = 3;
                ieVar.copyOnWrite();
                C52036ih ihVar2 = (C52036ih) ieVar.instance;
                C51098gh ghVar2 = (C51098gh) ggVar.build();
                ghVar2.getClass();
                ihVar2.f136578c = ghVar2;
                ihVar2.f136576a |= 2;
                C58485gu o = C58485gu.m89847o(m178467c("ui.THIRD_PARTY_START_INDICATOR", "third_party_start_indicator_args", "assistant.api.client_op.ThirdPartyStartIndicatorArgs", (C52036ih) ieVar.build()), c);
                if (o != null) {
                    ((C107581a) f).f299303c = C58833ax.m90834k(new C107589a(o));
                    return C58833ax.m90834k(f.mo96046a());
                }
                throw new NullPointerException("Null clientOps");
            } catch (MalformedURLException e) {
                C59104x c2 = f299313a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "CitadelSuggBuilder");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(25509)).mo56389s("Invalid landing page url: %s", cVar.f175637d);
            }
        } else {
            int a3 = C64815b.m96465a(i2);
            if (a3 != 0 && a3 == 5) {
                String str5 = cVar.f175639f;
                C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
                hwVar.copyOnWrite();
                C53287ih ihVar3 = (C53287ih) hwVar.instance;
                str5.getClass();
                ihVar3.f139695a |= 8;
                ihVar3.f139701g = str5;
                hwVar.copyOnWrite();
                C53287ih ihVar4 = (C53287ih) hwVar.instance;
                ihVar4.f139698d = 3;
                ihVar4.f139695a |= 1;
                hwVar.copyOnWrite();
                C53287ih ihVar5 = (C53287ih) hwVar.instance;
                ihVar5.f139695a |= 4;
                ihVar5.f139700f = false;
                hwVar.copyOnWrite();
                C53287ih ihVar6 = (C53287ih) hwVar.instance;
                ihVar6.f139702h = 1;
                ihVar6.f139695a |= 64;
                hwVar.copyOnWrite();
                C53287ih ihVar7 = (C53287ih) hwVar.instance;
                ihVar7.f139703i = 0;
                ihVar7.f139695a |= 128;
                aVar.f299304d = C58833ax.m90834k(C87566i.m142325x(C58837ba.m90858g(C87571n.m142341e(C87571n.m142342f((C53287ih) hwVar.build())))));
                return C58833ax.m90834k(f.mo96046a());
            }
            if (!cVar.f175638e.isEmpty()) {
                aVar.f299301a = C58833ax.m90834k(cVar.f175638e);
                return C58833ax.m90834k(f.mo96046a());
            }
            return C58836b.f156633a;
        }
    }

    /* renamed from: b */
    public final C60870cx mo96061b() {
        String language = m178470f().getLanguage();
        if ("hi".equals(language)) {
            return C60856cj.m92900i(m178469e(m178468d(this.f299319g.mo79758x(C90024cc.f248131b))));
        }
        if ("en".equals(language)) {
            return C60856cj.m92900i(m178469e(m178468d(this.f299319g.mo79758x(C90024cc.f248130a))));
        }
        return C60856cj.m92900i(C58485gu.m89845m());
    }
}
