package com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6047b;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.nga.engine.p6056o.C76470a;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3917i.p3918a.C51562mh;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a.b.r */
/* compiled from: PG */
public final class C76275r extends C22538o {

    /* renamed from: a */
    private static final Uri f211299a = Uri.parse("clock-app://com.google.android.deskclock/stopwatch");

    /* renamed from: b */
    private static final C58495hd f211300b = C58495hd.m89903q("stopwatch.PAUSE_STOPWATCH", "pause", "stopwatch.SHOW_STOPWATCH", "view", "stopwatch.START_STOPWATCH", "start", "stopwatch.RESET_STOPWATCH", "reset");

    /* renamed from: c */
    private final C76470a f211301c;

    public C76275r(C76470a aVar) {
        this.f211301c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        String str = dyVar.f135936b;
        C58495hd hdVar = f211300b;
        if (hdVar.containsKey(str)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51562mh mhVar = (C51562mh) m41992m(dwVar, "stopwatch_args", C51562mh.f134390e.getParserForType());
            String str2 = mhVar.f134393b;
            Uri parse = TextUtils.isEmpty(str2) ? f211299a : Uri.parse(str2);
            if (parse.getHost() == null || !"clock-app".equals(parse.getScheme()) || !"stopwatch".equals(parse.getLastPathSegment())) {
                throw new C22534k();
            }
            boolean z = mhVar.f134395d;
            C76470a aVar = this.f211301c;
            String str3 = (String) hdVar.get(str);
            Intent intent = new Intent();
            intent.setPackage(parse.getHost());
            Uri withAppendedPath = Uri.withAppendedPath(parse, str3);
            if (str3.equals("view") || !z) {
                intent.setData(Uri.withAppendedPath(parse, str3));
            } else {
                intent.setData(parse.buildUpon().path("multi").appendQueryParameter("action", withAppendedPath.getPath()).appendQueryParameter("action", Uri.withAppendedPath(parse, "view").getPath()).build());
            }
            if (!aVar.mo72205f(intent, 1)) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, (String) null));
            }
            return C60856cj.m92900i(C22402a.f61893a);
        }
        throw new C22428d(dyVar);
    }
}
