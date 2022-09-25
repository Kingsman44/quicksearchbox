package com.google.android.libraries.search.assistant.performer.p2766i;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.assistant.performer.p2767j.C36186h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36187i;
import com.google.assistant.p3897e.p3917i.p3918a.C51562mh;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.ay */
/* compiled from: PG */
public final class C36146ay implements C35472h {

    /* renamed from: a */
    private static final Uri f94488a = Uri.parse("clock-app://com.google.android.deskclock/stopwatch");

    /* renamed from: b */
    private static final C58495hd f94489b = C58495hd.m89903q("stopwatch.PAUSE_STOPWATCH", "pause", "stopwatch.SHOW_STOPWATCH", "view", "stopwatch.START_STOPWATCH", "start", "stopwatch.RESET_STOPWATCH", "reset");

    /* renamed from: c */
    private final C36186h f94490c;

    public C36146ay(C36187i iVar, C35470f fVar) {
        this.f94490c = iVar.mo40004a(fVar);
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        String str = dyVar.f135936b;
        C58495hd hdVar = f94489b;
        if (hdVar.containsKey(str)) {
            String str2 = ((C51562mh) C36183e.m64584b(dyVar, "stopwatch_args", C51562mh.f134390e.getParserForType())).f134393b;
            Uri parse = TextUtils.isEmpty(str2) ? f94488a : Uri.parse(str2);
            if (parse.getHost() == null || !"clock-app".equals(parse.getScheme()) || !"stopwatch".equals(parse.getLastPathSegment())) {
                throw new C35471g("Invalid Stopwatch Provider URI");
            }
            Intent intent = new Intent();
            intent.setPackage(parse.getHost());
            intent.setData(Uri.withAppendedPath(parse, (String) hdVar.get(str)));
            return this.f94490c.mo40003a(intent);
        }
        throw new C35471g(String.format("Invalid ClientOp name: %1$s", new Object[]{str}));
    }
}
