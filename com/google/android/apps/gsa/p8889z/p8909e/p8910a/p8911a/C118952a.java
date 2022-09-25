package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8911a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.gsa.languagepack.av;
import com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84570aa;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90525q;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import dagger.C68214a;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.z.e.a.a.a */
/* compiled from: PG */
public final class C118952a {

    /* renamed from: a */
    private static final C59071e f331725a = C59071e.m91332i("com.google.android.apps.gsa.z.e.a.a.a");

    /* renamed from: b */
    private static final C58528ij f331726b = C58528ij.m90011K(524289, 65545);

    /* renamed from: a */
    public static String m197463a(ClientConfig clientConfig, C90528t tVar, C89037bh bhVar, Context context, C89994f fVar, C68214a aVar, Query query, C90021c cVar, String str, String str2, C68214a aVar2) {
        Resources resources;
        String str3;
        C89857g gVar;
        List i = C58869cf.m90936b(new C58903m('-')).mo56155i(str2.replace('_', '-'));
        if (i.size() >= 2) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(new Locale((String) i.get(0), (String) i.get(1)));
            resources = context.createConfigurationContext(configuration).getResources();
        } else {
            resources = context.getResources();
        }
        Random random = new Random();
        if (!clientConfig.mo81878H() || tVar.f253082c == 393244) {
            return null;
        }
        if (bhVar.mo27377b().mo83040a()) {
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            ajVar.mo57006c(C90454b.m147155e(tVar));
            C59687cb cbVar = (C59687cb) ajVar.build();
            if (f331726b.contains(Integer.valueOf(tVar.f253082c))) {
                String[] stringArray = resources.getStringArray(R.array.network_error_tts_messages);
                str3 = stringArray[random.nextInt(stringArray.length)];
                C59104x c = f331725a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "VocalizedErrMsgProvider");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(tVar)).mo56372aa(34202)).mo56386p("Playing bad connectivity TTS");
                C89856f fVar2 = new C89856f();
                fVar2.f246201a = C89849ae.PLAY_UNRELIABLE_CONNECTIVITY_TTS;
                fVar2.f246203c = cbVar;
                gVar = fVar2.mo83699a();
            } else {
                str3 = resources.getString(R.string.default_recognition_error);
                C59104x c2 = f331725a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "VocalizedErrMsgProvider");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(tVar)).mo56372aa(34201)).mo56386p("Playing default error TTS");
                C89856f fVar3 = new C89856f();
                fVar3.f246201a = C89849ae.PLAY_DEFAULT_ERROR_TTS;
                fVar3.f246203c = cbVar;
                gVar = fVar3.mo83699a();
            }
            String str4 = str3;
            ((C89859i) aVar2.mo27525b()).mo74236a(gVar);
            return str4;
        }
        String Z = fVar.mo83863Z();
        boolean J = C90772bp.m148283J(context);
        av avVar = (av) aVar.mo27525b();
        boolean f = C84570aa.m135301f(cVar, J, Z);
        int i2 = R.string.network_error_no_connection_tts;
        if (f && tVar.f253082c == 458754 && avVar.g(Z) != null && query.mo84337bV()) {
            C8476as g = ((av) aVar.mo27525b()).g(Z);
            if (g != null) {
                ((av) aVar.mo27525b()).b(g, true);
                i2 = R.string.offline_eyesfree_install_language_pack_tts;
            }
        } else if (bhVar.mo27384j()) {
            i2 = R.string.network_error_airplane_mode_tts;
        } else if (tVar instanceof C90525q) {
            if (TextUtils.isEmpty(str)) {
                i2 = R.string.no_matches_with_suggestions_offline_mode_tts;
            } else {
                return resources.getString(R.string.no_matches_with_readback_offline_mode_tts, new Object[]{str});
            }
        }
        return resources.getString(i2);
    }

    /* renamed from: b */
    public static String m197464b(ClientConfig clientConfig, C90528t tVar, C89037bh bhVar, Context context, C89994f fVar, C68214a aVar, Query query, C90021c cVar, C68214a aVar2) {
        return m197463a(clientConfig, tVar, bhVar, context, fVar, aVar, query, cVar, (String) null, Locale.getDefault().toLanguageTag(), aVar2);
    }
}
