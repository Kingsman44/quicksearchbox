package android.support.p031v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.app.C1819f;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2393x;
import androidx.p124l.p125a.C2305b;
import androidx.p124l.p125a.C2310g;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.am */
/* compiled from: PG */
public class C0167am extends ComponentActivity implements C1819f {

    /* renamed from: a */
    public final C0172ar f727a = C0172ar.m374b(new C0166al(this));

    /* renamed from: b */
    final C2393x f728b = new C2393x(this);

    /* renamed from: c */
    boolean f729c;

    /* renamed from: d */
    boolean f730d;

    /* renamed from: e */
    boolean f731e = true;

    public C0167am() {
        m362fV();
    }

    /* renamed from: fV */
    private final void m362fV() {
        this.f2706g.f13082a.mo8585b("android:support:lifecycle", new C0164aj(this));
        this.f2705f.mo3343a(new C0165ak(this));
    }

    /* renamed from: k */
    private static boolean m363k(FragmentManager fragmentManager, C2383n nVar) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.f634a.mo677i()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= m363k(fragment.getChildFragmentManager(), nVar);
                }
                C0223co coVar = fragment.mViewLifecycleOwner;
                if (coVar != null) {
                    coVar.mo726a();
                    if (coVar.f844a.f6612c.mo5788a(C2383n.STARTED)) {
                        fragment.mViewLifecycleOwner.f844a.mo5795g(nVar);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f6612c.mo5788a(C2383n.STARTED)) {
                    fragment.mLifecycleRegistry.mo5795g(nVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String concat = String.valueOf(str).concat("  ");
        printWriter.print(concat);
        printWriter.print("mCreated=");
        printWriter.print(this.f729c);
        printWriter.print(" mResumed=");
        printWriter.print(this.f730d);
        printWriter.print(" mStopped=");
        printWriter.print(this.f731e);
        if (getApplication() != null) {
            ((C2310g) C2305b.m6238a(this)).f6463b.mo5685b(concat, printWriter);
        }
        this.f727a.f739a.f744e.mo436C(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    /* renamed from: fQ */
    public void mo541fQ() {
        invalidateOptionsMenu();
    }

    @Deprecated
    /* renamed from: g */
    public final void mo542g() {
    }

    @Deprecated
    /* renamed from: h */
    public void mo543h() {
    }

    /* renamed from: hS */
    public void mo544hS(Fragment fragment, Intent intent) {
        fragment.startActivityForResult(intent, 66, (Bundle) null);
    }

    /* renamed from: jw */
    public FragmentManager mo545jw() {
        return this.f727a.f739a.f744e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jx */
    public final void mo546jx() {
        do {
        } while (m363k(mo545jw(), C2383n.CREATED));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f727a.mo583n();
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f727a.mo583n();
        super.onConfigurationChanged(configuration);
        this.f727a.mo575f(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f728b.mo5793e(C2382m.ON_CREATE);
        this.f727a.mo576g();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(0, menu);
        C0172ar arVar = this.f727a;
        return onCreatePanelMenu | arVar.f739a.f744e.mo456W(menu, getMenuInflater());
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c = this.f727a.mo572c(view, str, context, attributeSet);
        return c == null ? super.onCreateView(view, str, context, attributeSet) : c;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f727a.mo577h();
        this.f728b.mo5793e(C2382m.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f727a.mo578i();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f727a.f739a.f744e.mo457X(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f727a.f739a.f744e.mo455V(menuItem);
    }

    public final void onMultiWindowModeChanged(boolean z) {
        this.f727a.f739a.f744e.mo488t(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        this.f727a.mo583n();
        super.onNewIntent(intent);
    }

    public final void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f727a.f739a.f744e.mo491v(menu);
            i = 0;
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f730d = false;
        this.f727a.mo579j();
        this.f728b.mo5793e(C2382m.ON_PAUSE);
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        this.f727a.f739a.f744e.mo493x(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f728b.mo5793e(C2382m.ON_RESUME);
        this.f727a.mo580k();
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | this.f727a.f739a.f744e.mo458Y(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f727a.mo583n();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f727a.mo583n();
        super.onResume();
        this.f730d = true;
        this.f727a.mo585p();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.f727a.mo583n();
        super.onStart();
        this.f731e = false;
        if (!this.f729c) {
            this.f729c = true;
            this.f727a.mo574e();
        }
        this.f727a.mo585p();
        this.f728b.mo5793e(C2382m.ON_START);
        this.f727a.mo581l();
    }

    public final void onStateNotSaved() {
        this.f727a.mo583n();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f731e = true;
        mo546jx();
        this.f727a.mo582m();
        this.f728b.mo5793e(C2382m.ON_STOP);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View c = this.f727a.mo572c((View) null, str, context, attributeSet);
        return c == null ? super.onCreateView(str, context, attributeSet) : c;
    }

    public C0167am(int i) {
        super(i);
        m362fV();
    }
}
