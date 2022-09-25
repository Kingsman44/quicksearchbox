package com.google.android.apps.gsa.assistant.settings.features.voiceselection;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
/* renamed from: com.google.android.apps.gsa.assistant.settings.features.voiceselection.ae */
/* compiled from: PG */
final class C73520ae extends C90888av {

    /* renamed from: a */
    final /* synthetic */ ag f194536a;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.voiceselection.ae.<init>(com.google.android.apps.gsa.assistant.settings.features.voiceselection.ag):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C73520ae(com.google.android.apps.gsa.assistant.settings.features.voiceselection.ag r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.voiceselection.ae.<init>(com.google.android.apps.gsa.assistant.settings.features.voiceselection.ag):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.voiceselection.C73520ae.<init>(com.google.android.apps.gsa.assistant.settings.features.voiceselection.ag):void");
    }

    public final void run() {
        C58976aa aaVar = C58975e.f156826a;
        an anVar = this.f194536a.h;
        anVar.getClass();
        Snackbar.m79660p(anVar, R.string.assistant_settings_voice_selection_play_audio_error_message, -1);
    }
}
