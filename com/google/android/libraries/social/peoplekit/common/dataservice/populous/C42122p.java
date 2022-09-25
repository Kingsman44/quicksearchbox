package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.content.Context;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42103m;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.android.libraries.social.populous.AutocompleteSessionBase;
import com.google.android.libraries.social.populous.C42598s;
import com.google.android.libraries.social.populous.C42706t;
import com.google.android.libraries.social.populous.C42707u;
import com.google.android.libraries.social.populous.C42710x;
import com.google.android.libraries.social.populous.core.C42266as;
import com.google.android.libraries.social.populous.core.C42334df;
import com.google.android.libraries.social.populous.core.ClientId;
import com.google.android.libraries.social.populous.p3289c.C42211b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.populous.p */
/* compiled from: PG */
public final class C42122p implements C42103m {

    /* renamed from: a */
    private final C42266as[] f110177a;

    /* renamed from: b */
    private C42598s f110178b;

    /* renamed from: c */
    private AutocompleteSessionBase f110179c;

    /* renamed from: d */
    private final C42211b f110180d;

    public C42122p(C42266as[] asVarArr, C42211b bVar) {
        this.f110177a = asVarArr;
        this.f110180d = bVar;
    }

    /* renamed from: a */
    public final /* synthetic */ PeopleKitDataLayer mo44691a(Context context, ExecutorService executorService, PeopleKitConfig peopleKitConfig, C42075e eVar) {
        C42598s c = mo44737c(context, peopleKitConfig, executorService);
        PeopleKitConfigImpl peopleKitConfigImpl = (PeopleKitConfigImpl) peopleKitConfig;
        if (!peopleKitConfigImpl.f110257x || this.f110179c == null || !C42131a.m73924g()) {
            C42266as d = m73912d(peopleKitConfigImpl.f110259z);
            C42334df dfVar = new C42334df();
            dfVar.f111036g = C58833ax.m90833j(peopleKitConfigImpl.f110236c);
            this.f110179c = c.mo44863c(context, d, dfVar.mo45315a());
        }
        AutocompleteSessionBase autocompleteSessionBase = this.f110179c;
        C42121o oVar = new C42121o();
        oVar.f110173b = c;
        oVar.f110172a = autocompleteSessionBase;
        oVar.f110174c = new C42126t(context, executorService, c, peopleKitConfig);
        oVar.f110175d = peopleKitConfig;
        oVar.f110176e = eVar;
        oVar.f110172a.getClass();
        oVar.f110173b.getClass();
        return new PopulousDataLayer(oVar);
    }

    /* renamed from: b */
    public final void mo44692b(Context context, PeopleKitConfig peopleKitConfig, ExecutorService executorService) {
        C42131a.m73918a(context);
        C42598s c = mo44737c(context, peopleKitConfig, executorService);
        m73912d(((PeopleKitConfigImpl) peopleKitConfig).f110259z);
        c.mo44865e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C42598s mo44737c(Context context, PeopleKitConfig peopleKitConfig, ExecutorService executorService) {
        String str;
        C42131a.m73918a(context);
        PeopleKitConfigImpl peopleKitConfigImpl = (PeopleKitConfigImpl) peopleKitConfig;
        if (!peopleKitConfigImpl.f110257x || this.f110178b == null || !C42131a.m73924g()) {
            C42707u a = C42706t.m75427a(context.getApplicationContext());
            String str2 = peopleKitConfigImpl.f110234a;
            if (C58837ba.m90859h(peopleKitConfigImpl.f110235b)) {
                str = "com.google";
            } else {
                str = peopleKitConfigImpl.f110235b;
            }
            a.mo45807c(str2, str);
            a.mo45806b(m73912d(peopleKitConfigImpl.f110259z));
            C42710x xVar = (C42710x) a;
            xVar.f111936b = true;
            xVar.f111935a = executorService;
            xVar.f111937c = this.f110180d;
            this.f110178b = a.mo45805a();
        }
        return this.f110178b;
    }

    /* renamed from: d */
    private final C42266as m73912d(int i) {
        ClientId clientId;
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 14:
                    clientId = ClientId.f110745e;
                    break;
                case 18:
                    clientId = ClientId.f110748h;
                    break;
                case 24:
                    clientId = ClientId.f110752l;
                    break;
                case 27:
                    clientId = ClientId.f110756p;
                    break;
                case 31:
                    clientId = ClientId.f110755o;
                    break;
                case 36:
                    clientId = ClientId.f110750j;
                    break;
                case 39:
                    clientId = ClientId.f110751k;
                    break;
                case 42:
                    clientId = ClientId.f110754n;
                    break;
                case 43:
                    clientId = ClientId.f110744d;
                    break;
                case 53:
                    clientId = ClientId.f110759s;
                    break;
                case 54:
                    clientId = ClientId.f110757q;
                    break;
                case 78:
                    clientId = ClientId.f110760t;
                    break;
                case 79:
                    clientId = ClientId.f110761u;
                    break;
                case 81:
                    clientId = ClientId.f110762v;
                    break;
                case 86:
                    clientId = ClientId.f110749i;
                    break;
                case 97:
                    clientId = ClientId.f110753m;
                    break;
                case 98:
                    clientId = ClientId.f110742b;
                    break;
                case 100:
                    clientId = ClientId.f110763w;
                    break;
                case 109:
                    clientId = ClientId.f110764x;
                    break;
                case 113:
                    clientId = ClientId.f110746f;
                    break;
                case 116:
                    clientId = ClientId.f110743c;
                    break;
                case 119:
                    clientId = ClientId.f110765y;
                    break;
                default:
                    clientId = ClientId.f110747g;
                    break;
            }
            C42266as[] asVarArr = this.f110177a;
            for (int i3 = 0; i3 < 3; i3++) {
                C42266as asVar = asVarArr[i3];
                if (asVar.mo45104a().equals(clientId)) {
                    return asVar;
                }
            }
            throw new IllegalArgumentException("Populous client config not found for Client Id: " + i2);
        }
        throw null;
    }
}
