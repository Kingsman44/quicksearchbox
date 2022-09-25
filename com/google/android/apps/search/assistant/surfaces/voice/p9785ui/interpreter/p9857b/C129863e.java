package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9857b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.core.content.p090a.C1847b;
import androidx.core.content.p090a.C1848c;
import androidx.core.content.p090a.C1850e;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129954e;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.b.e */
/* compiled from: PG */
final class C129863e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C129860c f356270a;

    public C129863e(C129860c cVar) {
        this.f356270a = cVar;
    }

    public final void onClick(View view) {
        C129860c cVar = this.f356270a;
        C69664n.m101061g(view, "view");
        C129954e eVar = cVar.f356265c;
        C129954e eVar2 = null;
        if (eVar == null) {
            C69664n.m101065k("homescreenShortcutData");
            eVar = null;
        }
        String str = eVar.f356422b;
        Context requireContext = cVar.f356263a.requireContext();
        C69664n.m101060f(requireContext, "fragment.requireContext()");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268468224);
        C129954e eVar3 = cVar.f356265c;
        if (eVar3 == null) {
            C69664n.m101065k("homescreenShortcutData");
            eVar3 = null;
        }
        intent.setData(Uri.parse(eVar3.f356422b));
        intent.setPackage(requireContext.getPackageName());
        intent.getData();
        if (C1850e.m5069b(requireContext)) {
            String str2 = cVar.f356266d;
            if (str2 == null) {
                C69664n.m101065k("sourceLocale");
                str2 = null;
            }
            String str3 = cVar.f356267e;
            if (str3 == null) {
                C69664n.m101065k("targetLocale");
                str3 = null;
            }
            String str4 = "interpreter-shortcut-" + str2 + "-" + str3;
            C1848c cVar2 = new C1848c();
            cVar2.f5711a = requireContext;
            cVar2.f5712b = str4;
            C129954e eVar4 = cVar.f356265c;
            if (eVar4 == null) {
                C69664n.m101065k("homescreenShortcutData");
                eVar4 = null;
            }
            cVar2.f5714d = eVar4.f356421a;
            C129954e eVar5 = cVar.f356265c;
            if (eVar5 == null) {
                C69664n.m101065k("homescreenShortcutData");
            } else {
                eVar2 = eVar5;
            }
            cVar2.f5715e = eVar2.f356421a;
            cVar2.f5716f = IconCompat.m5206i(requireContext, R.drawable.product_logo_assistant_interpreter_round_color_48);
            C1847b.m5066b(intent, cVar2);
            C1848c a = C1847b.m5065a(cVar2);
            PendingIntent broadcast = PendingIntent.getBroadcast(requireContext, 0, C1850e.m5068a(requireContext, a), 67108864);
            C69664n.m101058d(broadcast);
            C1850e.m5070c(requireContext, a, broadcast.getIntentSender());
        }
    }
}
