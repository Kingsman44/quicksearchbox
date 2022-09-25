package com.google.knowledge.cerebra.sense.textclassifier.p4674a.p4676b;

import android.os.Bundle;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.NamedVariant;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.a.b.c */
/* compiled from: PG */
public final class C61839c {
    /* renamed from: a */
    public static Bundle m94490a(NamedVariant[] namedVariantArr) {
        if (namedVariantArr == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (NamedVariant namedVariant : namedVariantArr) {
            if (namedVariant != null) {
                switch (namedVariant.f167210b) {
                    case 1:
                        bundle.putInt(namedVariant.f167209a, namedVariant.f167211c);
                        break;
                    case 2:
                        bundle.putLong(namedVariant.f167209a, namedVariant.f167212d);
                        break;
                    case 3:
                        bundle.putFloat(namedVariant.f167209a, namedVariant.f167213e);
                        break;
                    case 4:
                        bundle.putDouble(namedVariant.f167209a, namedVariant.f167214f);
                        break;
                    case 5:
                        bundle.putBoolean(namedVariant.f167209a, namedVariant.f167215g);
                        break;
                    case 6:
                        bundle.putString(namedVariant.f167209a, namedVariant.f167216h);
                        break;
                    case 7:
                        bundle.putStringArray(namedVariant.f167209a, namedVariant.f167217i);
                        break;
                    case 8:
                        bundle.putFloatArray(namedVariant.f167209a, namedVariant.f167218j);
                        break;
                    case 9:
                        bundle.putIntArray(namedVariant.f167209a, namedVariant.f167219k);
                        break;
                    default:
                        bundle.putBundle(namedVariant.f167209a, m94490a(namedVariant.f167220l));
                        break;
                }
            }
        }
        return bundle;
    }
}
