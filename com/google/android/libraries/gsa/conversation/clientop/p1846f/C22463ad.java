package com.google.android.libraries.gsa.conversation.clientop.p1846f;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3917i.p3918a.C51562mh;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.ad */
/* compiled from: PG */
public final class C22463ad extends C22538o {

    /* renamed from: a */
    private static final Uri f62026a = Uri.parse("clock-app://com.google.android.deskclock/stopwatch");

    /* renamed from: b */
    private static final C58495hd f62027b = C58495hd.m89903q("stopwatch.PAUSE_STOPWATCH", "pause", "stopwatch.SHOW_STOPWATCH", "view", "stopwatch.START_STOPWATCH", "start", "stopwatch.RESET_STOPWATCH", "reset");

    /* renamed from: c */
    private final C22695ah f62028c;

    public C22463ad(C22695ah ahVar) {
        this.f62028c = ahVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        String str = dyVar.f135936b;
        C58495hd hdVar = f62027b;
        if (hdVar.containsKey(str)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            String str2 = ((C51562mh) m41992m(dwVar, "stopwatch_args", C51562mh.f134390e.getParserForType())).f134393b;
            Uri parse = TextUtils.isEmpty(str2) ? f62026a : Uri.parse(str2);
            if (parse.getHost() == null || !"clock-app".equals(parse.getScheme()) || !"stopwatch".equals(parse.getLastPathSegment())) {
                throw new C22534k();
            }
            C22695ah ahVar = this.f62028c;
            Intent intent = new Intent();
            intent.setPackage(parse.getHost());
            intent.setData(Uri.withAppendedPath(parse, (String) hdVar.get(str)));
            if (!ahVar.mo27807a(intent)) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, (String) null));
            }
            return C60856cj.m92900i(C22402a.f61893a);
        }
        throw new C22428d(dyVar);
    }
}
