package com.google.android.apps.search.googleapp.search.suggest.feedback;

import android.text.TextUtils;
import android.view.MenuItem;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.protobuf.C62963cj;
import java.util.List;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.ai */
/* compiled from: PG */
public final /* synthetic */ class C138091ai implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C138093ak f375704a;

    /* renamed from: b */
    public final /* synthetic */ MenuItem f375705b;

    public /* synthetic */ C138091ai(C138093ak akVar, MenuItem menuItem) {
        this.f375704a = akVar;
        this.f375705b = menuItem;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        String str;
        C138093ak akVar = this.f375704a;
        this.f375705b.setEnabled(false);
        C138096am amVar = (C138096am) C138098ao.f375725f.createBuilder();
        amVar.mo114147a(C138118t.CHOICE_ID_CC.f375795m, String.valueOf(akVar.f375718i));
        amVar.mo114147a(C138118t.CHOICES_SC.f375795m, akVar.f375712c.f375539b);
        String str2 = C138118t.CHOICE_CC.f375795m;
        switch (akVar.f375718i) {
            case 1:
                str = akVar.f375714e.getResources().getString(R.string.ga_irrelevant);
                break;
            case 2:
                str = akVar.f375714e.getResources().getString(R.string.ga_violence_or_gore);
                break;
            case 3:
                str = akVar.f375714e.getResources().getString(R.string.ga_sexually_explicit_vulgar_or_profane);
                break;
            case 4:
                str = akVar.f375714e.getResources().getString(R.string.ga_hateful_against_groups);
                break;
            case 5:
                str = akVar.f375714e.getResources().getString(R.string.ga_sensitive_or_disparaging_for_individuals);
                break;
            case 6:
                str = akVar.f375714e.getResources().getString(R.string.ga_dangerous_or_harmful_activity);
                break;
            case 7:
                str = akVar.f375714e.getResources().getString(R.string.ga_report_other_option);
                break;
            default:
                str = BuildConfig.FLAVOR;
                break;
        }
        amVar.mo114147a(str2, str);
        String str3 = C138118t.SUGGESTION_TYPE.f375795m;
        C138029au a = C138029au.m224331a(akVar.f375712c.f375541d);
        if (a == null) {
            a = C138029au.QUERY;
        }
        amVar.mo114147a(str3, String.valueOf(a.f375534n));
        amVar.mo114147a(C138118t.SUGGESTION_SUBTYPES.f375795m, C138093ak.f375710b.mo56097d((List) Collection.EL.stream(new C62963cj(akVar.f375712c.f375542e, C138030av.f375535f)).map(C138122x.f375801a).collect(Collectors.toCollection(C138123y.f375802a))));
        if (akVar.f375718i == 7) {
            amVar.mo114147a(C138118t.OTHER_COMMENT.f375795m, C138093ak.m224425c(akVar.mo114138b().getText().toString()));
        }
        amVar.mo114147a(C138118t.SCUTI_UI_TAG.f375795m, "1");
        String c = C138093ak.m224425c(akVar.mo114137a().getText().toString());
        if (!TextUtils.isEmpty(c)) {
            String c2 = C138093ak.m224425c(c);
            amVar.copyOnWrite();
            C138098ao aoVar = (C138098ao) amVar.instance;
            c2.getClass();
            aoVar.f375727a |= 1;
            aoVar.f375729c = c2;
        }
        amVar.mo114147a(C138118t.QUERY.f375795m, akVar.f375713d.f375731e);
        C138098ao aoVar2 = (C138098ao) amVar.build();
        C46439e eVar = akVar.f375716g;
        C138109k kVar = akVar.f375715f;
        C69664n.m101061g(aoVar2, "uiPsds");
        eVar.mo50445g(C46438d.m82810b(C71663i.m104688a(C71803m.m105042c(kVar.f375769i, (C69585o) null, (C71424ay) null, new C138108j(kVar, aoVar2, (C69577g) null), 3))), C46436b.m82808a(aoVar2), akVar.f375719j);
        return true;
    }
}
