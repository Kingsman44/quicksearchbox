package com.google.android.apps.gsa.sidekick.shared.p7242k;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91787ak;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91788al;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7682ga;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.k.b */
/* compiled from: PG */
public final class C91754b {

    /* renamed from: a */
    public String f255877a = "android.intent.action.ASSIST";

    /* renamed from: b */
    public String f255878b = e.b();

    /* renamed from: c */
    public Collection f255879c;

    /* renamed from: d */
    public int f255880d = 0;

    /* renamed from: e */
    public String f255881e = "SYSTEM_NOTIFICATION";

    /* renamed from: f */
    public boolean f255882f = false;

    /* renamed from: g */
    public long f255883g = 0;

    /* renamed from: h */
    public C7682ga f255884h;

    /* renamed from: i */
    public C57057b f255885i;

    /* renamed from: j */
    public C9141ad f255886j;

    /* renamed from: k */
    public boolean f255887k = false;

    /* renamed from: l */
    public C57315dp f255888l = null;

    /* renamed from: m */
    public C7669fo f255889m = null;

    /* renamed from: n */
    public C60220t f255890n = null;

    /* renamed from: o */
    private final Context f255891o;

    public C91754b(Context context) {
        this.f255891o = context;
    }

    /* renamed from: a */
    public final Intent mo86242a() {
        Intent className = new Intent(this.f255877a).setClassName(this.f255891o, this.f255878b);
        int i = this.f255880d;
        String str = this.f255881e;
        String str2 = "notification_content://" + i;
        if (str != null) {
            str2 = str2 + "_" + str;
        }
        Intent addFlags = className.setData(Uri.parse(str2)).putExtra("notification_is_sticky", this.f255882f).putExtra("notification_expiration_seconds", this.f255883g).addFlags(268435456);
        if (this.f255887k) {
            addFlags.putExtra("com.google.android.apps.sidekick.FROM_NOTIFICATION", this.f255880d);
        } else {
            addFlags.putExtra("notificationIdKey", this.f255880d);
        }
        Collection collection = this.f255879c;
        if (collection != null) {
            C91978bb.m150940f(addFlags, "notification_entries", collection);
        }
        if (this.f255884h != null) {
            C91787ak akVar = (C91787ak) C91788al.f255957d.createBuilder();
            C7682ga gaVar = this.f255884h;
            gaVar.getClass();
            akVar.copyOnWrite();
            C91788al alVar = (C91788al) akVar.instance;
            alVar.f255960b = gaVar;
            alVar.f255959a |= 1;
            C57057b bVar = this.f255885i;
            if (bVar != null) {
                akVar.copyOnWrite();
                C91788al alVar2 = (C91788al) akVar.instance;
                alVar2.f255961c = bVar;
                alVar2.f255959a |= 2;
            }
            C90734ar.m148200c(addFlags, "notification_survey_info", akVar.build());
        }
        C9141ad adVar = this.f255886j;
        if (adVar != null) {
            C90734ar.m148200c(addFlags, "clientActionKey", adVar);
        }
        C57315dp dpVar = this.f255888l;
        if (dpVar != null) {
            C90734ar.m148200c(addFlags, "notification_pinned_content_token", dpVar);
        }
        C7669fo foVar = this.f255889m;
        if (foVar != null) {
            addFlags.putExtra("notification_target_content_id", foVar.toByteArray());
        }
        C60220t tVar = this.f255890n;
        if (tVar != null) {
            C90734ar.m148200c(addFlags, "notification_event_id", tVar);
        }
        return addFlags;
    }
}
