package com.google.android.apps.gsa.sidekick.main.actions;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90945k;
import com.google.android.apps.gsa.sidekick.main.notifications.C91486aa;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91755a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7947pw;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.sidekick.main.actions.q */
/* compiled from: PG */
public final class C91258q extends C90945k {

    /* renamed from: a */
    private static final C59071e f254698a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.actions.q");

    /* renamed from: b */
    private final Context f254699b;

    /* renamed from: c */
    private final C7718hj f254700c;

    /* renamed from: g */
    private final C91755a f254701g;

    /* renamed from: h */
    private final C91486aa f254702h;

    public C91258q(Context context, C7718hj hjVar, C91755a aVar, C90929bz bzVar, C91486aa aaVar) {
        super("SnoozeReminderTask", bzVar, 1, 4);
        this.f254699b = context;
        this.f254700c = hjVar;
        this.f254701g = aVar;
        this.f254702h = aaVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo77936a(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        C7718hj hjVar = this.f254700c;
        if ((hjVar.f26955a & 32768) != 0) {
            C91755a aVar = this.f254701g;
            C7947pw pwVar = hjVar.f26979t;
            if (pwVar == null) {
                pwVar = C7947pw.f27896j;
            }
            return Boolean.valueOf(aVar.mo86251i(Collections.singleton(pwVar.f27899b)));
        }
        C59104x d = f254698a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SnoozeReminderTask");
        ((C59052c) ((C59052c) d).mo56372aa(11509)).mo56386p("reminderEntry not found, snooze reminder task not executed");
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo77937b(Object obj) {
        this.f254702h.mo85830a(new C58759qy(this.f254700c));
        if (((Boolean) obj).booleanValue()) {
            Toast.makeText(this.f254699b, R.string.snooze_success, 0).show();
        } else {
            Toast.makeText(this.f254699b, R.string.snooze_fail, 0).show();
        }
    }
}
