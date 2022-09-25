package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import android.content.Context;
import android.os.ConditionVariable;
import android.speech.tts.TextToSpeech;
import android.util.Pair;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.ac */
/* compiled from: PG */
public final class C84572ac {

    /* renamed from: a */
    public static final C59071e f230157a = C59071e.m91332i("com.google.android.apps.gsa.search.core.ak.a.ac");

    /* renamed from: b */
    public final Context f230158b;

    public C84572ac(Context context) {
        this.f230158b = context;
    }

    /* renamed from: b */
    public static boolean m135302b(TextToSpeech textToSpeech, Locale locale, String str) {
        Set<String> features = textToSpeech.getFeatures(locale);
        if (features == null) {
            return false;
        }
        return features.contains(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Pair mo78329a(String str) {
        ConditionVariable conditionVariable = new ConditionVariable();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        TextToSpeech textToSpeech = new TextToSpeech(this.f230158b, new C84571ab(atomicBoolean, conditionVariable), str);
        conditionVariable.block();
        if (!atomicBoolean.get()) {
            return Pair.create((Object) null, textToSpeech.getDefaultEngine());
        }
        textToSpeech.setSpeechRate(1.0f);
        return Pair.create(textToSpeech, textToSpeech.getDefaultEngine());
    }
}
