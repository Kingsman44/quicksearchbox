package com.google.android.apps.gsa.location;

import android.os.Parcelable;
import com.google.android.apps.gsa.location.ImproveLocationRequest;

/*  JADX ERROR: NullPointerException in pass: ClassModifier
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.collectAllInsns(BlockUtils.java:574)
    	at jadx.core.dex.visitors.ClassModifier.removeBridgeMethod(ClassModifier.java:220)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticMethods(ClassModifier.java:151)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
/* renamed from: com.google.android.apps.gsa.location.ac */
/* compiled from: PG */
final class C74636ac implements Parcelable.Creator {
    public C74636ac() {
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.location.ac.createFromParcel(android.os.Parcel):java.lang.Object, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.location.ac.createFromParcel(android.os.Parcel):java.lang.Object, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.location.C74636ac.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ImproveLocationRequest.ImproveLocationDialogMetrics[i];
    }
}
