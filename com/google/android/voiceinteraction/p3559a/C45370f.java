package com.google.android.voiceinteraction.p3559a;

import android.content.Context;
import android.os.Build;
import android.service.voice.VoiceInteractionService;
import androidx.core.content.C1882h;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.UUID;
import p3186j$.util.Collection;

/* renamed from: com.google.android.voiceinteraction.a.f */
/* compiled from: PG */
public final class C45370f {
    /* renamed from: a */
    public static Object m80965a(VoiceInteractionService voiceInteractionService) {
        Object invoke = VoiceInteractionService.class.getMethod("createKeyphraseModelManager", new Class[0]).invoke(voiceInteractionService, new Object[0]);
        invoke.getClass();
        return invoke;
    }

    /* renamed from: b */
    public static void m80966b(Context context) {
        if (!m80968d(context)) {
            throw new C45369e();
        }
    }

    /* renamed from: c */
    public static void m80967c(VoiceInteractionService voiceInteractionService, C45371g gVar) {
        C45371g gVar2 = gVar;
        C58976aa aaVar = C58975e.f156826a;
        m80966b(voiceInteractionService);
        C90476a aVar = C91018d.f254254a;
        try {
            Object a = m80965a(voiceInteractionService);
            Method method = a.getClass().getMethod("updateKeyphraseSoundModel", new Class[]{Class.forName("android.hardware.soundtrigger.SoundTrigger$KeyphraseSoundModel")});
            Object[] objArr = new Object[1];
            Class<?> cls = Class.forName("android.hardware.soundtrigger.SoundTrigger$KeyphraseSoundModel");
            Class<?> cls2 = Class.forName("[Landroid.hardware.soundtrigger.SoundTrigger$Keyphrase;");
            int i = 5;
            Constructor<?> constructor = cls.getConstructor(new Class[]{UUID.class, UUID.class, byte[].class, cls2, Integer.TYPE});
            Object[] objArr2 = new Object[5];
            objArr2[0] = gVar2.f118738a;
            objArr2[1] = gVar2.f118739b;
            objArr2[2] = gVar2.f118740c.array();
            C58485gu j = C58485gu.m89842j(gVar2.f118741d);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName("android.hardware.soundtrigger.SoundTrigger$Keyphrase"), j.size());
            int i2 = 0;
            while (i2 < j.size()) {
                C45368d dVar = (C45368d) j.get(i2);
                Class<?> cls3 = Class.forName("android.hardware.soundtrigger.SoundTrigger$Keyphrase");
                Class[] clsArr = new Class[i];
                clsArr[0] = Integer.TYPE;
                clsArr[1] = Integer.TYPE;
                clsArr[2] = Locale.class;
                clsArr[3] = String.class;
                clsArr[4] = int[].class;
                Constructor<?> constructor2 = cls3.getConstructor(clsArr);
                Object[] objArr4 = new Object[i];
                objArr4[0] = Integer.valueOf(dVar.mo49455a());
                objArr4[1] = Integer.valueOf(dVar.mo49456b());
                objArr4[2] = dVar.mo49459e();
                objArr4[3] = dVar.mo49458d();
                objArr4[4] = Collection.EL.stream(dVar.mo49457c()).mapToInt(C45366b.f118736a).toArray();
                objArr3[i2] = constructor2.newInstance(objArr4);
                i2++;
                i = 5;
            }
            objArr2[3] = cls2.cast(objArr3);
            objArr2[4] = Integer.valueOf(gVar2.f118742e);
            objArr[0] = constructor.newInstance(objArr2);
            method.invoke(a, objArr);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C45369e(e);
        }
    }

    /* renamed from: d */
    public static boolean m80968d(Context context) {
        return Build.VERSION.SDK_INT >= 30 && C1882h.m5137c(context, "android.permission.MANAGE_VOICE_KEYPHRASES") == 0;
    }
}
