package com.google.android.apps.gsa.assistant.settings.features.p5708ay;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.preference.C3998ax;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.gsa.assistant.settings.features.at.a.e;
import com.google.android.googlequicksearchbox.R;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ay.a */
/* compiled from: PG */
final class C72938a extends SwitchPreferenceCompat {

    /* renamed from: c */
    public Boolean f193565c;

    /* renamed from: d */
    private final int f193566d;

    /* renamed from: e */
    private e f193567e;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.ay.a.<init>(android.content.Context):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C72938a(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.ay.a.<init>(android.content.Context):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.p5708ay.C72938a.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        axVar.itemView.setElevation(this.f12738j.getResources().getDimension(R.dimen.assistant_settings_photosvideos_item_elevation));
        ImageView imageView = (ImageView) axVar.itemView.findViewById(16908294);
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = this.f193566d;
            layoutParams.height = this.f193566d;
            imageView.setLayoutParams(layoutParams);
        }
        if (this.f193565c.booleanValue()) {
            e eVar = new e(axVar.itemView);
            this.f193567e = eVar;
            eVar.a();
        }
    }
}
