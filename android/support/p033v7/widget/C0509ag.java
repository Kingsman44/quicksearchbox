package android.support.p033v7.widget;

import android.content.res.TypedArray;
import android.support.p033v7.p034a.C0338a;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.core.p097i.C1974i;
import androidx.p111g.p112a.C2253a;
import androidx.p111g.p113b.C2258a;
import androidx.p111g.p113b.C2260c;
import androidx.p111g.p113b.C2263f;
import androidx.p111g.p113b.C2268k;

/* renamed from: android.support.v7.widget.ag */
/* compiled from: PG */
final class C0509ag {

    /* renamed from: a */
    public final C2260c f2053a;

    /* renamed from: b */
    private final EditText f2054b;

    public C0509ag(EditText editText) {
        this.f2054b = editText;
        this.f2053a = new C2260c(editText);
    }

    /* renamed from: b */
    static final boolean m1903b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* renamed from: c */
    static final KeyListener m1904c(KeyListener keyListener) {
        if (!m1903b(keyListener) || (keyListener instanceof C2263f)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return !(keyListener instanceof NumberKeyListener) ? new C2263f(keyListener) : keyListener;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2495a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f2054b.getContext().obtainStyledAttributes(attributeSet, C0338a.f1073i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            C2268k kVar = ((C2258a) this.f2053a.f6351a).f6350b;
            if (kVar.f6360a != z) {
                kVar.f6360a = z;
                if (z) {
                    synchronized (C2253a.f6343a) {
                        C2253a aVar = C2253a.f6344b;
                        C1974i.m5315c(false, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                    }
                    throw null;
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
