package com.google.android.apps.search.assistant.verticals.automation.routines.p10029e.p10030a;

import android.content.Context;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10021a.p10022a.C131847h;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10029e.C131875a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3861at.afy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.e.a.d */
/* compiled from: PG */
public final class C131879d implements C131875a {

    /* renamed from: a */
    public static final C59071e f360127a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.automation.routines.e.a.d");

    /* renamed from: b */
    public final Context f360128b;

    /* renamed from: c */
    public final C131847h f360129c;

    /* renamed from: d */
    public final C60950i f360130d;

    /* renamed from: e */
    private final AccountId f360131e;

    /* renamed from: f */
    private final C46175b f360132f;

    /* renamed from: g */
    private final C46723bg f360133g;

    /* renamed from: h */
    private final Executor f360134h;

    public C131879d(Context context, C131847h hVar, AccountId accountId, C46175b bVar, C46723bg bgVar, C60950i iVar, Executor executor) {
        this.f360128b = context;
        this.f360129c = hVar;
        this.f360131e = accountId;
        this.f360132f = bVar;
        this.f360133g = bgVar;
        this.f360130d = iVar;
        this.f360134h = executor;
    }

    /* renamed from: a */
    public final C60870cx mo110345a(afy afy) {
        ((C59052c) ((C59052c) f360127a.mo56224b()).mo56372aa(39458)).mo56386p("#sendExecuteRoutineNotification(Info)");
        try {
            if (!afy.f129193d) {
                throw new IllegalArgumentException("Invalid workflow for notification: Not enabled");
            } else if (afy.f129191b.isEmpty()) {
                throw new IllegalArgumentException("Invalid workflow for notification: Empty id");
            } else if (afy.f129195f.isEmpty()) {
                throw new IllegalArgumentException("Invalid workflow for notification: Empty preset id");
            } else if (!afy.f129194e.isEmpty()) {
                return C47633f.m84733g(C47633f.m84733g(this.f360133g.mo50750c(this.f360132f.mo50244a(this.f360131e), C46788de.DONT_CARE)).mo51515h(C131876a.f360123a, this.f360134h)).mo51513e(Throwable.class, C131877b.f360124a, this.f360134h).mo51516i(new C131878c(this, afy), this.f360134h);
            } else {
                throw new IllegalArgumentException("Invalid workflow for notification: Empty title");
            }
        } catch (IllegalArgumentException e) {
            return C60856cj.m92899h(e);
        }
    }
}
