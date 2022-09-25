package android.support.p033v7.app;

import android.support.p033v7.view.C0435c;
import android.support.p033v7.view.C0438f;
import android.support.p033v7.view.C0445m;
import android.support.p033v7.view.C0487n;
import android.support.p033v7.view.C0489p;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.C0750jd;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* renamed from: android.support.v7.app.ai */
/* compiled from: PG */
final class C0348ai extends C0489p {

    /* renamed from: a */
    public boolean f1142a;

    /* renamed from: b */
    public boolean f1143b;

    /* renamed from: c */
    final /* synthetic */ C0356aq f1144c;

    /* renamed from: d */
    public C0371be f1145d;

    /* renamed from: f */
    private boolean f1146f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0348ai(C0356aq aqVar, Window.Callback callback) {
        super(callback);
        this.f1144c = aqVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo1128a(Window.Callback callback) {
        try {
            this.f1146f = true;
            callback.onContentChanged();
            this.f1146f = false;
        } catch (Throwable th) {
            this.f1146f = false;
            throw th;
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f1142a) {
            return this.f1718e.dispatchKeyEvent(keyEvent);
        }
        return this.f1144c.mo1166S(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            C0356aq aqVar = this.f1144c;
            int keyCode = keyEvent.getKeyCode();
            aqVar.mo1163P();
            C0383d dVar = aqVar.f1215o;
            if (dVar == null || !dVar.mo1250u(keyCode, keyEvent)) {
                C0354ao aoVar = aqVar.f1180E;
                if (aoVar == null || !aqVar.mo1174ab(aoVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (aqVar.f1180E == null) {
                        C0354ao aa = aqVar.mo1173aa(0);
                        aqVar.mo1169V(aa, keyEvent);
                        boolean ab = aqVar.mo1174ab(aa, keyEvent.getKeyCode(), keyEvent);
                        aa.f1165k = false;
                        if (!ab) {
                            return false;
                        }
                    }
                    return false;
                }
                C0354ao aoVar2 = aqVar.f1180E;
                if (aoVar2 != null) {
                    aoVar2.f1166l = true;
                }
            }
        }
        return true;
    }

    public final void onContentChanged() {
        if (this.f1146f) {
            this.f1718e.onContentChanged();
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof C0477q)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public final View onCreatePanelView(int i) {
        View view;
        int i2;
        C0371be beVar = this.f1145d;
        if (beVar != null) {
            if (i == 0) {
                view = new View(((C0750jd) beVar.f1245a.f1246a).f2614a.getContext());
                i2 = 0;
            } else {
                i2 = i;
                view = null;
            }
            if (view != null) {
                return view;
            }
            i = i2;
        }
        return super.onCreatePanelView(i);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        C0356aq aqVar = this.f1144c;
        if (i == 108) {
            aqVar.mo1163P();
            C0383d dVar = aqVar.f1215o;
            if (dVar != null) {
                dVar.mo1235f(true);
            }
        }
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
        if (this.f1143b) {
            this.f1718e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        C0356aq aqVar = this.f1144c;
        if (i == 108) {
            aqVar.mo1163P();
            C0383d dVar = aqVar.f1215o;
            if (dVar != null) {
                dVar.mo1235f(false);
            }
        } else if (i == 0) {
            C0354ao aa = aqVar.mo1173aa(0);
            if (aa.f1167m) {
                aqVar.mo1159L(aa, false);
            }
        }
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C0477q qVar = menu instanceof C0477q ? (C0477q) menu : null;
        if (i == 0) {
            if (qVar == null) {
                return false;
            }
            i = 0;
        }
        if (qVar != null) {
            qVar.f1661l = true;
        }
        C0371be beVar = this.f1145d;
        if (beVar != null && i == 0) {
            C0372bf bfVar = beVar.f1245a;
            if (!bfVar.f1248c) {
                ((C0750jd) bfVar.f1246a).f2620g = true;
                bfVar.f1248c = true;
            }
            i = 0;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (qVar != null) {
            qVar.f1661l = false;
        }
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C0477q qVar = this.f1144c.mo1173aa(0).f1162h;
        if (qVar != null) {
            C0487n.m1664a(this.f1718e, list, qVar, i);
        } else {
            C0487n.m1664a(this.f1718e, list, menu, i);
        }
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        C0396q qVar;
        C0356aq aqVar = this.f1144c;
        if (!aqVar.f1223w || i != 0) {
            return C0445m.m1451a(this.f1718e, callback, i);
        }
        C0438f fVar = new C0438f(aqVar.f1212l, callback);
        C0356aq aqVar2 = this.f1144c;
        C0435c cVar = aqVar2.f1218r;
        if (cVar != null) {
            cVar.mo1263f();
        }
        C0344ae aeVar = new C0344ae(aqVar2, fVar);
        aqVar2.mo1163P();
        C0383d dVar = aqVar2.f1215o;
        if (dVar != null) {
            aqVar2.f1218r = dVar.mo1286d(aeVar);
            if (!(aqVar2.f1218r == null || (qVar = aqVar2.f1214n) == null)) {
                qVar.mo1208r();
            }
        }
        if (aqVar2.f1218r == null) {
            aqVar2.f1218r = aqVar2.mo1155H(aeVar);
        }
        aqVar2.mo1165R();
        C0435c cVar2 = aqVar2.f1218r;
        if (cVar2 != null) {
            return fVar.mo1409e(cVar2);
        }
        return null;
    }
}
