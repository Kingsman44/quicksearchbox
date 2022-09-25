package com.google.android.apps.gsa.assist.p501a;

import android.content.ComponentName;
import android.content.Context;
import android.provider.Settings;
import android.service.voice.VoiceInteractionService;
import com.google.android.apps.gsa.shared.p7066m.C90054df;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.base.C58890d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assist.a.m */
/* compiled from: PG */
public final class C9325m {

    /* renamed from: a */
    public final Context f32350a;

    /* renamed from: b */
    public final ComponentName f32351b;

    /* renamed from: c */
    private final C69464a f32352c;

    public C9325m(Context context, ComponentName componentName, C69464a aVar) {
        this.f32350a = context;
        this.f32351b = componentName;
        this.f32352c = aVar;
    }

    /* renamed from: b */
    public static boolean m23781b(Context context, ComponentName componentName, C91142g gVar) {
        if (!gVar.mo85405j(C90054df.f248994a)) {
            return VoiceInteractionService.isActiveService(context, componentName);
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "assistant");
        if (string == null) {
            return VoiceInteractionService.isActiveService(context, componentName);
        }
        ComponentName unflattenFromString = ComponentName.unflattenFromString(string);
        if (unflattenFromString == null) {
            return false;
        }
        return C58890d.m90990e("com.google.android.googlequicksearchbox", unflattenFromString.getPackageName());
    }

    /* renamed from: a */
    public final boolean mo17534a() {
        return m23781b(this.f32350a, this.f32351b, (C91142g) this.f32352c.mo17428b());
    }
}
